package com.ridham.mylibrary;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {

        ArrayList<Stu> s1 = new ArrayList<>();
        s1.add(new Stu(1,"ridham"));
        s1.add(new Stu(2,"ridham"));
        s1.add(new Stu(3,"tiya"));
        s1.add(new Stu(4,"ziya"));
        s1.add(new Stu(5,"abhi"));
        s1.add(new Stu(6,"raj"));

        s1.sort((a,b) -> {
            if(a.name.equals(b.name)){
                return b.id-a.id;
            }
            return b.name.compareTo(a.name);
        });


        for(int i=0;i<s1.size();i++){
            System.out.println(s1.get(i).id+" "+s1.get(i).name);
        }



    }
}

class Stu
{
    int id;
    String name;

    public Stu(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
