import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        boolean firstValid = first > 0 && second <= 0 && third <= 0; 
        boolean secondValid = first <= 0 && second > 0 && third <= 0;
        boolean thirdValid = first <= 0 && second <= 0 && third > 0;
        boolean valid = firstValid || secondValid || thirdValid;
        System.out.println(valid);
    }
}
