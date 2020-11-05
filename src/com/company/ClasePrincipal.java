package com.company;

import java.util.ArrayList;
import java.util.Random;
interface Callback{
    public void añadirlista(String hilo);
    public void hiloterminado(String respuesta);
}
public class ClasePrincipal implements Callback{

    Thread1 [] t1=new Thread1[5];
    ArrayList <String> lhilos=new ArrayList<String>();
    public ClasePrincipal() {
        for(int i=1;i<5;i++){
            System.out.println("Iteracion "+i);
            for(int j=0;j<5;j++){
                Thread1 h = new Thread1(this);
                h.setName("hilo "+j);
                h.start();
                t1[j]=h;

            }
            for(Thread1 h1:t1){
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("El hilo que ha terminado primero es: "+ lhilos.get(0));
            lhilos.clear();
        }


    }

    @Override
    public void hiloterminado(String respuesta) {
        System.out.println(respuesta);
    }

    @Override
    public void añadirlista(String hilo) {
        lhilos.add(hilo);
    }
}
