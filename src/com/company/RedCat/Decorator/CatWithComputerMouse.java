package com.company.RedCat.Decorator;

import com.company.Animal.Animal;
import com.company.Animal.AnimalType;
import com.company.RedCat.Clothes.Clothes;
import com.company.RedCat.RedCat;

public class CatWithComputerMouse extends Decorator {
    private RedCat cat;

    public CatWithComputerMouse(RedCat cat) {
        this.cat = cat;
    }

    /* с помощью паттерна декоратор мы расширяем функционал нашего класса RedCat, а именно переопределяем метод aboutMe()
       думаю, это тоже полиморфизм, ведь полиморфизм подразумевает расширяемость
    */
    @Override
    public String aboutCat() {
        return cat.aboutCat() + " and I can use a mouse and play with its wire ";
    }

    @Override
    public void playWith(Animal animal) {
        cat.playWith(animal);
    }

    @Override
    public void addClothes(Clothes c) {
        cat.addClothes(c);
    }

    @Override
    public void voice() {
        cat.voice();
    }

    @Override
    public AnimalType getType() {
        return cat.getType();
    }


}
