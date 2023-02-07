package com.kata;

public class App 
{
    public static void main( String[] args )
    {

        Tamagotchi Pou = new Tamagotchi();
        Display screen = new Display();

        // Pou.feeding(Pou);
        // Pou.pooping(Pou);
        // Pou.sleeping(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.playing(Pou);
        Pou.sleeping(Pou);
        Pou.sleeping(Pou);
        Pou.sleeping(Pou);



        screen.energyFace();
        screen.moodFace();
        screen.displayStats();

    }
}
