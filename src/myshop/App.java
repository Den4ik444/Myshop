
package myshop;

import java.util.Scanner;
import myshop.myClasses.Buyer;
import myshop.myClasses.History;
import myshop.myClasses.Product;

public class App {
    private Scanner scanner = new Scanner(System.in);
    private Product[] products = new Product [10];
    private Buyer[] buyers = new Buyer[10];
    private History[] histories = new History[10];
    double shopStonks = 0;
    public void run(){
        String repeat = "r";
        do{
            System.out.println("Выберите номер задачи: ");
            System.out.println("0: Выход из программы:");
            System.out.println("1: Добавить модель:");
            System.out.println("2: Список моделей обуви:");
            System.out.println("3. Добовление нового покупателя:");
            System.out.println("4: Список покупателей:");
            System.out.println("5: Покупка обуви:");
            System.out.println("6: Заработанные деньги магазина:");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    repeat="q";
                    System.out.println("Пока! :)");
                    break;
                case 1:
                    System.out.println("---- Добавление модели ----");
                    for (int i = 0; i < products.length; i++) {
                        if(products[i] == null){
                            products[i] = addProduct();
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("---- Список моделей -----");
                    for (int i = 0; i < products.length; i++) {
                        if(products[i] != null){
                            System.out.println(products[i].toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("--- добавление нового покупателя ---");
                    for (int i = 0; i < buyers.length; i++) {
                        if(buyers[i] == null){
                            buyers[i] = addBuyer();
                            break;
                        }
                    }
                break;
                case 4:
                    System.out.println("---- Список покупателей -----");
                    for (int i = 0; i < buyers.length; i++) {
                        if(buyers[i] != null){
                            System.out.println(buyers[i].toString());
                            break;
                        }
                    }
                break;
                case 5:
                    System.out.println("---- покупка обуви -----");
                    for (int i = 0; i < histories.length; i++) {
                        if(histories[i] == null){
                            histories[i] = addHistory();
                            if (buyers[i].getMoney()>=products[i].getPrice()){
                              buyers[i].setMoney (buyers[i].getMoney() - products[i].getPrice()); 
                              shopStonks = products[i].getPrice();
                            }
                            else{
                                System.out.println("выберите другую обувь так как у вас нехватает денег");
                                break;
                            }
                            break;
                        }
                    }
                
                case 6:
                    System.out.println("---- Заработанные деньги -----");
                    System.out.println (shopStonks);
               
                default:
                    System.out.println("Введите номер из списка!");;
            }
            
        }while("r".equals(repeat));
    }
    private Product addProduct(){
        Product product = new Product();
        System.out.print("Введите название категории: ");
        product.setCategory(scanner.nextLine());
        System.out.println("фирма обуви: ");
        System.out.print("Введите название модели: ");
        product.setModel(scanner.nextLine());
        System.out.print("Введите фирму обуви: ");
        product.setFirm(scanner.nextLine());
        System.out.print("Введите размер обуви: ");
        product.setSize(scanner.nextInt()); scanner.nextLine();
        System.out.print("Цена обуви: ");
        product.setPrice(scanner.nextInt()); scanner.nextLine();    
        return product;
    }
    private Buyer addBuyer(){
        Buyer buyer= new Buyer();
        System.out.print("Введите имя: ");
        buyer.setFirstName(scanner.nextLine());
        System.out.print("Введите фамилию: ");
        buyer.setLastName(scanner.nextLine());
        System.out.print("Введите номер телефона: ");
        buyer.setPhone (scanner.nextLine());
        System.out.print("Количество ваших денег: ");
        buyer.setMoney(scanner.nextInt()); scanner.nextLine(); 
        return buyer;
    }
    private History addHistory(){
        History history = new History();
        System.out.println("Список обуви: ");
        for (int i = 0; i < products.length; i++) {
            if(products[i] != null){
                System.out.println(i+1+". "+products[i].toString());
            }
        }
        System.out.print("Введите номер модели: ");
        int numberModel = scanner.nextInt(); scanner.nextLine();
        System.out.println("Список покупателей: ");
        for (int i = 0; i < buyers.length; i++) {
            if(buyers[i] != null){
                System.out.println(i+1+". "+buyers[i].toString());
            }
        }
        System.out.print("Введите номер покупателя: ");
        int numberBuyer = scanner.nextInt(); scanner.nextLine();
        history.setProduct(products[numberModel-1]);
        history.setBuyer(buyers[numberBuyer-1]);
        return history;
    }
}
    
   

