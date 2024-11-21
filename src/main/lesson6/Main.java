package main.lesson6;

import main.lesson6.clients.Animal;
import main.lesson6.clients.Owner;
import main.lesson6.clients.impl.Cat;
import main.lesson6.clients.impl.Dog;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(1,"Tom", LocalDate.of(1994,11, 26),new Owner(999), true);
        Dog dog = new Dog(2,"Henry",LocalDate.of(1996,12,9),new Owner(888));
        Animal capy = new Cat(3,"Capy",LocalDate.of(1990,1,1),new Owner(777),true);

        HashMap<Animal, Owner> animalOwner = new HashMap<>();

        animalOwner.put(dog, dog.getOwner());
        animalOwner.put(cat, cat.getOwner());
        animalOwner.put(capy, capy.getOwner());
        System.out.println(animalOwner);
    }
}
