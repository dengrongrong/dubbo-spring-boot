package com.dr;

import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.dr.config.DubboConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@SpringBootApplication
@DubboComponentScan(basePackages="com.dr.service")
public class ProviderApp {

    public static void main(String[] args)throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DubboConfig.class);
        ctx.start();
        System.out.println("Provider start...");

        System.in.read();
    }
}
