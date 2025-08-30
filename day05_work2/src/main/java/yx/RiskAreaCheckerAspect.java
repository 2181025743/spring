package yx;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.List;

@Aspect
@Component
@Order(1)
public class RiskAreaCheckerAspect {

    // 从配置文件中注入高风险区域
    @Value("#{'${high.risk.areas}'.split(',')}")
    private List<String> highRiskAreas;

    @Around("execution(* yx.TravelService.travel(..))")
    public Object checkRiskArea(ProceedingJoinPoint pjp) throws Throwable {
        // 拿到方法参数
        Object[] args = pjp.getArgs();
        if (args.length == 0 || !(args[0] instanceof UserTravelInfo)) {
            return pjp.proceed(); // 参数不合预期，直接执行方法
        }

        UserTravelInfo info = (UserTravelInfo) args[0];
        String username = info.getUsername();
        String from = info.getFrom();
        String to = info.getTo();

        if (highRiskAreas.contains(from)) {
            System.out.println("出行禁止！[" + from + "] 属于高风险区域！");
            return null;
        }

        if (highRiskAreas.contains(to)) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("risk-log.log", true))) {
                writer.write("【高风险目的地出行记录】");
                writer.newLine();
                writer.write("用户：" + username);
                writer.newLine();
                writer.write("出发地：" + from + "，目的地：" + to);
                writer.newLine();
                writer.write("出发时间：" + LocalDateTime.now());
                writer.newLine();
                writer.write("----------------------------------");
                writer.newLine();
            }
        }

        // 满足条件，调用原方法
        return pjp.proceed();
    }
}