package com.company;

class vehicle{
    public String name;
    public String model;

    public vehicle(String n, String m){
        name = n;
        model = m;
    }
    public void print_full(){
        System.out.println(name+' '+model);
    }
}

public class Main {
    public static void main(String[] args) {
       vehicle v1 = new vehicle("Toyota", "Avalon");
       v1.print_full();
    }
}
