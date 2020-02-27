package com.company.RedCat.Clothes;

import com.company.Animal.Animal;


public class Glasses extends Clothes {

    private boolean isBroken;

    public Glasses( Size size, Animal master) {
        super( size, master);
        isBroken=false;
    }


    public void toBreak(){
        isBroken=true;
    }
}
