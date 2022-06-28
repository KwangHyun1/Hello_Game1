import java.util.Scanner;

/*
    이름을 설정하는 클래스
 */
public class NameSet {
    Scanner s = new Scanner(System.in);
    private String name;
    //메소드
    public void setName(){
        System.out.print("이름 설정 가능\n이름 설정 :");
        name = s.nextLine();
    }
    public String getName(){
        System.out.println("Hi, "+name);
        return name;
    }

}
