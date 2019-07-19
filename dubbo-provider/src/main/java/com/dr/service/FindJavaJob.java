package com.dr.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dr.FindJob;

@Service
public class FindJavaJob implements FindJob {

    @Override
    public boolean checkAbility(double interViewScore, double textScore, boolean specialSkill) {
        if(specialSkill)
            return true;
        if(interViewScore<60&&interViewScore>30){
            if(textScore>95)
                return true;
        }
        if(interViewScore>70&&interViewScore<85){
            if(textScore>75)
                return true;
        }
        if(interViewScore>95){
            if(textScore>55)
                return true;
        }
        return false;
    }
}
