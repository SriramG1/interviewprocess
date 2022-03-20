package com.company;

import java.util.*;

public class Interview {
    static boolean key = true;
    Queue <String> queue = new LinkedList<>();
    void dequeue(){
        String nextPerson=queue.peek();
        queue.poll();
        System.out.println(nextPerson+" is exit.\n");
    }
    void enqueue(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of the candidate : ");
        String name=in.nextLine();
        queue.add(name);
        System.out.println(name + " is added successfully\n");
    }
    void available(){
        System.out.println("-----Available candidates-----");
        int j=1;
        for(String i : queue){
            System.out.println(j+"."+i);
            j++;
        }
        System.out.println("----------------");
    }
    void addingCandidates(){
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
    void mainMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("(1)-->Enqueue\n(2)-->Dequeue\n(3)-->Available Candidates\n(4)-->Exit\nEnter your option :");
        int option;
        try {
            option = in.nextInt();
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("-----Enter valid option-----");
            return;
        }
        switch (option) {
            case 1 -> enqueue();
            case 2 -> dequeue();
            case 3 -> available();
            case 4 -> key = false;
            default -> System.out.println("-----Enter valid option-----");
        }
    }
    public static void main(String[] args) {
        Interview interview = new Interview();
        interview.addingCandidates();
        while(key){
            interview.mainMenu();
        }
    }
}
