package com.kata;

public class App 
{
    public static void main( String[] args )
    {

        Tamagotchi Pou = new Tamagotchi();

        Display screen = new Display();

        
        // SIMULACION DE JUEGO EN EL QUE SE LLAMA AL METODO CADA VEZ QUE SE SELECCIONA UNA ACCION:
        // Cosas a implementar:  ==>método para cambiar estadisticas con el paso del tiempo
        //                       ==>método para simplificar las llamadas a acciones
        //                       ==>método para evitar que las estadisticas suban de un determinado valor
        //                       ==>método para controlar la muerte del Tamagotchi (solamente avisa cuando el contador llega a la consigna pero no impide seguir llamando a las acciones)
        //                       ==>interfaz???

        System.out.println("//===================================================Feeding 1====\\");
        Pou.feeding(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");

        
        System.out.println("//===================================================Feeding 2====\\");
        Pou.feeding(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");

        
        System.out.println("//===================================================Pooping======\\");
        Pou.pooping(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");
        

        System.out.println("//===================================================Playing 1====\\");
        Pou.playing(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");
        

        System.out.println("//===================================================Playing 2====\\");
        Pou.playing(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");
        

        System.out.println("//===================================================Playing 3====\\");
        Pou.playing(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");
        

        System.out.println("//===================================================Playing 4====\\");
        Pou.playing(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");
        

        System.out.println("//===================================================Playing 5====\\");
        Pou.playing(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");
        

        System.out.println("//===================================================Playing 6====\\");
        Pou.playing(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");
        

        System.out.println("//===================================================Sleeping 1===\\");
        Pou.sleeping(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");
        

        System.out.println("//===================================================Sleeping 2===\\");
        Pou.sleeping(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");


        System.out.println("//===================================================Sleeping 3===\\");
        Pou.sleeping(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");


        System.out.println("//===================================================Sleeping 4===\\");
        Pou.sleeping(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");


        System.out.println("//===================================================Sleeping 5===\\");
        Pou.sleeping(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");


        System.out.println("//===================================================Feeding 3====\\");
        Pou.feeding(Pou);
        System.out.println("//===================================================MOOD FACE====\\");
        screen.energyFace(Pou);
        screen.moodFace(Pou);
        System.out.println("//===================================================STATS========\\");
        screen.displayStats(Pou);
        System.out.println("//================================================================\\");




    }
}
