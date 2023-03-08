import java.util.Scanner;

public class Price {
    Scanner sc = new Scanner(System.in);
    double priceProduct;
    double sumProducts = 0;

    // метод получения цены товара с проверкой данных
    public double getPriceProduct() {
        while (true) {
            if (sc.hasNextDouble()) {
                priceProduct = sc.nextDouble();
                if (priceProduct <= 0) {
                    System.out.println("Введено отрицательное или нулевое значение стоимости. Повторите ввод.");
                } else {
                    return priceProduct;
                }
            } else {
                System.out.println("Введено не корректное значение стоимости. Повторите ввод.");
            }
            sc.nextLine();
        }
    }

    // метод получения суммы всех товаров
    public void getSumProducts(double sumProducts) {
        this.sumProducts += sumProducts;
        System.out.println("Товар добавлен!");
    }


}
