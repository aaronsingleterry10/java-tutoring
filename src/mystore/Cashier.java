package mystore;

import peoplestuff.Person;

import java.util.List;

// Write a class called Cashier that extends the Person class in the peoplestuff package
// Cashier should have an instance method called total(List<DataType> parameterName)
// The method should accept a List that can contain Androids, Iphones, Windows and Apples
// The cashier should return the total of all items in the List.
// bonus: Overwrite the greetSomeoneElse method from the Person class
public class Cashier extends Person {

    public Cashier(){}

    public Cashier(String newPersonFirstName, String newPersonLastName, int newPersonAge) {
        super(newPersonFirstName, newPersonLastName, newPersonAge);
    }

    public double total(List<Product> cart) {
        double bucket = 0;
        for(Product item : cart) {
            bucket += item.getPrice();
        }
        return bucket;
    }
}
