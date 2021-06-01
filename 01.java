package com.company;

class student{
    public String name;
    public int age;
    public char sec;
    public student(String n, int a, char s){
        name = n;
        age = a;
        sec = s;
    }
    public void printfull(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(sec);
    }
}
public class Main {
    public static void main(String[] args) {
       student s1 = new student("Nesar Ahmed", 20, 'D');
       s1.printfull();
    }
}
