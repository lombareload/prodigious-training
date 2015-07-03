package com.prodigious.groovy.training

import com.prodigious.java.training.MessageHelper
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.*

@Configuration
class GTest {
    String name
    String type

    String toString(){
        "{name: $name, type: $type}"
    }

    static void main(args){
        println('GROOVY MAIN!!')
        ApplicationContext context = new AnnotationConfigApplicationContext(GTest)
        context.getBean(MessageHelper)
    }
}
