package com.kata;

public class Tamagotchi {
    
    static int energy = 4;
    static int hunger = 4;
    static int mood = 4;


    

    public Tamagotchi() {}



    public void feeding(Tamagotchi tamagotchi){
        if(tamagotchi.getHunger()<10){
            tamagotchi.setHunger(tamagotchi.getHunger()-2);
            tamagotchi.setEnergy(tamagotchi.getEnergy()+1);
        }
        if(tamagotchi.getHunger()<=0){
            tamagotchi.setHunger(0);
            System.out.println("AVISO!!! ---> El pou esta lleno");
        }
    }
    public void sleeping(Tamagotchi tamagotchi){
        if(tamagotchi.getEnergy()<10){
            tamagotchi.setEnergy(getEnergy()+2);
        }   else {
            System.out.println("AVISO!!! ---> El pou no quiere dormir");
        }
    }
    public void playing(Tamagotchi tamagotchi){
        if(tamagotchi.getEnergy()<10){
            tamagotchi.setEnergy(getEnergy()-1);
            tamagotchi.setMood(getMood()+1);
            tamagotchi.setHunger(getHunger()+1);
        }   else {
            System.out.println("AVISO!!! ---> El pou no quiere jugar");
        }
    }
    public void pooping(Tamagotchi tamagotchi){
        if(tamagotchi.getHunger()<=8){
            tamagotchi.setHunger(getHunger()+2);
        }   else {
            System.out.println("AVISO!!! ---> El pou no quiere ir al baño");
        }
    }
    




    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        Tamagotchi.mood = mood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        Tamagotchi.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        Tamagotchi.energy = energy;
    }

}

