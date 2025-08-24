package yx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yx.entity.Team;
import yx.service.ServiceImpl;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        ServiceImpl teamService = context.getBean(ServiceImpl.class);

        Team team = new Team(0, "猛龙队", "多伦多");
        teamService.registerTeam(team);

        teamService.removeTeam(0);
    }
}
