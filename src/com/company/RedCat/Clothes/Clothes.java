package com.company.RedCat.Clothes;

import com.company.Animal.Animal;

// класс Clothes позволяет нам объеденить все типы одежды. Данный класс является суперклассом


public class Clothes {

    private Size size;
    private boolean clean;
    private Animal master;

    public Clothes(Size size, Animal master) {
        this.size = size;
        this.clean = true;
        this.master = master;
    }

    public void use() {
        clean = false;
    }

    public void wash() {
        clean = true;
    }
}
