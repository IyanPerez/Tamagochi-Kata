package com.kata;

public class Display {

    public Display() {}


    public void energyFace(Tamagotchi tamagotchi){
        if (tamagotchi.getEnergy()<3 && tamagotchi.getEnergy()>0){
            System.out.println("Energy ==> (-_-)"); 
        }
        if (tamagotchi.getEnergy()==0){
            System.out.println("Energy ==> (-_-) zZZ"); 
        }
        if (tamagotchi.getEnergy()>=3){
            System.out.println("Energy ==> :-|"); 
        }
    }
    public void moodFace(Tamagotchi tamagotchi){
        if (tamagotchi.getMood()>8){
            System.out.println("Mood ==> :-)"); 
        }
        if (tamagotchi.getMood()<2){
            System.out.println("Mood ==> ఠ_ఠ"); 
        }
        if (tamagotchi.getMood()<=8 && tamagotchi.getMood()>=2){
            System.out.println("Mood ====> :-|"); 
        }
    }



    public void displayStats(Tamagotchi tamagotchi){
        System.out.println("Energy:"+tamagotchi.getEnergy());
        System.out.println("Hunger:"+tamagotchi.getHunger());
        System.out.println("Mood:"+tamagotchi.getMood());
    }


}

