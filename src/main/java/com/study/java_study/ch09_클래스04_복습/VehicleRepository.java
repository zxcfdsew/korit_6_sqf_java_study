package com.study.java_study.ch09_클래스04_복습;

public class VehicleRepository {

    private VehicleEntity[] vehicles;

    public VehicleRepository() {
        vehicles = new VehicleEntity[0];
    }

    public void saveVehicle(VehicleEntity vehicle) {
        VehicleEntity[] newVehicleEntities = new VehicleEntity[vehicles.length + 1];
        for(int i = 0; i < vehicles.length; i++) {
            newVehicleEntities[i] = vehicles[i];
        }
        vehicles = newVehicleEntities;
        vehicles[vehicles.length - 1] = vehicle;
    }

    public void deleteVehicle(VehicleEntity vehicle) {
        VehicleEntity[] newVehicleEntities = new VehicleEntity[vehicles.length + 1];
        int newIndex = 0;
        for(int i = 0; i < vehicles.length; i++) {
            if (!vehicle.equals(vehicles[i])) {
                newVehicleEntities[newIndex++] = vehicles[i];
            }
        }
        vehicles = newVehicleEntities;
    }

//    public VehicleEntity[] findVehicleById(String Id) {
//        VehicleEntity[] find
//    }
}
