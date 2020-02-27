package com.company.Animal;


// мышь реализует интерфейс Animal и переопределяет его методы voice() и getType() по-своему - это тоже полиморфизм.

public class Mouse implements Animal {
    @Override
    public void voice() {
        System.out.println("peep");
    }

    @Override
    public AnimalType getType() {
        return AnimalType.MOUSE;
    }
}
