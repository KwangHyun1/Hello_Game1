import java.util.Scanner;

/*
    이름을 설정하는 클래스
 */
public class NameSet {
    Scanner s = new Scanner(System.in);
    //메소드
    public void setName(){
        System.out.println("이름 설정 가능");
        String name = s.nextLine();
    }
    public  void getName(){
        System.out.println("이름 출력 가능");
    }

}
