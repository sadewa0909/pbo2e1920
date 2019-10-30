/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author mispan
 */
public class Barrier implements Destroyable{
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    @Override
    public void destroyed() {
        this.strength = (int) (this.strength - (this.strength * 0.1));
    }
    public String getBarrierInfo(){
        return "Strength : "+strength;
    }
    
}