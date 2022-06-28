import java.util.Scanner;

public class PlayClass {
    Scanner s = new Scanner(System.in);
    public void play1(String name){
        System.out.printf("%s(이)가 여행을 떠난다.\n퉁퉁이를 만났다\n1. 싸운다\n2. 도망간다\n선택 : ", name);
        int C1 = s.nextInt();
    }

}
