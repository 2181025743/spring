package yx;

public class SunWukongProxy implements CuiLan {
    private CuiLan cuiLan;

    public SunWukongProxy(CuiLan cuiLan) {
        this.cuiLan = cuiLan;
    }

    @Override
    public void attractBajie() {
        System.out.println("孙悟空变成高翠兰");
        cuiLan.attractBajie();
        fightWithBajie();
        catchBajie();
    }

    private void fightWithBajie() {
        System.out.println("孙悟空和猪八戒战斗");
    }

    private void catchBajie() {
        System.out.println("孙悟空抓住猪八戒");
    }
}
