package com.syntax;

public class Main {
    public static void main(String[] args) {
        SolarSystem milkyWay = new SolarSystem();
        milkyWay.sun = 1;
        milkyWay.moon = 2;
        milkyWay.planets = 3;

        Sun solana = new Sun();
        solana.heat = "456789";
        solana.radius = "4567890";
        solana.temp = "567890";


        // adding planet1
        Planet1  planet1= new Planet1();
        planet1.color = "green";
        planet1.size = "34567";


    }
}
