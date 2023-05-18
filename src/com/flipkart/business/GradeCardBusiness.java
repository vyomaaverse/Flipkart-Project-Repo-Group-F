package com.flipkart.business;

import com.flipkart.bean.GradeCard;

public class GradeCardBusiness extends GradeCard {
    public void createGradeCard(){
        System.out.println("create grade card here");
    }

    public double calculateCPI(){
        System.out.println("calculate cpi here");
        return 10.0;
    }
}
