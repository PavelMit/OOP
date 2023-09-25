package ru.gb.vending_machine2;

public class BottleOfMilk extends Product{
    private double volume;
    private double fat;

    public BottleOfMilk(String brand, String name, double price, double volume, double fat ) {
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    String displayinfo(){
        return String.format("[МОЛОКО]Брэнд - %s, Продукт - %s, Цена - %.2f, объем - %.2f, жирность - %.2f", brand, name, price, volume, fat);
    }
}
