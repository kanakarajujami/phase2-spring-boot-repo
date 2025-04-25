package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.nt") search from parent package
@ComponentScan(basePackageClasses =com.nt.pojo.Student.class) //using class name
public class StudentConfig {

}
