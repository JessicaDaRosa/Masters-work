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
public class main {
    
    public static void main(String[] args) throws InterruptedException{
        JobController ab, bd, bc, de, ce, ef, eg;
        ab = new JobController(); bd = new JobController();
        bc = new JobController(); de = new JobController();
        ce = new JobController(); ef = new JobController();
        eg = new JobController();
        
        P1 p1 = new P1(ab, bd, de, ef);
        P2 p2 = new P2(ab, bd, bc, de, ce, ef, eg);
        P3 p3 = new P3(bc, ce, eg);
        
        p1.start();
        p2.start();
        p3.start();
        
        p1.join();
        p2.join();
        p3.join();
    }
}
