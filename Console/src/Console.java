import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của em iu: ");
        String name = scanner.nextLine();

        System.out.println("Your name:" + name);
    }
}