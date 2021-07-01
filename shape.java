package com.target;

public class shape {
    int length;
    int width;

    shape(int l, int w) {
        length = l;
        width = w;
    }

    boolean isSquare(){
        if (length != width) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        shape s1=new shape(2,3);
        if(!s1.isSquare()){
            throw new NotASquareException("Not a square");
        }
    }
}
