package com.kata;

public class Display {

    public Display() {}
    

    public void energyFace(){
        if (Tamagotchi.energy<3){
            System.out.println("Energy ==> (-_-)"); 
        }
        if (Tamagotchi.energy==0){
            System.out.println("Energy ==> (-_-) zZZ"); 
        }
        if (Tamagotchi.energy>=3){
            System.out.println("Energy ==> :-|"); 
        }
    }
    public void moodFace(){
        if (Tamagotchi.mood>8){
            System.out.println("Mood ==> :-)"); 
        }
        if (Tamagotchi.mood<2){
            System.out.println("Mood ==> ఠ_ఠ"); 
        }
        if (Tamagotchi.mood<=8 && Tamagotchi.mood>=2){
            System.out.println("Mood ====> :-|"); 
        }
    }



    public void displayStats(){
        System.out.println("Energy:"+Tamagotchi.energy);
        System.out.println("Hunger:"+Tamagotchi.hunger);
        System.out.println("Mood:"+Tamagotchi.mood);
    }


}

