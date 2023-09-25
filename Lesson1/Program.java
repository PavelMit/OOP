package ru.gb.vending_machine2;

public class Program{
    public static void main(String[] args) {

        Product product1 = new Product("Бутылка с водой");

//        product1.name = "Бутылка с водой";
//        product1.brand = "Источник";
//        product1.price = 210;
//        product1.setName("Бутылка просто");
        System.out.println(product1.displayinfo());
        Product product2 = new Product();
        System.out.println(product2.displayinfo());
        Product product3 = new Product("Бутылка с водой2");
        System.out.println(product3.displayinfo());

        Chips chips1 = new Chips("Lays", "Max", 150, 40, 50);
        System.out.println(chips1.displayinfo());



//        BottleOfMilk bottleOfMilk = new BottleOfMilk("Milka", "Milk", 110, 0.5,5.5);
//        System.out.println(bottleOfMilk.displayinfo());


    }
}