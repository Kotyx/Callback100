package com.company;

public class Thread1 extends Thread{
    ClasePrincipal c;
    public Thread1(ClasePrincipal clasePrincipal){c=clasePrincipal;}
    int num=0;
    @Override
    public void run() {
        try {
            for (int i=0;i<5;i++){
                num=c.numeroAleatorio();
                System.out.println("Iteracion 1");

                sleep(num);

                System.out.print("El Hilo "+i+" ha dormido por "+num+"milisegundos");

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
