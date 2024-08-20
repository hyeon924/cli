package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc;
    List<Article> articleList = new ArrayList<>();
    App (Scanner sc) {
        this.sc = sc;
    }

    void run () {
        int lastId = 1;
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
                for (int i = 0; i < articleList.size(); i++) { //int i = articleList.size() - 1; i >= 0; i-- 으로 조건을 바꿔주면 목록이 반대로 출력됨
                    Article article = articleList.get(i);
                    System.out.printf("%d, %s, %s\n", article.getId(), article.getSubject(), article.getContent());
                }
            } else if (command.startsWith("delete")) {
                String[] commandList = command.split("\\?", 2);

                String actionCode = commandList[0];

                String[] paramsStr = commandList[1].split("=", 2);

                String key = paramsStr[0];
                String value = paramsStr[1];
                int idx = Integer.parseInt(value);

                Article article = _getFindById(idx);

                if(article == null) {
                    System.out.printf("%d번 게시물은 존재하지 않습니다.\n", idx);
                } else {
                    articleList.remove(article);
                    System.out.printf("%d번 게시물이 삭제되었습니다.\n", idx);
                }
            } else if (command.startsWith("update")) {
                String[] commandList = command.split("\\?", 2);

                String actionCode = commandList[0];

                String[] paramsStr = commandList[1].split("=", 2);

                String key = paramsStr[0];
                String value = paramsStr[1];
                int idx = Integer.parseInt(value);


                Article article = _getFindById(idx);

                if(article == null) {
                    System.out.printf("%d번 게시물은 존재하지 않습니다.\n", idx);
                } else {
                    System.out.printf("제목(기존) : %s\n", article.getSubject());
                    System.out.print("제목 : ");
                    String modifySubject = sc.nextLine();
                    article.setSubject(modifySubject);

                    System.out.printf("내용(기존) : %s\n", article.getContent());
                    System.out.print("내용 : ");
                    String modifyContent = sc.nextLine();
                    article.setContent(modifyContent);

                    System.out.printf("%d번 게시물이 수정되었습니다.\n", idx);
                }

            }
        }
    }

    private Article _getFindById(int id) {
        for (Article item : articleList) {
            if(item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}