import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("hello world");

        //클래스 부르기
         NameSet ns = new NameSet();
         ns.setName();
         //이름 만들기
         String name = ns.getName();
         // 아이템 설정
         ns.setItme();
         // 게임 스타트
         PlayClass pc = new PlayClass();
         int C1 = pc.play1(name);
        ArrayList<ItemsClass> item = (ArrayList<ItemsClass>) ns.getItemList();
        ArrayList<ItemsClass> at = (ArrayList<ItemsClass>) ns.getItemList();
        System.out.println(item.size());
         pc.play2(name, C1, item, at);



    }

}
