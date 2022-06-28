import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random rd = new Random();

        for(int i=0;i<6;i++) {
            System.out.print("["+(rd.nextInt(45)+1)+"]"); //로또번호 출력
        }
    }
}

