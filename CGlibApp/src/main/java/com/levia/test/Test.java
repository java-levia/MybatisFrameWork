package com.levia.test;

import com.levia.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    //初始化spring
    AnnotationConfigApplicationContext annotationConfigApplicationContext
            = new AnnotationConfigApplicationContext(AppConfig.class);
}
