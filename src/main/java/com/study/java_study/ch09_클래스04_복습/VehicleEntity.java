package com.study.java_study.ch09_클래스04_복습;

public class VehicleEntity {
    private String id;
    private String type;
    private String color;
    private int tireCount;

    public VehicleEntity() {
    }

    public VehicleEntity(String id, String type, String color, int tireCount) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.tireCount = tireCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTireCount() {
        return tireCount;
    }

    public void setTireCount(int tireCount) {
        this.tireCount = tireCount;
    }

    @Override
    public String toString() {
        return "VehicleEntity{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", tireCount=" + tireCount +
                '}';
    }
}
