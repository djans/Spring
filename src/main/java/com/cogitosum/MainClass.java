package com.cogitosum;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class MainClass {
   public static void main(String[] args){
      SpringApplication.run(MainClass.class, args);
   }
   @Bean
   public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
      return args -> {

         System.out.println("Let's inspect the beans provided by Spring Boot 23432433:");

         String[] beanNames = ctx.getBeanDefinitionNames();
         Arrays.sort(beanNames);
         for (String beanName : beanNames) {
            System.out.println(beanName);
         }

      };
   }
}
