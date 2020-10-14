/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavaexinheritance;

/**
 *
 * @author Aline Vetrov
 */
public class Dog extends Pet {
    
    public Dog(String name, String type, int numOfLegs) {
        super(name, type, numOfLegs);
    }
    
    @Override
    public void makeSound() {
        p("I bark");
    }
}
