import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int enemyArmy = scanner.nextInt();

        if (enemyArmy < 1) {
            System.out.println("no army");
        } else if (enemyArmy <= 19) {
            System.out.println("pack");
        } else if (enemyArmy <= 249) {
            System.out.println("throng");
        } else if (enemyArmy <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}