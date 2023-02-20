package com.ridham.mylibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {


        Integer[] mark = {5,10,15,90,2,89,45};
        ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(mark));

        marks.sort((a,b)->
            a-b
        );

        System.out.println(marks);

        for(int i=0;i<marks.size();i++){
            System.out.print(marks.get(i)+" ");
        }
    }
}
