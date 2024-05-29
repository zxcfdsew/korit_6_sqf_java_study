package com.study.java_study.ch09_클래스04.복습;

public class ComputerRepository {
    private ComputerEntity[] computers;
    private int serialNumber;

    public ComputerRepository() {
        computers = new ComputerEntity[0];
        serialNumber = 1;
    }

    public int makeSerialNumber() {
        return serialNumber++;
    }

    public void addComputer(ComputerEntity computer) {
        ComputerEntity[] newComputers = new ComputerEntity[computers.length];
        for(int i = 0; i < computers.length; i++) {
            newComputers[i] = computers[i];
        }
        newComputers[newComputers.length - 1] = computer;
        computers = newComputers;
    }

    public void deleteComputer(ComputerEntity computer) {
        ComputerEntity[] newComputers = new ComputerEntity[computers.length - 1];
        for(int i = 0; i < computers.length; i++) {

        }
    }

    public ComputerEntity findComputerBySerialNumber(int serialNumber) {
        for(ComputerEntity com : computers) {
            if(com.getSerialNumber() == serialNumber) {
                return com;
            }
        }
        return null;
    }

    public ComputerEntity findComputerByName(String name) {
        for(ComputerEntity com : computers) {
            if(com.getName().equals(name)) {
                return com;
            }
        }
        return null;
    }

    public ComputerEntity[] searchComputers(String option, String text) {
        ComputerEntity[] tempComputers = new ComputerEntity[computers.length];
        int index = 0;
        switch (option) {
            case "1":
                for(ComputerEntity com : computers) {
                    if (com.getName().contains(text)
                            || com.getCpu().contains(text)
                            || com.getRam().contains(text)
                            || com.getSsd().contains(text)
                            || com.getGpu().contains(text) ) {
                        tempComputers[index++] = com;
                    }
                }
                break;
            case "2":
                for(ComputerEntity com : computers) {
                    if (com.getName().contains(text)) {
                        tempComputers[index++] = com;
                    }
                }
                break;
            case "3":
                for(ComputerEntity com : computers) {
                    if (com.getCpu().contains(text)) {
                        tempComputers[index++] = com;
                    }
                }
                break;
            case "4":
                for(ComputerEntity com : computers) {
                    if (com.getRam().contains(text)) {
                        tempComputers[index++] = com;
                    }
                }
                break;
            case "5":
                for(ComputerEntity com : computers) {
                    if (com.getSsd().contains(text)) {
                        tempComputers[index++] = com;
                    }
                }
                break;
            case "6":
                for(ComputerEntity com : computers) {
                    if (com.getGpu().contains(text)) {
                        tempComputers[index++] = com;
                    }
                }
                break;
        }
        int len = 0;
        for (int i = 0; i < tempComputers.length; i++) {
            if (tempComputers[i] != null) {
                len++;
            }
        }
        ComputerEntity[] newComputers = new ComputerEntity[len];
        for (int i = 0; i < len; i++) {
            newComputers[i] = tempComputers[i];
        }
        return newComputers;
    }
}
