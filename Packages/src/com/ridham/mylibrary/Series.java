package com.ridham.mylibrary;
public class Series {


    public static long nSum(int n){
        return n*(n+1)/2;
    }

    public static long factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
}
