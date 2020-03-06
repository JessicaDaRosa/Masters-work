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
public class P1 extends Thread{
    JobController AB,BD,DE,EF;
    
    public P1(JobController ab, JobController bd, JobController de, JobController ef){
        AB = ab;
        BD = bd;
        DE = de;
        EF = ef;
    }
    
    @Override
    public void start(){
        System.out.print("A");
        AB.jobDone();
        BD.isJobDone();
        System.out.print("D");
        DE.jobDone();
        EF.isJobDone();
        System.out.print("F");
    }
}
