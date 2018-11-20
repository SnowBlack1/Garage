package com.POO;

public class Vehicle {

    protected String brand = "";
    protected int nbHorses, nbWheels, nbSeats, nbDoors;

    public Vehicle(String brand, int nbHorses, int nbWheels, int nbSeats, int nbDoors) {
        this.brand = brand;
        this.nbHorses = nbHorses;
        this.nbWheels = nbWheels;
        this.nbSeats = nbSeats;
        this.nbDoors = nbDoors;
    }

    public void klaxon () {
        System.out.println("Le klaxon du véhicule fait TUT TUT");
    }

    public void description(){
        System.out.println("La voiture est de marque " + brand + " ,elle possède " + nbHorses + " chevaux.");
        System.out.println("Elle a " + nbWheels + " roues, il y a " + nbSeats + " sièges.");
        System.out.println("C'est une voiture " + nbDoors + " portes.");
    }


}
