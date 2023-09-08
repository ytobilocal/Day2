package org.example.beanlifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifeAnnotation {

    @PostConstruct
    public void init(){
        System.out.println("Call method init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Close Container and call method destroy()");
    }
}
