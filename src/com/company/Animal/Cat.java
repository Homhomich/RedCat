package com.company.Animal;

// наша кошка расширяет интерфейс Animal и добавляет новый метод playWith().

/* Cat - абстрактный класс, это значит, что мы не можем создавать его экземпляры, но он будет полезен нам
 в полиморфизме. Cat будет служить нам неким обобщением, мы сможем писать код, который использует
 кошек (совершенно любых кошек : рыжих, белых, пятнистых) и использовать класс Cat, а если нам понадобиться
 добавить еще разных видов кошек, то нам не понадобиться изменять исходный код
*/


import com.company.RedCat.Clothes.Clothes;

public abstract class Cat implements Animal {
    public abstract void playWith(Animal animal);

    public abstract void addClothes(Clothes c);

    public abstract String aboutCat();
}
