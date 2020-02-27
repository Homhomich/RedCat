package com.company.RedCat.Clothes;

import com.company.Animal.Animal;

public class Shirt extends Clothes {
    private boolean isTear;

    public Shirt( Size size, Animal master) {
        super( size, master);
        isTear=false;
    }


    public void toBreak(){
        isTear=true;
    }
}
