package com.company;

import java.util.Random;

public class Thread1 extends Thread{
    Callback callback;
    public Thread1(Callback callback){this.callback=callback;}
    @Override
    public void run() {
        try {
            Random r = new Random();
            int dormir=r.nextInt(7000)+1000;

                sleep(dormir);

                callback.contador();
                callback.hiloterminado("El Hilo "+getName()+" ha dormido por "+dormir+"milisegundos");

                callback.añadirlista(getName()+" ha dormido "+dormir);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
