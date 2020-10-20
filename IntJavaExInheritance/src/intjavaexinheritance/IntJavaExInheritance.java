/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavaexinheritance;

import java.util.ArrayList;

/**
 *
 * @author Aline Vetrov
 */
public class IntJavaExInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog bowser = new Dog("Bowser", "Collie",4);
        bowser.makeSound();
        p(bowser.getType());
        
        Pet frank = new Pet("Frank", "Bird", 2);
        frank.makeSound();
        
        bowser.setType("Bull Mastiff");
        p(bowser.getType());
        
        bowser.playTugOfWar();
        
        ArrayList<Pet> zoo = new ArrayList<Pet>();
        zoo.add(new Dog("Gus", "Boston Terier", 4));
        zoo.add(new Cow("Buttercup", "American Jersey", 4));
        zoo.add(frank);
        zoo.add(bowser);
        
        for (Pet pet : zoo) {
            p("I am " + pet.getName() + " I will now speak...");
            pet.makeSound();
        }
        
        Dog myNewGod = new FrenchBulldog("Bill", "Brindle", 4);
        
        //type check
        if (myNewGod instanceof FrenchBulldog) {
            ((FrenchBulldog)myNewGod).eatFood();
        }
        
    }
    
    public static void p(Object obj) {
        System.out.println(obj);
    }
    
}
