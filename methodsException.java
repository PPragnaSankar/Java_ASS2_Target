package com.target;

public class methodsException {
    static void method1() throws customException{
        try{
            method2();
        }catch (Exception e){
            throw new customException();
        }
    }
    static void method2(){
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        try{
            method1();
        }catch (customException e){
            System.out.println(e);
        }
    }
}
