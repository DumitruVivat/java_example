package main.homework5;

import java.util.*;

public class PhoneBook {

    private Map<String,List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addPhoneNumber(String name, String phoneNumber) {

        if(!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }

        phoneBook.get(name).add(phoneNumber);
    }

    public List<String> getPhoneNumbers(String name) {
        return phoneBook.getOrDefault(name, null);
    }

    public void printPhoneBook() {
        for(Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println("Name: " +entry.getKey() + " - Phones: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        PhoneBook myPhoneBook = new PhoneBook();

        myPhoneBook.addPhoneNumber("Иван", "123-456-7890");
        myPhoneBook.addPhoneNumber("Иван", "987-654-3210");
        myPhoneBook.addPhoneNumber("Мария", "555-123-4567");
        myPhoneBook.addPhoneNumber("Мария", "555-765-4321");
        myPhoneBook.addPhoneNumber("Алексей", "333-222-1111");

        System.out.println("Телефоны Ивана: " + myPhoneBook.getPhoneNumbers("Иван"));

        myPhoneBook.printPhoneBook();
    }
}
