
package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] firms = {"Rolex", "Omega", "Casio"};
        String[][] brands = {{"Rolex", "Luxury"}, {"Omega", "Premium"}, {"Casio", "Super-puper"}};

        ArrayList<Customer> customers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите данные клиента для оформления заказа " + (i + 1) + ":");
            System.out.print("Напишите ФИО: ");
            String fullName = scanner.nextLine();
            System.out.print("Напишите свой email: ");
            String email = scanner.nextLine();
            System.out.print("Напишите свой номер телефона: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Доступные позиции в магазине:");
            for (int j = 0; j < firms.length; j++) {
                System.out.println((j + 1) + ". " + brands[j][1] + " " + firms[j]);
            }

            System.out.print("Выберите позицию: ");
            int position = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.print("Выберите кол-во: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            customers.add(new Customer(fullName, email, phoneNumber, new String[]{firms[position], brands[position][0]}, quantity));
        }

        System.out.println("\nЗаказы:");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("Заказы " + (i + 1) + ":");
            System.out.println("Пользователь: " + customer.getFullName() + ", Email: " + customer.getEmail() + ", Номер телефона: " + customer.getPhoneNumber());
            System.out.println("Позиция: " + customer.getPosition()[1] + " " + customer.getPosition()[0] + ", кол-во: " + customer.getKolishestvo());
            System.out.println();
        }
    }
}

class Customer {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String[] position;
    private int kolishestvo;

    public Customer(String fullName, String email, String phoneNumber, String[] position, int kolishestvo) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.kolishestvo = kolishestvo;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String[] getPosition() {
        return position;
    }

    public int getKolishestvo() {
        return kolishestvo;
    }
}
