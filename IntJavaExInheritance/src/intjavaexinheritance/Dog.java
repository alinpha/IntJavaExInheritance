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
        super.hasCollar = true;
    }
    
    @Override
    public void setType(String type) {
        super.setType("Dog: " + type);
    }
    
    /**
     * Make a sound of a dog
     */
    @Override
    public void makeSound() {
        p("I bark");
    }
    
    public void playTugOfWar() {
        super.p("I a playing tug-o-war");
    }
}
