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
public class FrenchBulldog extends Dog {
    
    public FrenchBulldog(String name, String type, int numOfLegs) {
        super(name, type, numOfLegs);
    }
    
    /**
     * Specific french bulldog action
     */
    public void eatFood() {
        p("I'm eating all the foods");
    }
    
}
