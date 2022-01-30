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
        solana.temp = 45678;

        // addding planet2
        Planet2 planet2 = new Planet2();
        planet2.color="pink";
        planet2.size="45678";


        // adding moon1 features
        Moon1 moon1 = new Moon1();
        moon1.color = "blue";
        moon1.radius = "34567";
        moon1.lightIntensity = "234567";


        // adding planet1
        Planet1  planet1= new Planet1();
        planet1.color = "green";
        planet1.size = "34567";



    }
}
