package com.POO;

public class Car extends Vehicle {

    protected int nbHighlights;

    public Car (String brand, int nbHorses, int nbWheels, int nbSeats, int nbDoors, int nbHighlights) {
        super(brand,nbHorses,nbWheels,nbSeats,nbDoors);
        this.nbHighlights = nbHighlights;
    }

    @Override
    public void klaxon(){
        System.out.println("Le klaxon de la voiture fait COIN COIN");}

   @Override
   public void description(){
           super.description();
           System.out.println("Il y a " + nbHighlights + " phares LED qui peuvent faire gyrophare si vous voulez :) ");
   }

    }

