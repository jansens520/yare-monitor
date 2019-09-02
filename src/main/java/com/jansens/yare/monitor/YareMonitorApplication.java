package com.jansens.yare.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@EnableAdminServer
@SpringBootApplication
public class YareMonitorApplication {
    public static void main(String[] args){
        SpringApplication.run(YareMonitorApplication.class,args);
    }
}
