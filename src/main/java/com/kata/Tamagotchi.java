package com.kata;

public class Tamagotchi {
    
    int mood = 4;
    int hunger = 4;
    int fullness = 4;
    int energy = 4;

    

    public Tamagotchi() {

    }



    public void feeding(Tamagotchi tamagotchi){
        if(tamagotchi.getFullness()<100){
            tamagotchi.setHunger(tamagotchi.getHunger()+2);
            tamagotchi.setFullness(tamagotchi.getFullness()-2);
        }
        if(tamagotchi.getFullness()>=100){
            System.out.println("El pou esta lleno");
        }
    }





    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

}

