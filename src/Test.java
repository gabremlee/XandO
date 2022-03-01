import java.util.Scanner;

public class Test {
    boolean a = true;
    void state(){
        a = !a;
    }

    void it(int b){
        if((b <= 10 & a)){
            state();
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Test gab = new Test();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter digit");
        int b = scanner.nextInt();
        System.out.println("enter alphabet");
        String c = scanner.next();
        gab.it(b);
    }
}
