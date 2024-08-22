package org.example.article;

public class Article {
    private final int id;
    private String subject;
    private String content;

    Article(int id, String subject, String content) {
        this.id = id;
        this.subject = subject;
        this.content = content;
    }

    int getId() {
        return this.id;
    }

    String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}