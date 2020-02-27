package com.company.Animal;

// собака реализует интерфейс Animal и переопределяет его методы voice() и getType() по-своему - это тоже полиморфизм.

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("woof");
    }

    @Override
    public AnimalType getType() {
        return AnimalType.DOG;
    }
}
