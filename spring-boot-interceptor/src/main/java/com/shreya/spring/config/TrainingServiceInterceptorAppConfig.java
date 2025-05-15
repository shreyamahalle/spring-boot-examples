package com.shreya.spring.config;

import com.shreya.spring.interceptor.TrainingServiceInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

    @Component
    public class TrainingServiceInterceptorAppConfig implements WebMvcConfigurer {
        @Autowired
        TrainingServiceInterceptor trainingServiceInterceptor;

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(trainingServiceInterceptor);
        }
    }

