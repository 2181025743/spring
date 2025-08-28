// DoubleToBigDecimalConverter.java
package yx.converter;

import org.springframework.core.convert.converter.Converter;

import java.math.BigDecimal;

public class DoubleToBigDecimalConverter implements Converter<String, BigDecimal> {

    @Override
    public BigDecimal convert(String source) {
        try {
            Double d = Double.parseDouble(source);
            return BigDecimal.valueOf(d);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("无法将字符串转换为BigDecimal: " + source);
        }
    }
}