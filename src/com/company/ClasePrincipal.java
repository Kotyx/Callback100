package com.company;

import java.util.Random;

public class ClasePrincipal extends Thread {
    @Override
    public void run() {
        Thread1 t1=new Thread1(this);
    }

    public int numeroAleatorio(){
        Random r = new Random();
        return (r.nextInt(7000)+1000);
    }
}
