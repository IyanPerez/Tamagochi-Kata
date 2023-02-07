package com.kata;

public class App 
{
    public static void main( String[] args )
    {

        Tamagotchi Pou = new Tamagotchi();
        Tamagotchi Tom = new Tamagotchi();
        Display screen = new Display();

        System.out.println("//=============================HISTORIAL==========================\\");

        // Pou.feeding(Pou);
        // Pou.pooping(Pou);
        // Pou.sleeping(Pou);
        
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.sleeping(Pou);
        Pou.sleeping(Pou);
        Pou.sleeping(Pou);
        Pou.sleeping(Pou);
        Pou.sleeping(Pou);
        Pou.sleeping(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.sleeping(Pou);
        Pou.sleeping(Pou);
        Pou.sleeping(Pou);
        Pou.sleeping(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);

        Pou.sleeping(Pou); //Se murió


        System.out.println("//=====================MOOD FACE==================================\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//=======================STATS====================================\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");


    }
}
