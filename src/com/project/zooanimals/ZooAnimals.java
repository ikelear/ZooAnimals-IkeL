package com.project.zooanimals;
import java.util.*;
import java.util.Scanner;

public class ZooAnimals {
    public static void main(String[] args) {

    }
}

class Lion implements iAnimal{
    private String animalType = "Lion";
    private int minTemperature = 50;
    private int maxTemperature = 85;
    private int idTag;
    public String getAnimalType() {
        return animalType;
    }

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int anIdTag) {
        idTag = anIdTag;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }
}
