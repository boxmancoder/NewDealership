package com.newdealership;

import java.util.ArrayList;

public class Dealership {

    // These are my variables for the dealership and later on will be any
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle> Inventory;

 // Below is my Constructor method along with its signature.
    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.Inventory = new ArrayList<Vehicle>();
    }

        public ArrayList<Vehicle> getVehiclesByPrice (double min, double max){
            return null;
        }

        public ArrayList<Vehicle> getVehiclesByMakeModel (String make, String model){
            return null;
        }

        public ArrayList<Vehicle> getVehiclesByYear (int min, int max){
            return null;
        }

        public ArrayList<Vehicle> getVehiclesByColor (String color){
            return null;
        }

        public ArrayList<Vehicle> getVehiclesByMileage (int min, int max){
            return null;
        }

        public ArrayList<Vehicle> getVehiclesByType (String vehicleType){
            return null;
        }

        public ArrayList<Vehicle> getAllVehicles () {
            return null;
        }

        public ArrayList<Vehicle> addVehicle (String vehicle){
            return null;
        }

        public ArrayList<Vehicle> removeVehicle (String vehicle){
            return null;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Vehicle> getInventory() {
        return Inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        Inventory = inventory;
    }
}

