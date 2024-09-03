//package day8.miniproject;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Require {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<String> Ctitle = new ArrayList<>();
//        ArrayList<String> CIndex = new ArrayList<>();
//        ArrayList<Post> posts = new ArrayList<>();
//
//        int lastestId = 1; // 가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가
//
//        while (true) {
//            System.out.print("명령어 : ");
//            String commend = sc.nextLine();
//            if (commend.equals("exit")) {
//                System.out.print("프로그램을 종료합니다.");
//                break;
//
//            } else if (commend.equals("add")) {
//                System.out.print("게시물 제목을 입력해주세요: ");
//                String title = sc.nextLine();
//                Ctitle.add(title);
//
//
//                System.out.print("게시물 내용을 입력해주세요: ");
//                String index = sc.nextLine();
//                CIndex.add(index);
//
//                Post post = new Post(lastestId);
//                posts.add(post);
//
//                System.out.println("게시물이 등록되었습니다.");
//                lastestId++;
//                // 1부터 1씩 증가 -> 고유값 유지하는데 편리.
//
//            } else if (commend.equals("list")) {
//                System.out.println("명령어 : list");
//                System.out.println("==================");
//                for (int listi = 0; listi < Ctitle.size(); listi++) {
//                    System.out.println("번호 : " + posts.get(listi).getId());
//                    System.out.println("제목 : " + Ctitle.get(listi));
////                    System.out.println("내용 : " + CIndex.get(listi));
//                    System.out.println("==================");
//                }
//            } else if (commend.equals("update")) {
//                System.out.println("명령어 : update");
//                System.out.print("수정할 게시물 번호 : ");
//                int updateIndex = Integer.parseInt(sc.nextLine());
//
//                if (updateIndex <= 0) {
//                    System.out.println("없는 게시물 번호입니다.");
//                } else if (updateIndex > CIndex.size()) {
//                    System.out.println("없는 게시물 번호입니다.");
//                } else {
//                    updateIndex--;
//                    System.out.print("수정할 게시물 제목 : ");
//                    String newTitle = sc.nextLine();
//                    System.out.print("수정할 게시물 내용 : ");
//                    String newIndex = sc.nextLine();
//
//                    Ctitle.set(updateIndex, newTitle);
//                    CIndex.set(updateIndex, newTitle);
//
//                    System.out.println((updateIndex + 1) + "번 게시물이 수정되었습니다.");
//                }
//            } else if (commend.equals("delete")) {
//                System.out.println("명령어 : delete");
//                System.out.print("삭제할 게시물 번호 : ");
//                int deleteIndex = Integer.parseInt(sc.nextLine());
//
//                if (deleteIndex <= 0 || deleteIndex > Ctitle.size()) {
//                    System.out.println("없는 게시물 번호입니다.");
//                } else {
//                    deleteIndex--;
//                    posts.remove(deleteIndex);
//                    Ctitle.remove(deleteIndex);
//                    CIndex.remove(deleteIndex);
//                    System.out.println((deleteIndex + 1) + "번 게시물이 삭제되었습니다.");
//                }
//            } else {
//                System.out.println("잘못된 입력입니다.");
//            }
//        }
//    }
//}
//
//class Post {
//    private int id;
//
//    public Post(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }


//    private String title;
//    private String index;
//
//    public String getIndex() {
//        return index;

//
//    public void setIndex(String index) {
//        this.index = index;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//}
//
//    public void setIndex(String index) {
//        this.index = index;
//    }
//}
//
//
//
