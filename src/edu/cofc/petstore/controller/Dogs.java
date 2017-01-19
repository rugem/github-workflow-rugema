package edu.cofc.petstore.controller;

public class Dogs extends Pets {
    public Dogs(int age, String name, String color) {
        super(age, name, color);
    }

    public void setAge(int age){
        super.setAge(age);
    }
}
