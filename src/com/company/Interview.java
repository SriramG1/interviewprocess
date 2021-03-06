package com.company;

import java.util.*;

public class Interview {
    static boolean key = true;
    Queue <String> queue = new LinkedList<>();
    Queue <String> room = new LinkedList<>();

    void nextCandidate(){
        System.out.println("\nNext candidate is : "+room.peek()+"\n");
    }
    void totalAvailable(){
        System.out.println("-----Available candidates-----");
        int j=1;
        for(String i : room){
            System.out.println(j+"."+i);
            j++;
        }
        for(String i : queue){
            System.out.println(j+"."+i);
            j++;
        }
        System.out.println("----------------");
    }
    void availableInRoom(){
        System.out.println("-----Available candidates-----");
        int j=1;
        for(String i : room){
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
        int length = Math.min(number, 4);
        for(int i=0;i<length;i++){
            String name=in.next();
            room.add(name);
        }
        for(int i=0;i<number-4;i++){
            String name=in.next();
            queue.add(name);
        }
    }
    void callForInterView(){
        if(room.isEmpty()) {
            System.out.println("\nNo available candidates\n");
        }
        else{
            String name = room.peek();
            System.out.println("\n" + name + " is exit the interview room.\n");
            room.poll();
            room.add(queue.peek());
            queue.poll();
        }
    }
    void mainMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("(1)-->Call for interview\n(2)-->Available candidates at room\n(3)-->Total available candidates\n(4)-->Next Candidate\n(5)-->Exit\nEnter your option :");
        int option;
        try {
            option = in.nextInt();
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("-----Enter valid option-----");
            return;
        }
        switch (option) {
            case 1 -> callForInterView();
            case 2 -> availableInRoom();
            case 3 ->totalAvailable();
            case 4 ->nextCandidate();
            case 5 -> key = false;
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
