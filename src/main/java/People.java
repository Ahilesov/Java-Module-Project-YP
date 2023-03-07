import java.util.Scanner;

public class People {
    Scanner sc = new Scanner(System.in);
    int numberPeople;

    public int getQuantityOfPeople() {
        System.out.println("На скольких человек необходимо разделить счёт?");

        while (true) {
            if (sc.hasNextInt()) {
                numberPeople = sc.nextInt();
                if (numberPeople <=1) {
                    System.out.println("Введено отрицательное значение или 1.Повторите ввод.");
                } else {
                    return numberPeople;
                }
            } else {
                System.out.println("Введено не корректное значение.Повторите ввод.");
            }
            sc.nextLine();
        }
    }
}
