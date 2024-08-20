package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc;

    App (Scanner sc) {
        this.sc = sc;
    }

    void run () {
        int lastId = 1;
        List<Article> articleList = new ArrayList<>();
        System.out.println("== 게시판 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();

            if (command.equals("end")) {
                break;
            } else if (command.equals("add")) { //equals 문자열을 정확하게 비교하기 위해서 작성
                System.out.print("subject : ");
                String subject = sc.nextLine().trim(); //trim 공백을 제거하고 받기 위해서 작성
                System.out.print("content : ");
                String content = sc.nextLine().trim();


                Article article = new Article(lastId, subject, content);
                articleList.add(article);

                System.out.printf("%d번 게시물이 등록되었습니다.\n", lastId); // 증감 처리, 게시물이 등록 될 때마다 n번째로 증감이 되어야함.
                lastId++;
            } else if (command.equals("list")) {
                System.out.println("Number / Title / Content");
                System.out.println("----------------------");
                for (int i = 0; i < articleList.size(); i++) {
                    Article article = articleList.get(i);
                    System.out.printf("%d, %s, %s\n", article.getId(), article.getSubject(), article.getContent());
                }
            }
        }
    }
}