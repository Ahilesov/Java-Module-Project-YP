import java.util.Scanner;
public class Calculator {
    Scanner sc = new Scanner(System.in);
    String productName;
    String listOfProducts = "";

    // метод получения наименования товара с проверкой данных
    public String getProductName() {

        while (true) {
            if (!sc.hasNextInt()) {
                productName = sc.nextLine();
                return productName;
            } else {
                System.out.println("Введено не корректное наименование товара. Повторите ввод.");
            }
            sc.nextLine();
        }
    }

    // метод получения списка товаров
    public void getListOfProducts (String productName) {
        this.listOfProducts += productName + "\n";
    }


}
