package com.POO;

public class Main {

    public static void main(String[] args) {

        Vehicle twingo = new Vehicle("Renault", 25, 4, 4, 3);
        twingo.description();
        twingo.klaxon();


        System.out.println("\n");
        Car fiesta = new Car("Ford", 82, 4, 4, 4, 8);
        fiesta.description();
        fiesta.klaxon();

        System.out.println("\n");
        Car C3 = new Car("Citroen", 50, 4, 4, 5, 4);
        C3.description();
        C3.klaxon();

        System.out.println("\n");
        Moto harley = new Moto("Harley Davidson", 150, 2, 1, 0, 56);
        harley.description();
        harley.klaxon();

        System.out.println("\n");
        Garage garage1 = new Garage();
        garage1.addVehicle(twingo);
        garage1.addVehicle(fiesta);
        garage1.addVehicle(C3);
        garage1.addVehicle(harley);

        garage1.showVehicle();

        garage1.powerVehicule();
        garage1.lowVehicule();

        if (fiesta instanceof Car) {
            System.out.println("Ma fiesta est une voiture");
        }
        else {
            System.out.println("Ma fiesta n'est pas une voiture");
        }


    }
}
