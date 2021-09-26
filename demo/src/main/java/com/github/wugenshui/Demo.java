package com.github.wugenshui;

//import com.github.wugenshui.common.MyUtil;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author : chenbo
 * @date : 2021-09-25
 */
public class Demo {
    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        System.out.println(bf);

//        System.out.println(MyUtil.add(1, 2));
        System.out.println("demo");
    }
}
