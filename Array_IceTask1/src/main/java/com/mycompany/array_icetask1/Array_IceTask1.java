/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.array_icetask1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Array_IceTask1 {

    public static void main(String[] args) {
        //String [] dogNames = {"Kelly_Khumalo", "Ayanda", "Palesa", "Sandile", "Chumeka", "Sam", "Syathokoza", "Omphile", "Warona", "Tshepi"};
        // int [] dogAge = {1,2,3,4,5,6,7,8,9,10};
        Scanner scan = new Scanner(System.in);

        ArrayList<String> dogNames = new ArrayList();
        ArrayList<Integer> dogAge = new ArrayList();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the dog name " + (i+1) + ": ");
            String name = scan.nextLine();
            dogNames.add(name);

            System.out.print("Enter dog age: \n");
            int age = scan.nextInt();
            dogAge.add(age);

            scan.nextLine();
        }
        for(int i = 0; i < dogNames.size(); i++){
            System.out.print("Dog name "+ (i+1) + "= " + dogNames.get(i) + " and " + "Dog Age = " + dogAge.get(i) + "\n");
        }
    }
}
