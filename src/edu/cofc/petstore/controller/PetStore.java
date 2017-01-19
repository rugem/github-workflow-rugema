package edu.cofc.petstore.controller;

import java.util.ArrayList;

public class PetStore {
    private ArrayList<Dogs> dogs;
    private ArrayList<Cats> cats;
    private ArrayList<Birds> birds;
    private double price;
    private int dogCount, catCount, birdCount;

    public PetStore() {
        this.dogs = new ArrayList<Dogs>();
        this.cats = new ArrayList<Cats>();
        this.birds = new ArrayList<Birds>();
        this.price = 0.0;
        this.dogCount=0; this.catCount=0; this.birdCount=0;
    }

    public void setDogs(ArrayList<Dogs> dogs) {
        this.dogs = dogs;
    }

    public void setCats(ArrayList<Cats> cats) {
        this.cats = cats;
    }

    public void setBirds(ArrayList<Birds> birds) {
        this.birds = birds;
    }

    public void buyPet(String name) {
    }

    public void sellPet(){
    }

}
