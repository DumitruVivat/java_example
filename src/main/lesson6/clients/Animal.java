package main.lesson6.clients;

import java.time.LocalDate;
import java.util.Objects;

public class Animal {
    protected int id;
    protected String name;
    protected LocalDate birthday;
    protected Owner owner;

    public Animal() {
    }
    public Animal(int id, String name, LocalDate birthday, Owner owner) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.owner = owner;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && Objects.equals(name, animal.name) && Objects.equals(birthday, animal.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthday);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
