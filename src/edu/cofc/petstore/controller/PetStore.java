package edu.cofc.petstore.controller;

public class PetStore {
    private Dogs[] dogs;
    private Cats[] cats;
    private Birds[] birds;
    private double sellPet;
    private double buyPet;

    public PetStore(Dogs[] dogs, Cats[] cats, Birds[] birds) {
        this.dogs = dogs;
        this.cats = cats;
        this.birds = birds;
    }

    public void setDogs(Dogs[] dogs) {
        this.dogs = dogs;
    }

    public void setCats(Cats[] cats) {
        this.cats = cats;
    }

    public void setBirds(Birds[] birds) {
        this.birds = birds;
    }

    public void setSellPet(double sellPet) {
        this.sellPet = sellPet;
    }

    public void setBuyPet(double buyPet) {
        this.buyPet = buyPet;
    }

    public double getSellPet() {
        return sellPet;
    }

    public double getBuyPet() {
        return buyPet;
    }

    public double sellPet(){
        return sellPet;
    }

}
