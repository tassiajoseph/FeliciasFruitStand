package com.tassiajoseph;

import java.util.ArrayList;

public class Stand {
    // modifier + data type + variable
    private String nameOfStand;
    private ArrayList<Fruit> fruitsList;
    private ArrayList<Integer> inventoryList;
    // { apple, banana, orange }

    // constructor
    public Stand(String nameOfStand, ArrayList<Fruit> fruitsList, ArrayList<Integer> inventoryList) {
        this.nameOfStand = nameOfStand;
        this.fruitsList = fruitsList;
        this.inventoryList = inventoryList;
    }

    // getter and setter nameOfStand
    public String getNameOfStand() {
        return nameOfStand;
    }

    public void setNameOfStand(String nameOfStand) {
        this.nameOfStand = nameOfStand;
    }

    // getter and setter fruitsList
    public ArrayList<Fruit> getFruitsList() {
        return fruitsList;
    }

    public void setFruitsList(ArrayList<Fruit> fruitsList) {
        this.fruitsList = fruitsList;
    }

    // getter and setter inventoryList
    public ArrayList<Integer> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Integer> inventoryList) {
        this.inventoryList = inventoryList;
    }

}
