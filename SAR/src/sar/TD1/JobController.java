/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sar.TD1;

/**
 *
 * @author jessicadarosa
 */
public class JobController {
    boolean done = false;
    
    synchronized public void jobDone(){
        done = true;
        this.notifyAll();
    }
    
    public synchronized void isJobDone(){
        if(!done){
            try{
                wait();
            }catch (InterruptedException e) {e.printStackTrace();}
        }
    }
    
}
