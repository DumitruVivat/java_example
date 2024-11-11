package main.lesson3;

public class Animal {
    String breed;
    String name;
    int age;

    public Animal(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
