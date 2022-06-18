import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product shampoo = new Product();
        shampoo.setType("Шампунь");
        shampoo.setName("Head & Shoulders");
        shampoo.setVolume(3);
        shampoo.setProducingCountry("Америка");
        Product soap = new Product();
        soap.setType("Мыло");
        soap.setName("Хозяйственное мыло");
        soap.setVolume(4);
        soap.setProducingCountry("Россия");
        Product cocaCola = new Product();
        cocaCola.setType("Напиток");
        cocaCola.setName("Coca cola");
        cocaCola.setVolume(5);
        cocaCola.setProducingCountry("Америка");
        ArrayList<Stock> stocks = new ArrayList<>();
        Stock stock1 = new Stock();
        Stock stock2 = new Stock();
        Stock stock3 = new Stock();
        stocks.add(stock1);
        stocks.add(stock2);
        stocks.add(stock3);
        ArrayList<Product> products = new ArrayList<>();
        products.add(shampoo);
        products.add(soap);
        products.add(cocaCola);
        while (true) {
            int mainMenuItem;
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберитепунктменю");
            System.out.println("1) Работа с товарами");
            System.out.println("2) Работа со складом");
            System.out.println("0) Выход  из программы");
            mainMenuItem = sc.nextInt();
            if (mainMenuItem == 1) {
                // Метод для работы с товарами
                workWithProducts(sc, stocks, products);
            } else if (mainMenuItem == 2) {
                // Метод для работы со складами
                workWithStorages(sc,stocks, products);
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

    private static void workWithProducts(Scanner sc, ArrayList<Stock> stocks, ArrayList<Product> products) {
        int mainMenuItem;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Выберите пункт меню в работе с товарами");
        System.out.println("1) Добавление товара на склад");
        System.out.println("2) Добавление группы товаров на склад");
        System.out.println("3) Удаление товара со склада");
        System.out.println("4) Удаление группы товаров со склада");
        System.out.println("5) Показать типы товаров и их количество");
        System.out.println("0) Выход в главное меню");
        while (true) {
            mainMenuItem = sc.nextInt();
            if (mainMenuItem == 1) {
                // Метод для добавления товара на склад
                productAddition(sc, stocks, products);
            } else if (mainMenuItem == 2) {
                // Метод для добавления групп товаров на склад
                productGroup(sc, stocks, products);
            } else if (mainMenuItem == 3) {
                System.out.println();
            } else if (mainMenuItem == 4) {
                System.out.println();
            } else if (mainMenuItem == 5) {
                // Метод для показания типов товара и их количества
                allProduct(stocks, products);
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

    private static void workWithStorages(Scanner sc, ArrayList<Stock> stocks, ArrayList<Product> products) {
        int mainMenuItem;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Выберите пункт меню в работе со складами");
        System.out.println("1) Показать список складов и товаров в них");
        System.out.println("2) Добавть новый склад");
        System.out.println("3) Удалить склад");
        System.out.println("0) Выход в главное меню");
        while (true) {
            mainMenuItem = sc.nextInt();
            if (mainMenuItem == 1) {
                // Метод для показания списка складов и товаров в них
                allStock(stocks, products);
            } else if (mainMenuItem == 2) {
                // Метод для добавления склада
                newStock(stocks);
            } else if (mainMenuItem == 3) {
                // Метод для удаления склада
                deliteStock(stocks);
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

    private static void productAddition(Scanner sc, ArrayList<Stock> stocks, ArrayList<Product> products) {
        System.out.println("1)Добавление шампуня на склад");
        System.out.println("2)Добавление мыло на склад");
        System.out.println("3)Добавление напитка на склад");
        System.out.println("0)Выход в главное меню");
        while (true) {
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                System.out.println(products.get(0));
            } else if (choice1 == 2) {
                System.out.println(products.get(1));
            } else if (choice1 == 3) {
                System.out.println(products.get(2));
            } else if (choice1 == 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход из программы...");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ошибка. Введите цифру из меню!!!");
            }
        }
        addNewProduct(stocks, products);
    }

    private static void productGroup(Scanner sc, ArrayList<Stock> stocks, ArrayList<Product> products) {
        System.out.print("Введите количество товаров: ");
        int choice2 = sc.nextInt();
        System.out.println("1)Добавление шампуня на склад");
        System.out.println("2)Добавление мыло на склад");
        System.out.println("3)Добавление напитка на склад");
        System.out.println("0)Выход в главное меню");
        System.out.print("Выберите товар для добавления: ");
        while (true) {
        int choice3 = sc.nextInt();
        if (choice3 == 1) {
            for (int i = 0; i < choice2; i++) {
            System.out.println(products.get(0));
            }
        } else if (choice3 == 2) {
            for (int a = 0; a < choice2; a++) {
            System.out.println(products.get(1));
            }
        } else if (choice3 == 3) {
            for (int s = 0; s < choice2; s++) {
            System.out.println(products.get(2));
            }
        } else if (choice3 == 0) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выход из программы...");
            break;
        } else {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Ошибка. Введите цифру из меню!!!");
        }
    }
    addNewProduct(stocks, products);
    }


    public static void addNewProduct(ArrayList<Stock> stocks, ArrayList<Product> products) {
        for (Stock stock : stocks) {
            ArrayList<Product> productsInStock = new ArrayList<>();
            ArrayList<Product> productsInUse = new ArrayList<>();
            for (Product p : products) {
                if ((stock.getVolume() > p.getVolume()) && !productsInUse.contains(p)) {
                    stock.setVolume(stock.getVolume() - p.getVolume());
                    productsInStock.add(p);
                    productsInUse.add(p);
                } else {
                    break;
                }
            }
            stock.setProduct(productsInStock);
            productsInStock = new ArrayList<>();
        }
    }

    private static void allStock(ArrayList<Stock> stocks, ArrayList<Product> products) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Информация о всех Складах:");
        addNewProduct(stocks, products);
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
    }

    private static void newStock(ArrayList<Stock> stocks) {
        Stock stock4 = new Stock();
        stocks.add(stock4);
        addNewProduct(stocks, new ArrayList<Product>());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Один склад был добавлен");
    }

    private static void allProduct(ArrayList<Stock> stocks, ArrayList<Product> products) {
        int counterShampoo = 0;
        int counterSoap = 0;
        int counterdrink = 0;
        for (Product product : products) {
            if (product.getType().equals("Шампунь")) {
                counterShampoo++;
            } else if (product.getType().equals("Мыло")) {
                counterSoap++;
            } else if (product.getType().equals("Напиток")) {
                counterdrink++;
            }
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Все товары со всех складов");
        System.out.println("Коробки с шампунем " + counterShampoo + " товара(ов)");
        System.out.println("Коробки с мылом " + counterSoap + " товара(ов)");
        System.out.println("Блок c напитком " + counterdrink + " товара(ов)");
    }

    private static void deliteStock(ArrayList<Stock> stocks) {
        stocks.remove(0);
        addNewProduct(stocks, new ArrayList<Product>());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Один склад был удалён");
    }
}


