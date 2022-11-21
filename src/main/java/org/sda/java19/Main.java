package org.sda.java19;

import org.sda.java19.models.JavaDeveloper;

import java.math.BigDecimal;

/**
 * Exercise-1
 * Create 3 classes: Person, Developer, JavaDeveloper.
 * a. Person is a parent class, Developer inherits from Person, JavaDeveloper inherits from
 * Developer
 * b. Create constructor for every class that will call constructor of the super class. Each
 * constructor should display an information, that it has been called.
 * c. Create an object of type JavaDeveloper. What information will be displayed and in
 * what order?
 * d. Using an object of type JavaDeveloper call a method that is defined in Developer
 * class. What access modifier should it have?
 * e. *Overload method from the Person class in JavaDeveloper class to accept additional
 * parameters.
 *
 * @author Vinod John
 */
public class Main {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.setName("Vinod");
        javaDeveloper.setAge(25);
        javaDeveloper.setEmail("qwerty@gmail.com");
        javaDeveloper.setOnsite(true);
        javaDeveloper.setOfficiallyCertified(false);
        javaDeveloper.setYearsOfExperience(5);
        javaDeveloper.setSalaryExpected(BigDecimal.valueOf(5000));

        //c.
        System.out.println(javaDeveloper);

        //d.
        //Public or protected
        System.out.println(javaDeveloper.getSalaryExpected());

        //e.
        javaDeveloper.setName("Tony", "Stark");
        System.out.println(javaDeveloper.getName());
    }
}