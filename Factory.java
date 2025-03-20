package org.example;

public class Factory {
    public static Person Prototype() {
        Person person = new Person();
        person.setName("Humoyun");
        person.setAge(18);
        person.setAddress("Uzbekistan");
        return person;
    }


    public static void main(String[] args) {
        Person person = Factory.Prototype();

        System.out.println("My name is " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}