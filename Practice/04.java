package com.company;

class shop{
    private String email;
    private String cell_no;
    private String address;

    private customer shop_customer;
    private outlet shop_outlet;

    public shop(String email, String cell_no, String address, customer shop_customer, outlet shop_outlet) {
        this.email = email;
        this.cell_no = cell_no;
        this.address = address;
        this.shop_customer = shop_customer;
        this.shop_outlet = shop_outlet;
    }

    public void printer(){
        System.out.println(email);
        System.out.println(cell_no);
        System.out.println(address);
        shop_customer.printer();
        shop_outlet.printer();
    }
}

class customer{
    private String name;
    private String email;
    private String cell_no;

    public customer(String name, String email, String cell_no) {
        this.name = name;
        this.email = email;
        this.cell_no = cell_no;
    }
    public void printer(){
        System.out.println(name);
        System.out.println(email);
        System.out.println(cell_no);
    }
}

class display{
    private int total;

    public display(int total) {
        this.total = total;
    }
    public void printer(){
        System.out.println(total);
    }
}

class product{
    private String name;

    public product(String name) {
        this.name = name;
    }

    public void printer(){
        System.out.println(name);
    }
}

class outlet{
    private display outlet_display;
    private product outlet_product;

    public outlet(display outlet_display, product outlet_product) {
        this.outlet_display = outlet_display;
        this.outlet_product = outlet_product;
    }

    public void printer(){
        outlet_display.printer();
        outlet_product.printer();
    }
}

public class Main {
    public static void main(String[] args) {
        customer main_customer = new customer("Nesar Ahmed", "nadim@mail.com", "01628871060");
        display main_display = new display(50);
        product main_product = new product("Gun");
        outlet main_outlet = new outlet(main_display, main_product);
        shop agora = new shop("agora@mail.com", "9671", "Goran", main_customer, main_outlet);
        agora.printer();
    }
}
