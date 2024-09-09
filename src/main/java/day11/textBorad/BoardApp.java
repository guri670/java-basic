package day11.textBorad;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {

    private BoardController boardController = new BoardController();
    private Scanner sc = new Scanner(System.in);

    public void run() {

        while (true) {
            System.out.print("명령어 : ");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                boardController.add();
            } else if (command.equals("list")) {
                boardController.list();
            } else if (command.equals("update")) {
                boardController.update();
            } else if (command.equals("delete")) {
                boardController.delete();
            } else if (command.equals("detail")) {
                boardController.detail();
            } else if (command.equals("search")) {
                boardController.search();
            }
        }
    }
}





