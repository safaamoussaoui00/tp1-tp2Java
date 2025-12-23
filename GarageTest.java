package com.garage;

public class GarageTest {

    public static void main(String[] args) {
//polymorphisme ci desuus :
        Vehicule v1 = new Voiture("Peugeot", "208", 2021, 5);
        Vehicule v2 = new Moto("Yamaha", "MT-07", 2020, 689);

        v1.afficherDetails();
        System.out.println("------------------");
        v2.afficherDetails();
    }
}
