package com.company.RedCat.Decorator;

import com.company.Animal.Animal;
import com.company.Animal.AnimalType;
import com.company.Animal.Cat;
import com.company.RedCat.Clothes.Clothes;
import com.company.RedCat.RedCat;

public class CatWithKeyboard extends Decorator {
    private Cat cat;

    public CatWithKeyboard(Cat cat) {
        this.cat = cat;
    }


    /* с помощью паттерна декоратор мы расширяем функционал нашего класса RedCat, а именно переопределяем метод aboutMe()
       думаю, это тоже полиморфизм, ведь полиморфизм подразумевает расширяемость
     */
    @Override
    public String aboutCat() {
        return cat.aboutCat() +" and I can use a keyboard like this: *dshjfdhjdsj* ";
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
