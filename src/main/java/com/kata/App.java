package com.kata;

public class App 
{
    public static void main( String[] args )
    {

        Tamagotchi Pou = new Tamagotchi();
        Display screen = new Display();
        Pou.feeding(Pou);
        Pou.sleeping(Pou);
        Pou.playing(Pou);
        Pou.pooping(Pou);

        screen.energyFace();
        screen.displayStats();


/*         System.out.println("Energy:"+Pou.getEnergy());
        System.out.println("Hunger:"+Pou.getHunger());
        System.out.println("Mood:"+Pou.getMood()); */

    }
}
