package org.example;

public class Article { // 등록 된 값을 저장 하기 위해 객체를 만들고 배열에 넣기 위함
    private int id; // public으로 열어야하는 경우 아니면 웬만해서는 private으로 써주기
    private String subject;
    private String content;

    Article(int id, String subject, String content) { // article 생성자 함수를 만듦
        this.id = id;
        this.subject = subject;
        this.content = content;
    }

    public int getId () {
        return this.id;
    }
    public String getSubject () {
        return this.subject;
    }
    public String getContent () {
        return this.content;
    }

}