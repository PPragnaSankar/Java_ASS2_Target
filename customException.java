package com.target;

public class customException extends Exception {
    customException(){
        super("Custom Exception");
        System.out.println("Custom Exception");
    }
}
