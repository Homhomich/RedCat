package com.company;

import com.company.Animal.Cat;
import com.company.Animal.Dog;
import com.company.Animal.Mouse;
import com.company.RedCat.Clothes.Glasses;
import com.company.RedCat.Clothes.Shirt;
import com.company.RedCat.Clothes.Size;
import com.company.RedCat.Decorator.CatWithKeyboard;
import com.company.RedCat.Food;
import com.company.RedCat.RedCat;

import java.util.*;



public class Main {

    public static void main(String[] args) {


        Cat cat = new RedCat("Oliver");       // мы создали животное - кота, а именно рыжего кота Оливера

        cat.addClothes(new Glasses(Size.S, cat));       //пора одеть нашего Оливера
        cat.addClothes(new Shirt(Size.S, cat));

        cat.playWith(new Mouse()); // Ого! Оливер вышел на охоту
        cat.playWith(new Dog()); // а теперь Оливер бежит прочь от местного сторожевого пса

        // пора научить Оливера чему то полузному

        cat = new CatWithKeyboard(cat);

        System.out.println(cat.aboutCat());


        //содадим еще одного рыжего кота и покормим его

        RedCat redCat = new RedCat("Sam");

        redCat.eat(Food.FISH);     //нужно покормить нашего кота
        redCat.eat(Food.FODDER, 200);   // и еще немного покормить
        redCat.eat(Food.FISH, Food.MEAT);      // и еще

        ArrayList<Dog> list = new ArrayList<Dog>();


    }
}
