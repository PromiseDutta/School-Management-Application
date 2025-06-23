package com.eazybytes.eazyschool.model;



import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class BeanLister implements CommandLineRunner {

    private final ApplicationContext applicationContext;

    public BeanLister(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) {
        System.out.println("---- Listing all Spring Beans ----");
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        Arrays.sort(beanNames); // optional
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
    
    
    
    
}

