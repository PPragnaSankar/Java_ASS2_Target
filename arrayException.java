package com.target;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayException {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
       try{
           Scanner s=new Scanner(System.in);
           System.out.println("Enter the index");
           int index=s.nextInt();
           System.out.println(arr[index]);
       }catch (Exception e){
           System.out.println(e);
       }finally {
          arr=new int[]{arr.length};
       }
    }
}
