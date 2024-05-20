package com.kwan;

import java.util.Scanner;

public class baseball {

    public static void main(String[] args) {

        int com1 = 0, com2=0, com3=0;
        while(true) {
            com1 = (int)(Math.random()*9)+1;
            com2 = (int)(Math.random()*9)+1;
            com3 = (int)(Math.random()*9)+1;
            if(!(com1==com2 || com1==com3 || com2==com3)) break;
        }
        Scanner scanner =new Scanner(System.in);
        int count = 0;
        while(true) {
            count++;
            int strike = 0, ball = 0, out = 0;
            System.out.println("input ex: 1 2 3>");
            int user1 = scanner.nextInt();
            int user2 = scanner.nextInt();
            int user3 = scanner.nextInt();

            if(user1 == com1) strike++;
            else if(user1 == com2) ball++;
            else if(user1 == com3) ball++;

            if(user2 == com1) ball++;
            else if (user2 == com2) strike++;
            else if (user2 == com3) ball++;

            if(user3 == com1) ball++;
            else if(user3 == com2) ball++;
            else if(user3 == com3) strike++;

            out = 3 - (strike + ball);

            System.out.printf("ur input : %s, %s, %s\n",user1,user2,user3);
            System.out.printf("com input : %s, %s, %s\n",com1, com2, com3);
            System.out.printf("result : S:%s, B:%s, O:%s\n",strike, ball, out);
            System.out.println("==============================");
            if(strike == 3) {
                System.out.printf("strike ! count : %s ! \n", count);
                break;
            }
        }

    }

}