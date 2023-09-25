package ru.gb.vending_machine2;
//Создать новый продукт на основе Product, создать ему хотя бы одно свойство
// (например, шоколад -> калории) и включить в список продуктов в вендинг машину.
// Продемонстрировать работу класса по продаже товаров (как мы это делали на семинаре).
public class Chips extends Product {
    private int weight;
    private int kiloCal;

    public Chips(String brand, String name, double price, int weight, int kiloCal) {
        super(brand, name, price);
        this.weight = weight;
        this.kiloCal = kiloCal;
    }
    @Override
    String displayinfo(){
        return String.format("[ЧИПСЫ]Брэнд - %s, Продукт - %s, Цена - %.2f, вес - %d, каллорийность - %d", brand, name, price, weight, kiloCal);
    }
}
