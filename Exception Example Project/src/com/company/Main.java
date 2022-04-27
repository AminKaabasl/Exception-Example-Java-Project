package com.company;

//Mohammad Amin Kaabasl - 9973146
//Exception example project

public class Main {

    public static void main(String[] args){
        int height = 150;

        try {

            if (height < 170) {
                throw new VollyballheightException();//you can write the messege inside the () ether!!
            }
            else {
                System.out.println("Access granted - Your height is long enough");
            }

        } catch (VollyballheightException e) {
            System.out.println(e.getMessage());
        }
    }
}