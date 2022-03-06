package credit_card;

/*
* Основное задание
    1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    1.1. Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    1.2. Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    1.3. Добавьте метод, который выводит текущую информацию о карточке.
    1.4. Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
    Тестовый сценарий для проверки:
    1.5. Положите деньги на первые две карточки и снимите с третьей.
    1.6. Выведите на экран текущее состояние всех трех карточек.
* */

public class Main {

    public static void main(String[] args) {

        CreditCard firstCard = new CreditCard();
        firstCard.setAccNumber("BY28BLBB30140000000000001");
        firstCard.setAccSum(14);

        CreditCard secondCard = new CreditCard();
        secondCard.setAccNumber("BY28BLBB30140000000000002");
        secondCard.setAccSum(412);

        CreditCard thirdCard = new CreditCard();
        thirdCard.setAccNumber("BY28BLBB30140000000000003");
        thirdCard.setAccSum(883_891);


        System.out.println(firstCard);
        System.out.println(secondCard);
        System.out.println(thirdCard);

        firstCard.accrueAccSum(16);
        secondCard.accrueAccSum(88);
        thirdCard.writeOffAccSum(891);


        System.out.println("\n\n\n");

        System.out.println(firstCard);
        System.out.println(secondCard);
        System.out.println(thirdCard);
    }
}
