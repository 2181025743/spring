package yx.model;

public class LibraryManger {
    private String name;
    private BookPermit permit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookPermit getPermit() {
        return permit;
    }

    public void setPermit(BookPermit permit) {
        this.permit = permit;
    }

    public void getBook() {
        String book = "《三国演义》";
        if ("红色".equals(permit.getColor())) {
            if ("A".equals(permit.getLevel())) book = "《Java基础图书》";
            else if ("B".equals(permit.getLevel())) book = "《HTML》";
        } else if ("蓝色".equals(permit.getColor())) {
            if ("A".equals(permit.getLevel())) book = "《Oracle数据库》";
        }
        System.out.println(name + " 持有 " + permit + "，获取《" + book + "》");
    }
}