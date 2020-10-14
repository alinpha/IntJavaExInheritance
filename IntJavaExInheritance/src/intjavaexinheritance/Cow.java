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
public class Cow extends Pet {
    
    public Cow(String name, String type, int numOfLegs) {
        super(name, type, numOfLegs);
    }
    
    /**
     * Cow making sound
     */
    @Override
    public void makeSound() {
        super.p("I moooooo");
    }
    
}
