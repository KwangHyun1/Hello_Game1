import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello world");
        Scanner s = new Scanner(System.in);

        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("캐릭터 이름 : ");
        String name = s.nextLine();
        System.out.printf("%s(이)가 여행을 떠난다.\n퉁퉁이를 만났다\n1. 싸운다\n2. 도망간다\n선택 : ", name);
        int C1 = s.nextInt();
        if(C1 == 1){
            System.out.printf("1. 10번 콤보 공격\n2. 아이템 사용\n3. 방어\n선택 : ");
            int C2 = s.nextInt();
            if(C2 == 1 ){
                System.out.printf("%s가 퉁퉁이에게 10번 콤보 공격을 하였다. 효과는 미미했다.", name);
            }else if(C2 == 2) {
                System.out.print("아이템 입력 : ");
                String C4 = s.nextLine();
                String C3 = s.nextLine();
                System.out.printf("%s이/가 %s를 꺼내었다\n퉁퉁이에게 %s으로 퉁퉁이의 후두부를 깠다\n효과는 굉장했다\n", name, C3, C3);
            }else if(C2 == 3){
                System.out.printf("%s(이)가 방어를 시전하였다\n 퉁퉁이가 %s를 공격하였다.\n효과는 굉장했다.",name,name);
            }else{
                System.out.println("잘못 입력");
            }
        }else if(C1 == 2){
            System.out.println("도망을 갔다");
        }else{
            System.out.println("잘못 입력");
        }

    }

}
