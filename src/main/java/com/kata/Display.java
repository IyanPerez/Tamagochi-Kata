package com.kata;

public class Display {

    public Display() {}
    

    public void energyFace(){
        if (Tamagotchi.energy<=10){
            System.out.println("hola"); 
        }
    }
    public void displayStats(){
        System.out.println("Energy:"+Tamagotchi.energy);
        System.out.println("Hunger:"+Tamagotchi.hunger);
        System.out.println("Mood:"+Tamagotchi.mood);
    }


}

