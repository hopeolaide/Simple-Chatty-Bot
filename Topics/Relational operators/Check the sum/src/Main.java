import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean a20Test = a + b == 20 || a + c == 20;
        boolean b20Test = b + a == 20 || b + c ==20;
        boolean c20Test = c + a == 20 || c + b ==20;

        boolean exact20 = a20Test || b20Test || c20Test;

        System.out.println(exact20);


    }
}