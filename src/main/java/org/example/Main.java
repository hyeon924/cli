package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==게시판 앱==");
        Scanner sc = new Scanner(System.in); //스캐너를 받아옴

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine();

            if(command.equals("종료")) {
                break;
            }

        }
    }
}
