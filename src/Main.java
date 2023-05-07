import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Используя консольный ввод, создайте несколько строк, с помощью метода parseInt()
        // приведите их к целочисленному типу данных.
        // Если строка не может быть приведена к целому числу, выведите на экран “Not valid”.

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        double a1 = Double.parseDouble(a);
        double b1 = Double.parseDouble(b);

        if (a1 % 1 == 0) {
            System.out.println(a1 + " Valid");
        } else {
            System.out.println(a1 + " Not Valid");
        }

        if (b1 % 1 == 0) {
            System.out.println(b1 + " Valid");
        } else {
            System.out.println(b1 + " Not Valid");
        }

    }
}