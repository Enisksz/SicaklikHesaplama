package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int heat;
        Scanner sicaklikAL= new Scanner(System.in);

        System.out.print("Sıcaklık giriniz: ");
        heat = sicaklikAL.nextInt();

        if(heat<=5){
            System.out.println("Bugün kayak yapabilirsin çünkü hava " + heat);
        }
        if(heat>5 && heat<=15){
            System.out.println("Bugün sinemaya gidebilirsin çünkü hava " + heat);
        }
        if(heat>15 && heat<=25){
            System.out.println("Bugün piknik yapmaya gidebilirsin çünkü hava " + heat);
        }
        if(heat>25){
            System.out.println("Bugün yüzmeye gidebilirsin çünkü hava " + heat);
        }
    }
}
