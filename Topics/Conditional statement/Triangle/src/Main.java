import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naturalA = scanner.nextInt();
        int naturalB = scanner.nextInt();
        int naturalC = scanner.nextInt();

        if (naturalA + naturalB > naturalC) {
            if (naturalA + naturalC > naturalB) {
                if (naturalB + naturalC > naturalA) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }

    }
}