public class Formatter {
    double sumOnPerson;
    // метод вывода необходимых данных
    public void getData(String listOfProducts, double sumProducts, int numberPeople) {
        System.out.println("Добавленные товары:" + "\n" + listOfProducts);
        sumOnPerson = sumProducts / numberPeople;
        System.out.println("Количество человек " + numberPeople);
        System.out.println("Общая сумма товаров " + String.format("%.2f", sumProducts) + formatter());
        System.out.println("На каждого человека по " + String.format("%.2f", sumOnPerson) + formatter());
    }

    // метод склонения слово "рубль" в зависимости от полученной суммы на каждого человека
    public String formatter() {
        if ((int)(sumOnPerson % 100 / 10) == 1) {
            return " рублей.";
        }
        switch ((int) (sumOnPerson % 10)) {
            case 1:
                return " рубль.";
            case 2:
            case 3:
            case 4:
                return " рубля.";
            default:
                return " рублей.";
        }
    }
}
