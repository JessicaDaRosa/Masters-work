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
public class P2 extends Thread{
    JobController AB,BD,BC,DE,CE, EF, EG;


    P2(JobController ab, JobController bd, JobController bc, JobController de, JobController ce, JobController ef, JobController eg){
         AB=ab;
         BD=bd;
         BC=bc;
         DE=de;
         CE=ce;
         EF=ef;
         EG=eg;
     }
     
    @Override
     public void start(){
         AB.isJobDone();
         System.out.print("B");
         BD.jobDone();
         BC.jobDone();
         System.out.print("X");
         DE.isJobDone();
         CE.isJobDone();
         System.out.print("E");
         EF.jobDone();
         EG.jobDone();
     }
}
