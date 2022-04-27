package com.company;

//Mohammad Amin Kaabasl - 9973146
//Exception example project

public class Main {

    static void VollyballheightException(int height) throws Exception {

        if (height < 170) {

            throw new Exception("Access denied - You must be at least 170 cm."); //Exception for lower 170 height
        }
        else {

            System.out.println("Access granted - Your height is long enough");
        }
    }

    public static void main(String[] args) throws Exception {

        VollyballheightException(150); // Set height to 150 (which is below 170 cm)

    }
}