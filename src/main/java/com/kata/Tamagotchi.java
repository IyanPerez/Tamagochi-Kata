package com.kata;

public class Tamagotchi {
    
    private int energy = 4;
    private int hunger = 4;
    private int mood = 4;
    private int time = 0;


    

    public Tamagotchi() {}



    public void feeding(Tamagotchi tamagotchi){
        if(tamagotchi.getHunger()<=10 && tamagotchi.getHunger()>0){
            tamagotchi.setHunger(tamagotchi.getHunger()-2);
            tamagotchi.setEnergy(tamagotchi.getEnergy()+1);

            tamagotchi.setTime(getTime()+2);
            tamagotchi.timeCounter(tamagotchi);
        }
        else{
            tamagotchi.setHunger(0);
            System.out.println("AVISO!!! ---> El pou esta lleno");
        }
    }
    public void sleeping(Tamagotchi tamagotchi){
        if(tamagotchi.getEnergy()<=8){
            tamagotchi.setEnergy(getEnergy()+2);

            tamagotchi.setTime(getTime()+8);
            tamagotchi.timeCounter(tamagotchi);

        }   else {
            System.out.println("AVISO!!! ---> El pou no quiere dormir");
        }
    }
    public void playing(Tamagotchi tamagotchi){
        if(tamagotchi.getEnergy()<=10 && tamagotchi.getEnergy()>0){
            tamagotchi.setEnergy(getEnergy()-1);
            tamagotchi.setMood(getMood()+1);
            tamagotchi.setHunger(getHunger()+1);
            tamagotchi.setTime(getTime()+3);
            tamagotchi.timeCounter(tamagotchi);
        }   else {
            System.out.println("AVISO!!! ---> El pou no quiere jugar");
        }
    }
    public void pooping(Tamagotchi tamagotchi){
        if(tamagotchi.getHunger()<=8){
            tamagotchi.setHunger(getHunger()+2);
            tamagotchi.setTime(getTime()+1);
            tamagotchi.timeCounter(tamagotchi);

        }   else {
            System.out.println("AVISO!!! ---> El pou no quiere ir al baño");
        }
    }

    
    public void timeCounter(Tamagotchi tamagotchi){

        if(tamagotchi.getTime() >= 0 && tamagotchi.getTime() < 100){
            System.out.println("El pou tiene"+tamagotchi.getTime()+"horas de vida");
        }
        if(tamagotchi.getTime() >= 100 ){
            System.out.println("El pou tiene"+tamagotchi.getTime()+"horas de vida, por tanto ha muerto de viejo [F]");
        }
    }












    public int getEnergy() {
        return energy;
    }



    public void setEnergy(int energy) {
        this.energy = energy;
    }



    public int getHunger() {
        return hunger;
    }



    public void setHunger(int hunger) {
        this.hunger = hunger;
    }



    public int getMood() {
        return mood;
    }



    public void setMood(int mood) {
        this.mood = mood;
    }



    public int getTime() {
        return time;
    }



    public void setTime(int time) {
        this.time = time;
    }
    





}

