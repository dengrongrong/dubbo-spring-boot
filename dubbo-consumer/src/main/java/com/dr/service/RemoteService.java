package com.dr.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dr.FindJob;
import org.springframework.stereotype.Component;

@Component("remoteService")
public class RemoteService implements FindJob {

    @Reference
    public  FindJob findJob;


    @Override
    public boolean checkAbility(double interViewScore, double textScore, boolean specialSkill) {
        if(findJob==null){
            System.out.println("没有...");
            return false;
        }
        System.out.println("findJob=======>"+findJob.getClass());
        return findJob.checkAbility(interViewScore,textScore,specialSkill);
    }
}
