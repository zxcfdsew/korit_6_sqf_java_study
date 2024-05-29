package com.study.java_study.ch09_클래스04.복습;

public class ComputerEntity {
    private int serialNumber;
    private String name;
    private String cpu;
    private String ram;
    private String ssd;
    private String gpu;

    public ComputerEntity() {
    }

    public ComputerEntity(int serialNumber, String name, String cpu, String ram, String ssd, String gpu) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.gpu = gpu;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "ComputerEntity{" +
                "serialNumber=" + serialNumber +
                ", name='" + name + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
