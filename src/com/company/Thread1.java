package com.company;

import java.util.Random;

public class Thread1 extends Thread{
    Callback callback;
    public Thread1(Callback callback){this.callback=callback;}
    int num=0;
    @Override
    public void run() {
        try {
            Random r = new Random();
            int dormir=r.nextInt(7000)+1000;

                sleep(dormir);

                callback.hiloterminado("El Hilo "+getName()+" ha dormido por "+dormir+"milisegundos");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
