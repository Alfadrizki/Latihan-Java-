package com.tutorial;

import java.util.Scanner;


public class ForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Ini Loop ke -1");
        

        for(int nilai = 0; nilai <= 10; nilai++){
            
            System.out.println("for loop ke-" + nilai);

        }
        System.out.println("Ini Loop ke -2");
        

        for(int nilai = 0; nilai < 10; nilai++){
            
            System.out.println("for loop ke-" + nilai);

        }
        System.out.println("ini Loop ke -3");

        for(int nilai = 10; nilai >= 5; nilai--){

            System.out.println("for loop ke- " + nilai);
        }
        

        System.out.println("ini adalah akhir program");

    ;
    }

}
