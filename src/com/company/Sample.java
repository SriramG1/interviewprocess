package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sample {
    static Queue<String> queue = new LinkedList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-----Add candidates names-----");
        System.out.println("Number of candidates adding : ");
        int number=in.nextInt();
        System.out.println("Enter the candidates : ");
        for(int i=0;i<number;i++){
            String name=in.next();
            queue.add(name);
        }
    }
}
