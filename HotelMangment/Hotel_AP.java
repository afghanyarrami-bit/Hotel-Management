package hotel_ap;

import java.util.Scanner;

/**
 * @author Ramin_Afghanyar
 * Hotel Management System - Terminal Based
 */
public class Hotel_AP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("====================================");
        System.out.println("   AFGHAN HOTEL Management System  ");
        System.out.println("====================================");

        while (running) {
            System.out.println("\n Press 1 for Customer");
            System.out.println(" Press 2 for Admin");
            System.out.println(" Press 0 to Exit");
            System.out.print(" Enter your choice : ");

            int c = sc.nextInt();

            switch (c) {
                case 1: {
                    // Customer flow - supports multiple customers
                    customers customer = new customers();
                    customer.customerData1();

                    menu show_menu = new menu();
                    show_menu.list();
                    break;
                }
                case 2: {
                    admin admin1 = new admin();
                    admin1.adminmenu1();
                    break;
                }
                case 0: {
                    System.out.println("\n Have a good day! خدا حافظ");
                    running = false;
                    break;
                }
                default: {
                    System.out.println(" Wrong input. Please enter 1, 2, or 0.");
                    break;
                }
            }
        }
        sc.close();
    }
}


