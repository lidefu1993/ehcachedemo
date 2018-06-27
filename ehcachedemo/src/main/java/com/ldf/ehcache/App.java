package com.ldf.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by ldf on 2018/6/26.
 */
@SpringBootApplication
@EnableCaching
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}
