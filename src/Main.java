import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите пункт меню");
            System.out.println("1) Работа с товарами");
            System.out.println("2) Работа со складом");
            System.out.println("0) Выход  из программы");
            int mainMenuItem = sc.nextInt();
            if (mainMenuItem == 1) {
                //Метод для работы с товарами
                workWithProducts(sc);
            } else if (mainMenuItem == 2) {
                // Метод для работы со складами
                workWithStorages(sc);
            } else if (mainMenuItem == 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход из программы...");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ошибка. Введите цифру из меню!!!");
            }
        }
    }

    private static void workWithProducts(Scanner sc) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Выберите пункт меню в работе с товарами");
        System.out.println("1) Добавление товара на склад");
        System.out.println("2) Добавление группы товаров на склад");
        System.out.println("3) Удаление товара со склада");
        System.out.println("4) Удаление группы товаров со склада");
        System.out.println("5) Показать типы товаров и их количество");
        System.out.println("0) Выход в главное меню");
        while (true) {
            int mainMenuItem = sc.nextInt();
            if (mainMenuItem == 1) {
                // Метод для добавления товара на склад
                productAddition(sc);
            } else if (mainMenuItem == 2) {
                System.out.println();
            } else if (mainMenuItem == 3) {
                System.out.println();
            } else if (mainMenuItem == 4) {
                System.out.println();
            } else if (mainMenuItem == 5) {
                System.out.println();
            } else if (mainMenuItem == 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход в главное меню");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ошибка. Введите цифру из меню!!!");
            }
        }
    }

    private static void workWithStorages(Scanner sc) {
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите пункт меню в работе со складами");
            System.out.println("1) Показать список складов и товаров в них");
            System.out.println("2) Добавть новый склад");
            System.out.println("3) Удалить склад");
            System.out.println("0) Выход в главное меню");
            int mainMenuItem2 = sc.nextInt();
            if (mainMenuItem2 == 1) {
                System.out.println();
            } else if (mainMenuItem2 == 2) {
                System.out.println();
            } else if (mainMenuItem2 == 3) {
                System.out.println();
            } else if (mainMenuItem2 == 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход в главное меню");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ошибка. Введите цифру из меню!!!");
            }
        }
    }

    private static void productAddition(Scanner sc) {
        Stock1 stock1 = new Stock1();
        Stock2 stock2 = new Stock2();
        Stock3 stock3 = new Stock3();
        Stock[] stocks = new Stock[3];
        stocks[0] = stock1;
        stocks[1] = stock2;
        stocks[2] = stock3;
            System.out.println("Выберите товар для добовления на склад: ");
            System.out.println("Коробка с шампунями" + "\nКоробка с мылом" + "\nБлок с напитка");
        while (true) {
            String choice = sc.nextLine();
            switch (choice) {
                case "Коробка с шампунями":
                    Stock.Products shampoo = new Stock.Products();
                    shampoo.setType("Шампунь");
                    shampoo.setName("Head & Shoulders");
                    shampoo.setVolume(3);
                    shampoo.setProducingCountry("Америка");
                    System.out.println(shampoo);
                    break;
                case "Коробка с мылом":
                    Stock.Products soap = new Stock.Products();
                    soap.setType("Мыло");
                    soap.setName("Хозяйственное мыло");
                    soap.setVolume(4);
                    soap.setProducingCountry("Россия");
                    System.out.println(soap);
                    break;
                case "Блок с напитка":
                    Stock.Products cocaCola = new Stock.Products();
                    cocaCola.setType("Напиток");
                    cocaCola.setName("Coca cola");
                    cocaCola.setVolume(5);
                    cocaCola.setProducingCountry("Америка");
                    System.out.println(cocaCola);
                    break;
                default:

            }
        }
    }
}