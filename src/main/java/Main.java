// dev branch for Y.Practicum

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        People people = new People();
        int numberPeople = people.getQuantityOfPeople(); // получаем количество человек


        Calculator cal = new Calculator();
        Price price = new Price();
        Formatter form = new Formatter();

        while (true) {
            System.out.println("Введите название товара");
            String productName = cal.getProductName(); // переменная имени товара для цикла
            cal.getListOfProducts(productName); // получаем список товаров

            System.out.println("Введите стоимость товара в формате \"рубли, копейки\" например 35,75");
            double priceProduct = price.getPriceProduct(); // переменная стоимости товара для цикла
            price.getSumProducts(priceProduct); // получаем сумму товаров

            System.out.println("Хотите добавить еще товар? - Если да, напишите любой символ или напишите \"Завершить\" для выхода.");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("Завершить")) {
                form.getData(cal.listOfProducts, price.sumProducts, numberPeople); // выводим данные
                break;
            }
            sc.nextLine();


        }

    }
}
