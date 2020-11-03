package com.company;

import java.util.Random;

public class ClasePrincipal {
    @Override
    Thread1 [] t1=new Thread1[5](this);
    public ClasePrincipal {

        t1.start();
    }

    public int numeroAleatorio(){
        Random r = new Random();
        return (r.nextInt(7000)+1000);
    }
}
