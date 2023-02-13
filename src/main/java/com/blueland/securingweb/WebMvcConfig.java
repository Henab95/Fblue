package com.blueland.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/access-denied").setViewName("access-denied");
        registry.addViewController("/").setViewName("homepage");
        registry.addViewController("/aboutus").setViewName("aboutus");
        registry.addViewController("/student").setViewName("student");
        registry.addViewController("/stulogin").setViewName("stulogin");
    }
}
