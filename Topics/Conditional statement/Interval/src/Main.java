import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        boolean interval1 = inputNum > -15 && inputNum <= 12;
        boolean interval2 = inputNum > 14 && inputNum < 17;
        boolean interval3 = inputNum >= 19;

        if (interval1 || interval2 || interval3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}