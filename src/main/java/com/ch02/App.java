package com.ch02;

import com.ch02.config.AppConfig;
import com.ch02.sub1.Greeting;
import com.ch02.sub1.Hello;
import com.ch02.sub1.Welcome;
import com.ch02.sub2.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 날짜 : 2024.09.02
 * 이름 : 이상훈
 * 내용 : 2장 Spring Ioc/DI 실습하기
 *
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Hello hello  = context.getBean(Hello.class);
        Welcome welcome = context.getBean(Welcome.class);
        Greeting greeting = context.getBean(Greeting.class);
        hello.show();
        welcome.show();
        greeting.show();

        Computer com = (Computer) context.getBean("com");
        com.show();


    }
}
