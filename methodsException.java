package com.target;

public class methodsException {
    static void method1() throws customexception{
        try{
            method2();
        }catch (Exception e){
            throw new customexception();
        }
    }
    static void method2(){
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        try{
            method1();
        }catch (customexception e){
            System.out.println(e);
        }
    }
}
