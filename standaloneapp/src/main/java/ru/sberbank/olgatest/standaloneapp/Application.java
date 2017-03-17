package ru.sberbank.olgatest.standaloneapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ru.sberbank.olgatest.dao.InquiryDao;
import ru.sberbank.olgatest.entities.Inquiry;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        InquiryDao inquiryDao = applicationContext.getBean(InquiryDao.class);
        Inquiry inquiry = inquiryDao.getInquiry(123L);
        System.out.println(inquiry);

    }

    @Configuration
    @ComponentScan("ru.sberbank.olgatest")
    static class ApplicationConfig {

    }
}
