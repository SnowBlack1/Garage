package com.POO;

public class Moto extends Vehicle {

    protected int Weight;

    public Moto (String brand, int nbHorses, int nbWheels, int nbSeats, int nbDoors, int Weight){
        super(brand,nbHorses,nbWheels,nbSeats,nbDoors);
        this.Weight = Weight;
    }

    @Override
    public void klaxon() {
        System.out.println("La moto fait POUIC POUIC quand on klaxonne");
    }

   @Override
   public void description() {
       System.out.println("La moto est de marque " + brand + " ,elle possède " + nbHorses + " chevaux.");
       System.out.println("Elle a " + nbWheels + " roues, il y a " + nbSeats + " siège.");
       System.out.println("C'est une moto donc il n'y a pas de portes, à part pour les side-cars :)" );
       System.out.println("La moto pèse " + Weight + " kilos.");
   }
}