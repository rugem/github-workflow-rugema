package edu.cofc.petstore.controller;

import java.util.ArrayList;
import java.util.Iterator;

public class PetStore {
    private ArrayList<Dogs> dogs;
    private ArrayList<Cats> cats;
    private ArrayList<Birds> birds;
    private final String type[] = {"cat", "dog", "bird"};
    private int quantity;

    public PetStore() {
        this.dogs = new ArrayList<Dogs>();
        this.cats = new ArrayList<Cats>();
        this.birds = new ArrayList<Birds>();
        this.quantity=0;
    }

    public void setDogs(int age, String name, String color) {
        this.dogs.add(new Dogs(age, name, color));
    }

    public void setCats(int age, String name, String color) {
        this.cats.add(new Cats(age, name, color));
    }

    public int getQuantity(){
        quantity = dogs.size()+ cats.size() + birds.size();
        return quantity;
    }
    public void setBirds(int age, String name, String color) {
        this.birds.add(new Birds(age, name, color));
    }

    public void buyPet(String type, int age, String name, String color) {
        if (this.type[0].equalsIgnoreCase(type)){
            this.cats.add(new Cats(age, name, color));
        } else if (this.type[1].equalsIgnoreCase(type)){
            this.dogs.add(new Dogs(age, name, color));
        } else if (this.type[2].equalsIgnoreCase(type)){
            this.birds.add(new Birds(age, name, color));
        } else{
            System.out.println("We only buy cats, dogs and birds.");
        }
    }

    public void sellPet(String type, String name){
        if (isInStore()){

            if (this.type[0].equalsIgnoreCase(type)){
                for(Iterator<Cats> it = cats.iterator(); it.hasNext();){
                    Cats c = it.next();
                    if (c.getName().contains(name)){
                        it.remove();
                    }
                }
            } else if (this.type[1].equalsIgnoreCase(type)){
                for (Iterator<Dogs> it = dogs.iterator(); it.hasNext();){
                    Dogs d = it.next();
                    if (d.getName().contains(name)){
                        it.remove();
                    }
                }
            } else if (this.type[2].equalsIgnoreCase(type)) {
                for (Iterator<Birds> it = birds.iterator(); it.hasNext();){
                    Birds b = it.next();
                    if (b.getName().contains(name)) {
                        it.remove();
                    }
                }
            } else {
                System.out.println("There is no " + name + " found in the store.");
            }
        } else {
            System.out.println("Pets are all Sold out!!!.");
        }
    }

    private boolean isInStore(){
        return getQuantity()>0;
    }

    public void printInventory(){
        if (cats.size()>0){
            System.out.println("TYPE CATS: " + cats.size());
            System.out.println("===============");
            for(Iterator<Cats> it = cats.iterator(); it.hasNext();){
                Cats cat = it.next();
                System.out.println("Name : " + cat.getName() + "\n" +
                        "Color: " + cat.getColor() + "\n" +
                        "Age  : " + cat.getAge() + "\n");
            }
        }

        if (dogs.size()>0){
            System.out.println("TYPE DOGS: " + dogs.size());
            System.out.println("===============");
            for(Iterator<Dogs> it = dogs.iterator(); it.hasNext();){
                Dogs dog = it.next();
                System.out.println("Name : " + dog.getName() + "\n" +
                        "Color: " + dog.getColor() + "\n" +
                        "Age  : " + dog.getAge() + "\n");
            }
        }

        if (birds.size()>0){
            System.out.println("TYPE BIRDS: " + birds.size());
            System.out.println("===============");
            for(Iterator<Birds> it = birds.iterator(); it.hasNext();){
                Birds bird = it.next();
                System.out.println("Name : " + bird.getName() + "\n" +
                        "Color: " + bird.getColor() + "\n" +
                        "Age  : " + bird.getAge() + "\n");
            }
        }
    }
}
