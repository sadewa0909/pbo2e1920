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
public class JumpingZombie extends Zombie{

    
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    
    @Override
    public void heal() {
        if(level==1){
            this.health = (int) (this.health + (this.health * 0.03));
        }else if(level==2){
            this.health = (int) (this.health + (this.health * 0.04));
        }else if(level==3){
            this.health = (int) (this.health + (this.health * 0.05));
        }
    }

    @Override
    public void destroyed() {
        this.health = (int) (this.health - (this.health * 0.1));
    }

    @Override
    public String getZombieInfo() {
        System.out.println("Jumping Zombie Data =");
        return super.getZombieInfo();
    }
    
    
}
