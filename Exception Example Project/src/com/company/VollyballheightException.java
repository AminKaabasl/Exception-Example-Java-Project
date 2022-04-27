package com.company;

public class VollyballheightException extends Exception {

    public VollyballheightException(){
        super("Access denied - You must be at least 170 cm.");
    }

    public VollyballheightException(String messege){
        super(messege);
    }
}
