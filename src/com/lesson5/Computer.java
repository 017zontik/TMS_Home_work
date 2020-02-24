package com.lesson5;

import java.util.Scanner;

public class Computer {
    String processor;
    String ram;
    String hdd;
    int workCycles = 3;
    boolean isOn = false;
    boolean isDead = false;

    public void description() {
        System.out.println("рроцессор: " + processor);
        System.out.println("Оперативка: " + ram);
        System.out.println("Жесткий диск: " + hdd);
        System.out.println("Ресурс: " + workCycles);
    }

    public void turnOn() {
        if (isDead){
            System.out.println("Компу конец");
            return;
        }

        if(isOn){
            System.out.println("Комп уже включен");
            return;
        }
        if (workCycles==0){
            System.out.println("Комп уже точно сдох");

        }

        System.out.println("Введите число 0 или 1 чтобы включить комп:" );
        int x = 0;
        if (Math.random() > 0.5) {
            x = 1;
        }
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        if(x==sc){
            System.out.println("Комп включен!");
            isOn = true;
        }else {
            System.out.println("Комп сдох(((");
            isDead = true;
        }

    }
    public void turnOff() {
        if (isDead){
            System.out.println("Компу конец");
            return;
        }
        if (!isOn){
            System.out.println("Комп уже выключен.");
            return;
        }
        System.out.println("Введите число 0 или 1 чтобы выключить комп:");
        int x = 0;
        if (Math.random() > 0.5) {
            x = 1;
        }
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        if (x == sc) {
            System.out.println("Комп выключен!");
            isOn= false;
            workCycles--;

        } else {
            System.out.println("Комп сдох(((");
            isDead = true;
            isOn = false;
        }
    }





}
