import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        boolean inRange1 = first >= second && first <= third;
        boolean inRange2 = first <= second && first >= third;
        boolean inRange = inRange1 || inRange2;
        System.out.println(inRange);
    }
}

