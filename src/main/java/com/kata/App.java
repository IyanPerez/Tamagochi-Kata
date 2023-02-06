package com.kata;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Tamagotchi Pou = new Tamagotchi();
        Pou.feeding(Pou);
        
        System.out.println(Pou.getHunger());
    }
}
