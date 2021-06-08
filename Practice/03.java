package com.company;

class cell_phone{
    private String model;
    private display cell_display;
    private battery cell_battery;

    public cell_phone(String model, display cell_display, battery cell_battery) {
        this.model = model;
        this.cell_display = cell_display;
        this.cell_battery = cell_battery;
    }

    public void printer(){
        System.out.println(model);
        cell_display.printer();
        cell_battery.printer();
    }
}

class display{
    private String resolution;
    private String panel;

    public display(String resolution, String panel) {
        this.resolution = resolution;
        this.panel = panel;
    }

    public void printer(){
        System.out.println(resolution);
    }
}

class battery{
    private String power_pack;

    public battery(String power_pack) {
        this.power_pack = power_pack;
    }

    public void printer(){
        System.out.println(power_pack);
    }
}

public class Main {
    public static void main(String[] args) {
        display main_display = new display("720p", "LCD");
        battery main_battery = new battery("4080mh");
        cell_phone main_cell_phone = new cell_phone("Nokia N75", main_display, main_battery);
        main_cell_phone.printer();
    }
}
