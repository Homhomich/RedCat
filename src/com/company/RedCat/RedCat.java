package com.company.RedCat;

import com.company.Animal.Animal;
import com.company.Animal.AnimalType;
import com.company.Animal.Cat;
import com.company.RedCat.Clothes.Clothes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// рыжая кошка наследуется от абстрактного класса Cat, который в свою очередь реализует интерфейс Animal

public class RedCat extends Cat {

    private String name;
    private List<Clothes> clothes;  /* суперкласс позволяет нам добавить в список любой вид одежды
     в данном случае полиморфизм в том, что нам необязательно знать тип одежды
     ведь мы знаем главного родителя - это и есть класс Clothes
    */

    public RedCat(String name) {
        this.name = name;
        clothes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addClothes(Clothes c) {
        clothes.add(c);
    }

    public String aboutCat() {
        return "My name is " + name;
    }

    /*
       полиморфизм позволяет использовать нам некое обобщение, в данном случае при передаче аргумента метода playWith()
       мы используем общий интерфейс Animal, что позволяет нам передать в метод любое животное реализующее этот интерфейс
    */
    @Override
    public void playWith(Animal animal) {
        switch (animal.getType()) {
            case CAT:
                System.out.println("Let's drop this christmas-tree");
                break;
            case DOG:
                System.out.println("I'm running very fast, stupid dog");
                break;
            case MOUSE:
                System.out.println("Oh! I found something tasty");
                break;
        }
    }


    // кошка реализует интерфейс Animal и переопределяет его методы voice() и getType() по-своему - это тоже полиморфизм.
    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public AnimalType getType() {
        return AnimalType.CAT;
    }


    /* перегружаемые методы - то, что также позволяет нам делать полиморфизм
       мы можем создавать методы с одним именем и разным набором аргументов или различного типа
       очевидно, это удобнее, чем придумывать разные названия методам с почти одинаковым функционалом
     */
    public void eat() {
        System.out.println("I ate something tasty");
    }

    public void eat(Food food1, Food food2) {
        System.out.println("I ate some " + food1.toString() + " and " + food2.toString());
    }

    public void eat(Food food, int amount) {
        System.out.println("I ate " + amount + " " + food.toString());
    }

    public boolean eat(Food food) {
        System.out.println("Oh! Is it a new fodder? Let's try it! Meow...");
        return new Random().nextBoolean();
    }

}
