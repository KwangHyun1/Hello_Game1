public class MainClass {
    public static void main(String[] args) {
        System.out.println("hello world");

        //클래스 부르기
         NameSet ns = new NameSet();
         ns.setName();
         String name = ns.getName();
         PlayClass pc = new PlayClass();
        int C1 = pc.play1(name);
         pc.play2(name, C1);
    }
}
