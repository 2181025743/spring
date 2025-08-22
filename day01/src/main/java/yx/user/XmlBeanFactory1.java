package yx.user;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

public class XmlBeanFactory1 {

    public static Object getBean(String fileName, String id) {
        try {
            SAXReader reader = new SAXReader();
            InputStream in = XmlBeanFactory1.class.getClassLoader().getResourceAsStream(fileName);
            Document doc = reader.read(in);

            Element root = doc.getRootElement();
            System.out.println("根元素名称: " + root.getName());

            List<Element> beans = root.elements("bean");
            System.out.println("bean元素数量: " + beans.size());

            for (Element bean : beans) {
                String beanId = bean.attributeValue("id");
                if (id.equals(beanId)) {
                    String className = bean.attributeValue("class");
                    Class<?> clazz = Class.forName(className);
                    List<Element> property = bean.elements("property");
                    // 创建类的实例
                    Object instance = clazz.getDeclaredConstructor().newInstance();
                    if (property.size() > 0) {
                        for (Element element : property) {
                            String name = element.attributeValue("name");
                            String value = element.attributeValue("value");
                            Field declaredField = clazz.getDeclaredField(name);
                            declaredField.setAccessible(true);
                            // 将值设置到实例上，而不是Class对象上
                            declaredField.set(instance, value);
                        }
                    }
                    return instance;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 测试方法
    public static void main(String[] args) {
        Object bean = getBean("bean.xml", "userDao");
        if (bean != null) {
            System.out.println("创建的对象: " + bean.getClass().getName());
            System.out.println((Boy) bean);
        }
    }
}