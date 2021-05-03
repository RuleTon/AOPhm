package com.example;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppLoggingAspect {


   @Before("execution(public void com.example.UserDAO.addUser())") // pointcut expression
    public void beforeAddUserInUserDAOClass() {
       System.out.println("AOP: Поймали добавление пользователя");
   }

   @Before("execution(public void com.example.UserDAO.*User())") // pointcut expression
   public void beforeUserModifyInUserDAOClass() {
       System.out.println("AOP: работа с пользователем в UserDAO");
   }

}
