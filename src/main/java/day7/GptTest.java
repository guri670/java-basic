package day7;

public class GptTest {
    public static void main(String[] args) {

        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            void introduce() {
                System.out.println("안녕하세요, 저는 " + name + "이고, " + age + "살입니다.");
            }
        }
        class Student extends Person{
            String studentId;

            Student(String name, int age, String studentId){
                super(name, age);
                this.studentId = studentId;
            }
            void introduce(){
                System.out.println("안녕하세요, 저는 " + name + "이고, " + age + "살입니다. 제 학번은" +studentId+ "입니다.");
            }
        }
    }
}

