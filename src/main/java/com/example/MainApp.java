package com.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDAO userDAO = context.getBean("userDAO", UserDAO.class);
        System.out.println(userDAO instanceof UserDAO);
        System.out.println(userDAO.getClass());

        userDAO.addUser();

        userDAO.setX(1);

        context.close();
    }
}
