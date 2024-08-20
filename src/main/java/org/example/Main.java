package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 진입할때 필요한 세팅값은 Main에 남겨 놓는다.
        new App(sc).run(); // 실행
        sc.close(); // 마무리
    }
}