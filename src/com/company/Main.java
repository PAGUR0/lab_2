package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Введите n: ");
	    int n = in.nextInt();
        System.out.println("Введите x |x| < 1: ");
        double x = in.nextDouble();
        if(Math.abs(x) >= 1){
            System.out.println("Модуль x должен быть меньше 1");
        }
        else{
        double arth = x;
        for(int i = 0; i <= n; i++) {
            arth = (arth + (Math.pow(x, (2 * i + 1)) / (2 * i + 1)));
        }
        System.out.println(arth);
        }
    }
}
