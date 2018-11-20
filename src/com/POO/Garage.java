package com.POO;

import java.util.ArrayList;

public class Garage {

    ArrayList <Vehicle> vehiculeList;


    public Garage() { //init garage + init liste vide
        vehiculeList = new ArrayList<>();
    }

    public void addVehicle (Vehicle vehicle){
        vehiculeList.add(vehicle);
    }
    public void removeVehicle (Vehicle vehicle){
        vehiculeList.remove(vehicle);
    }

    public void showVehicle (){
        for (int i = 0; i < vehiculeList.size() ; i++) {
            Vehicle vehicle = vehiculeList.get(i);
            vehicle.description();
            System.out.println("\n");
        }
    }


    public void powerVehicule (){
        int maxHorse = 0;
        int position = 0;

        for (int i = 0; i <vehiculeList.size() ; i++) {
            Vehicle vehicle = vehiculeList.get(i);

            if (maxHorse < vehicle.nbHorses)
            {
                maxHorse = vehicle.nbHorses;
                position = i;

            }
        }
        Vehicle powerest = vehiculeList.get(position);
        System.out.println("Le véhicule le plus puissant est " + powerest.brand);
    }

    public void lowVehicule () {
        int smallHorse = 0;
        int position = 0;

        for (int i = 0; i < vehiculeList.size() ; i++) {
            Vehicle vehicle = vehiculeList.get(i);

            if (smallHorse > vehicle.nbHorses){
                smallHorse = vehicle.nbHorses;
                position = i;
            }

        }
        Vehicle lowest = vehiculeList.get(position);
        System.out.println("Le véhicule le plus lent est " + lowest.brand);
    }
}




