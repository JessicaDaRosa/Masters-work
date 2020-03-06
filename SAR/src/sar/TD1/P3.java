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
public class P3 extends Thread{
    JobController BC,CE,EG;
    
    P3(JobController bc, JobController ce, JobController eg){
        BC=bc; CE=ce; EG=eg;
    }
    
    @Override
    public void start(){
        BC.isJobDone();
        System.out.print("C");
        CE.jobDone();
        EG.isJobDone();
        System.out.print("G");
    }
    
}
