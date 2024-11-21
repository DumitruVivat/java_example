package main.lesson6.clients.impl;

import main.lesson6.clients.Animal;
import main.lesson6.clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(int id, String name, LocalDate birthday, Owner owner) {
        super(id, name, birthday, owner);
    }
}
