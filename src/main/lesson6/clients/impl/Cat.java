package main.lesson6.clients.impl;

import main.lesson6.clients.Animal;
import main.lesson6.clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal {
    public boolean isHome;
    public Cat(int id, String name, LocalDate birthday, Owner owner,boolean isHome) {
        super(id, name, birthday, owner);
        this.isHome = isHome;
    }

    public String getName() {
        return name;
    }
}
