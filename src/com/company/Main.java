package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
    /*System.out.println("how many numbers do you want? ");
    Scanner input = new Scanner (System.in);
    int amount = input.nextInt ();
    System.out.println("minimum? ");
    int min = input.nextInt();
    System.out.println("maximum? ");
    int max = input.nextInt();
    while(int i = 0, i< amount, i++) {
        int number = (Math.random(maximum))*/

        System.out.println("how many sides ?");
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        ArrayList<Integer> tally = new ArrayList<Integer>();
        Integer sides = input.nextInt();
        System.out.println("how many throws? ");
        Integer amount = input.nextInt();
        int i = 0;
        while ( i < amount){
            i=i+1;
            Integer roll= rand.nextInt(sides+1);
            System.out.println(roll);
            


        }


    }


}

