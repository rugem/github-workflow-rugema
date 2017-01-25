package edu.cofc.petstore.main;

import edu.cofc.petstore.controller.Dogs;
import edu.cofc.petstore.controller.PetStore;
import edu.cofc.petstore.controller.Pets;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        PetStore store = new PetStore();
        store.buyPet("cat", 10, "Cooco","Black");
        store.buyPet("cat", 2, "Shadow","white");
        store.buyPet("cat",1,"Gabor","Maroon");
        store.buyPet("bird", 1,"Tapaculos", "Gray");
        store.buyPet("bird",2,"Pittas","Khaki");
        store.buyPet("bird",3,"Manakins","Yellow");
        store.buyPet("bird",2,"Ovenbirds","Green");
        store.buyPet("bird",1,"Oreoles","Orange");
        store.buyPet("bird",4,"Berrypeckers","Khaki");
        store.buyPet("dog",5,"Bailey","White");
        store.buyPet("dog",4,"Ginger","Grey");

        System.out.println("WELCOME TO PET STORE\n");
        System.out.println("Number of Pets in the Store: " + store.getQuantity());
        store.printInventory();
        store.sellPet("cat","Shadow");
        store.sellPet("bird","Tapaculos");
        System.out.println("Number of Pets in the Store: " + store.getQuantity());
        store.printInventory();
    }
}
