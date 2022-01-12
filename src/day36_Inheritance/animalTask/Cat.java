package day36_Inheritance.animalTask;

public class Cat extends Animal{ // Cat is an animal

    public void meow(){
        System.out.println(name + " is meowing");
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
/*
    Cat:
        6 variables
        6 methods inherited, 2 methods created. 8 methods in total
 */