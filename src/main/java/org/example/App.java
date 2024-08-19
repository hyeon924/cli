package org.example;

import java.util.Scanner;

public class App {

    Scanner sc;
    App (Scanner sc) {
        this.sc = sc;
    }

    void run() {
        System.out.println("==게시판앱==");

        while (true) {
            System.out.printf("명령) ");
            String commnd = sc.nextLine().trim();

            if(commnd.equals("종료")) {
                break;
            }
        }
    }
}
