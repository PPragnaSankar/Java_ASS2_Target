package com.target;

public class customexception extends Exception {
    customexception(){
        super("Custom Exception");
        System.out.println("Custom Exception");
    }
}
