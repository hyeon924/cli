package org.example;

import java.util.Scanner;

public class App {
    Scanner sc;
    App (Scanner sc) {
        this.sc = sc;
    }

    void run () {
        System.out.println("== 게시판 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.print("제목 : ");
                String subject = sc.nextLine().trim();
                System.out.print("내용 : ");
                String content = sc.nextLine().trim();
                System.out.println("1번 게시물이 등록되었습니다.");
            }
        }
    }
}