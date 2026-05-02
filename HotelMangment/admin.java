/*
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
 */
package hotel_ap;

import static java.awt.SystemColor.menu;
import java.util.Scanner;

/*
  @author Ramin_Afghanyar
 */
public class admin {
    String userName;
    String passWord;
    String username;
    String cpassword;

    admin() {
        userName = "Ramin_Afghanyar";
        passWord = "Afghanyar";
    }

    boolean checkPassword() {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        do {
            System.out.print("Enter user name  : ");
            username = sc.next();
            System.out.print("Enter password   : ");
            cpassword = sc.next();

            boolean flag_check_user = username.equals(userName);
            boolean flag_check_password = cpassword.equals(passWord);

            if (flag_check_user && flag_check_password) {
                System.out.println("Login success....");
                return true;
            } else {
                System.out.println("___________________Sorry, Try again___________________");
                counter++;
                if (counter == 3) {
                    System.out.println("Too many failed attempts. Access denied.");
                    break;
                }
            }
        } while (counter < 3);
        return false;
    }

    void resetPassword() {
        Scanner sc = new Scanner(System.in);
        String psw = passWord;
        System.out.print("Enter current password   : ");
        cpassword = sc.next();
        boolean flag_check_password = cpassword.equals(psw);
        if (flag_check_password) {
            System.out.print("Enter new password       : ");
            String newPass = sc.next();
            System.out.print("Enter new password again : ");
            String confirm = sc.next();
            if (newPass.equals(confirm)) {
                passWord = newPass;
                System.out.println("Password reset successfully!");
            } else {
                System.out.println("Passwords do not match. Password unchanged.");
            }
        } else {
            System.out.println("Current password is wrong. Password unchanged.");
        }
    }

    void adminmenu1() {
        admin admin1 = new admin();
        Scanner sc = new Scanner(System.in);
        menu show_menu = new menu();
        int ch = 0;

        boolean loggedIn = admin1.checkPassword();
        if (!loggedIn) {
            System.out.println("Access denied. Returning to main menu.");
            return;
        }

        do {
            System.out.println("\n____________________Admin Menu____________________");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Reset Password");
            System.out.println("4. Show Menu");
            System.out.println("5. Exit Admin");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    show_menu.additem();
                    break;
                case 2:
                    show_menu.removeitem();
                    break;
                case 3:
                    admin1.resetPassword();
                    break;
                case 4:
                    show_menu.list();
                    break;
                case 5:
                    System.out.println("Exiting admin panel...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (ch != 5);
    }
}
