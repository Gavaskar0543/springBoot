package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Alian {
    private int alianId;
     private  String planent;

    public void setAlianId(int alianId) {
        this.alianId = alianId;
    }
    public void setPlanent(String planent) {
        this.planent = planent;
    }
    public int getAlianId() {
        return alianId;
    }
    public String getPlanent() {
        return planent;
    }

    public void rocketEngine(){
        System.out.println("Engine Started...!..Good to Go");
    }
    
   

    
}
