package org.example;
/*
Girilen bir noktanın ax+by+c=0 doğrusu üzerinde olup olmadığını, eğer değilse noktanın doğruya olan uzaklığını veren program.
Bu program, kullanıcıdan doğru denkleminin katsayılarını (a, b, c) ve noktanın koordinatlarını (x, y) alır. Ardından, noktanın doğru
üzerinde olup olmadığını kontrol eder. Eğer doğru üzerinde değilse, noktanın doğruya olan uzaklığını hesaplar ve ekrana yazdırır.
Doğru denklemi ax + by + c = 0 için katsayıları girin:
a: 2  b: -3  c: 6
Noktanın koordinatlarını girin:
x: 4  y: 5
Noktanın doğruya olan uzaklığı: 0.2773500981126146
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,c;
        double x,y;
        double distance;

        Scanner scanner = new Scanner(System.in);

        // Doğru denkleminin katsayılarını alıyoruz
        System.out.println("Doğru denklemi ax + by + c = 0 için katsayıları girin:");
        System.out.print("a : ");
        a = scanner.nextDouble();

        System.out.print("b : ");
        b = scanner.nextDouble();

        System.out.print("c : ");
        c = scanner.nextDouble();

        // Noktanın koordinatlarını alıyoruz
        System.out.println("Noktanın koordinatlarını girin:");
        System.out.print("x : ");
        x = scanner.nextDouble();

        System.out.print("y : ");
        y = scanner.nextDouble();

        // Doğru üzerinde mi kontrol et ve sonucu yazdır
        if (isPointOnLine(a,b,c,x,y)){
            System.out.println("Nokta doğru üzerinde.");
        } else {
            distance = calculateDistanceFromLine(a,b,c,x,y);
            System.out.println("Noktanın doğruya olan uzaklığı: " + distance);
        }
        scanner.close();
    }

    
    // Noktanın doğru üzerinde olup olmadığını kontrol et
    public static boolean isPointOnLine(double a, double b, double c, double x, double y){
        double result;
        result = a * x + b * y + c;
        return  result ==0;
    }

    // Noktanın doğruya olan uzaklığını hesapla
    public static double calculateDistanceFromLine(double a, double b, double c, double x, double y){
        double numerator;
        double denominator;

        numerator = Math.abs(a * x + b * y + c);
        denominator = Math.sqrt(a * a + b * b);
        return numerator / denominator;
    }
}