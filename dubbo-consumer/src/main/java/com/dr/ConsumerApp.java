package com.dr;

import com.dr.config.DubboConfig;
import com.dr.service.RemoteService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class ConsumerApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(DubboConfig.class);
        context.start();
        RemoteService service = (RemoteService) context.getBean("remoteService");
        boolean isFind = service.checkAbility(76,88,false);

        if(isFind){
            System.out.println("恭喜你通过本公司的重重考验！");
        }else{
            System.out.println("很抱歉您未能通过本次考核，祝您早日找到合适的工作!");
        }
    }
}
