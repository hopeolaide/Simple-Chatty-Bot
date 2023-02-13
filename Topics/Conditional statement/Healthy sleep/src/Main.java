import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minSleep = scanner.nextInt();
        int maxSleep = scanner.nextInt();
        int actualSleep = scanner.nextInt();

        if (actualSleep < minSleep) {
            System.out.println("Deficiency");
        } else if (actualSleep > maxSleep) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}