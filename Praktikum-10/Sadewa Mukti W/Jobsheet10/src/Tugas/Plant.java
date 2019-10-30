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
public class Plant {
    public void doDestroy(Destroyable d){
        if(d instanceof Barrier){
            Barrier br = (Barrier) d;
            br.destroyed();
        }else if(d instanceof WalkingZombie ){
            WalkingZombie wz = (WalkingZombie) d;
            wz.destroyed();
        }else if(d instanceof JumpingZombie){
            JumpingZombie jz = (JumpingZombie) d;
            jz.destroyed();
        }
    }
}
