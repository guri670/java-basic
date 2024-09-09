//package day12.textBorad;
//
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ControllerBoard {
//    private Scanner sc = new Scanner(System.in);
//    private RepositoryBoard repositoryBoard = new RepositoryBoard();
//    private ViewBoard viewBoard = new ViewBoard();
//    int lastestId = 1;
//
//    public void add() {
//        System.out.print("게시물 제목을 입력해주세요 : ");
//        String title = sc.nextLine();
//        System.out.print("게시물 내용을 입력해주세요 : ");
//        String body = sc.nextLine();
//        Text text = new Text(lastestId ,title, body);
//
//        repositoryBoard.save(text);
//        lastestId++;
//        System.out.println("게시물이 등록되었습니다.");
//    }
//
//    public void list() {
//        ArrayList<Text> Texts = RepositoryBoard.getTexts();
//        viewBoard.printViewBoard(texts);
//    }
//}
//
