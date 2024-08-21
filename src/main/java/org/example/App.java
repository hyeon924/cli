package org.example;

import org.example.article.ArticleController;
import org.example.system.SystemController;

public class App {
    ArticleController articleController;
    SystemController systemController;


    App () {
        articleController = new ArticleController();
        systemController = new SystemController();
    }

    public void run () {
        System.out.println("== 게시판 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String command = Container.getSc().nextLine().trim();
            // 커맨드에 입력한 내용을 actionCode, idx로 분류해서 필드로 저장
            Request request = new Request(command);

            if (request.getActionCode().equals("end")) {
                systemController.exit();
                break;
            } else if (request.getActionCode().equals("add")) {
                articleController.write();
            } else if (request.getActionCode().equals("list")) {
                articleController.list();
            } else if (request.getActionCode().startsWith("delete")) {
                articleController.delete(request);
            } else if (request.getActionCode().startsWith("modify")) {
                articleController.modify(request);
            }
        }
    }


}