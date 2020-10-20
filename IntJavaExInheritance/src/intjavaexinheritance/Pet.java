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
public class Pet implements IPet {
    public boolean hasCollar;
    
    private String name;
    private String type;
    private int numOfLegs;
    
    public Pet(String name, String type, int numOfLegs) {
        setName(name);
        setType(type);
        setNumOfLegs(numOfLegs);
    }
    
    public void p(Object obj) {
        System.out.println(obj);
    }

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getNumOfLegs() {
        return numOfLegs;
    }
    
    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
//</editor-fold>

    @Override
    public void makeSound() {
        p("I blank");
    }

    @Override
    public void move() {
        p("I move");
    }
    
    
}
