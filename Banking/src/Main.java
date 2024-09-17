import Entity.Customer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        Customer customer=new Customer();
//        Customer customer1= new Customer(1,"AnhVinhancut");
//        customer1.setName("Bill Gate");
//        System.out.println("Id:"+customer1.getId()+"\nName:"+customer1.getName());
//        System.out.println(customer1);
        System.out.println("Enter ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name");
        String name = scanner.nextLine();

        customer.setId(id);
        customer.setName(name);

        System.out.println(customer);

    }
}