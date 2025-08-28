package yx;

public class Test {
    public static void main(String[] args) {
        GaoCuiLan gaoCuiLan = new GaoCuiLan();
        SunWukongProxy sunWukongProxy = new SunWukongProxy(gaoCuiLan);
        sunWukongProxy.attractBajie();
    }
}
