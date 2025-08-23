package yx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yx.model.LibraryManger;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
        LibraryManger r1 = context.getBean("reader1", LibraryManger.class);
        LibraryManger r2 = context.getBean("reader2", LibraryManger.class);
        LibraryManger r3 = context.getBean("reader3", LibraryManger.class);
        LibraryManger r4 = context.getBean("reader4", LibraryManger.class);
        r1.getBook();
        r2.getBook();
        r3.getBook();
        r4.getBook();
    }
}
