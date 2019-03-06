import java.util.Scanner;

public class HiWorld {

    public void method1() {
        Scanner   sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c = a + b;

        System.out.println(c);

    }


    public static void main(String[] args) {
          HiWorld    HW = new HiWorld();

          HW.method1();
        System.out.println("Hi World  II  ss");

    }
}
