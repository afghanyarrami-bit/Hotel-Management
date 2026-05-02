/*
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
 */
package hotel_ap;

import java.util.Scanner;
import java.util.*;

/*
 
  @author Ramin_Afghanyar
 */
public class menu {
	int ch;
	static int cbill;
	admin admin1 = new admin();
	ArrayList main_menu = new ArrayList();
	ArrayList list_Afghani = new ArrayList();
	ArrayList price_Afghani = new ArrayList();
	ArrayList list_H = new ArrayList();
	ArrayList price_H = new ArrayList();
	ArrayList list_K = new ArrayList();
	ArrayList price_k = new ArrayList();
	ArrayList list_chainies = new ArrayList();
	ArrayList prize_chainies = new ArrayList();
	ArrayList list_tea = new ArrayList();
	ArrayList prize_tea = new ArrayList();
	ArrayList list_icecream = new ArrayList();
	ArrayList prize_icecream = new ArrayList();
	ArrayList list_local = new ArrayList();
	ArrayList prize_local = new ArrayList();
	ArrayList nullA = new ArrayList();
	Scanner sc = new Scanner(System.in);
	String hotelName = "AFGHAN HOTEL";

	menu() {
		main_menu.add("1.Afghanistan");
		main_menu.add("2.Herati");

		main_menu.add("4.Kabulie");
		main_menu.add("3.chainies");
		main_menu.add("5.tea");
		main_menu.add("6.icecrime");
		main_menu.add("7.Local");
		main_menu.add("8.exit");

		list_Afghani.add("Vada Sambar");
		price_Afghani.add(100);
		list_Afghani.add("Idli Vada Sambar");
		price_Afghani.add(150);
		list_Afghani.add("Idli Fry");
		price_Afghani.add(120);
		list_Afghani.add("Dahi Idli");
		price_Afghani.add(170);
		list_Afghani.add("Upma");
		price_Afghani.add(100);
		list_Afghani.add("Batata Fry");
		price_Afghani.add(120);

		list_H.add("Roti/Puri");
		price_H.add(10);
		list_H.add("Rice/Dal");
		price_H.add(40);
		list_H.add("Alu Subji/Leelu Shak");
		price_H.add(30);
		list_H.add("Papad/Goor");
		price_H.add(10);

		list_chainies.add("Prawn Chips");
		prize_chainies.add(130);
		list_chainies.add("Chinese Sausage");
		prize_chainies.add(120);
		list_chainies.add("Wor Wonton");
		prize_chainies.add(170);
		list_chainies.add("Cantonese Chow Mein (Lg)");
		prize_chainies.add(130);
		list_chainies.add("halks nudals");
		prize_chainies.add(160);
		list_chainies.add("Beef Chow Mein");
		prize_chainies.add(140);
		list_chainies.add("Mushroom Chow Mein");
		prize_chainies.add(170);
		list_chainies.add("Shrimp Chow Mein");
		prize_chainies.add(130);
		list_chainies.add("Beef and Tomato Chow Mein (Lg)");
		prize_chainies.add(200);
		list_chainies.add("House Special Chow Mein (Lg)");
		prize_chainies.add(300);

		list_K.add("Sarson Ka Saag Aur Makki Ki Roti");
		price_k.add(200);
		list_K.add("Chole Bhature");
		price_k.add(60);
		list_K.add("Masala Channa");
		price_k.add(50);
		list_K.add("Dal Makhani");
		price_k.add(100);
		list_K.add("Machchli Amritsari");
		price_k.add(300);
		list_K.add("Dhaba Dal");
		price_k.add(70);
		list_K.add("Rajma");
		price_k.add(80);
		list_K.add("Lassi Patiala");
		price_k.add(30);

		list_tea.add("White Tea");
		prize_tea.add(40);
		list_tea.add("Green Tea");
		prize_tea.add(50);
		list_tea.add("Oolong Tea");
		prize_tea.add(60);
		list_tea.add("Black Tea");
		prize_tea.add(70);
		list_tea.add("Pu-erh Tea");
		prize_tea.add(80);
		list_tea.add("Tisanes Tea");
		prize_tea.add(80);

		list_icecream.add("Bacon ice cream");
		prize_icecream.add(70);
		list_icecream.add("Beer Ice Cream");
		prize_icecream.add(100);
		list_icecream.add("Black walnut ice cream");
		prize_icecream.add(120);
		list_icecream.add("Blue Moon");
		prize_icecream.add(150);
		list_icecream.add("Cherry ice cream");
		prize_icecream.add(100);
		list_icecream.add("Chocolate chip cookie dough ice cream");
		prize_icecream.add(100);
		list_icecream.add("Chocolate ice cream");
		prize_icecream.add(120);

		list_local.add("Boryani");
		prize_local.add(30);
		list_local.add("Sndawich");
		prize_local.add(30);
		list_local.add("Potato");
		prize_local.add(30);
	}

	boolean list() {
		System.out.println("\n\n****~*~*~*~*~*~*" + hotelName + "~*~*~*~*~*~*~*~*~*~*\n\n");
		System.out.println("****-------------ښه راغلاست-----------------****************");
		System.out.println("****--------------Wellcome---------*************\n\n");
		System.out.println("************************************************\n\n");
		System.out.println("....................main..Menu.......................\n\n");

		go: {
			do

			{
				displayMainMenu(main_menu);
				System.out.print("_Enter your choise : ");
				ch = sc.nextInt();
				switch (ch) {
					case 1:
						displayMenu(list_Afghani, price_Afghani);
						break;

					case 2:
						displayMenu(list_H, price_H);
						break;

					case 3:
						displayMenu(list_K, price_k);
						break;

					case 4:
						displayMenu(list_chainies, prize_chainies);
						break;

					case 5:
						displayMenu(list_tea, prize_tea);
						break;
					case 6:
						displayMenu(list_icecream, prize_icecream);
						break;
					case 7:
						displayMenu(list_local, prize_local);
						break;

					case 10:
						System.out.println("Checking....");
						return (true);

					case 8:
						System.out.println("Exit");
						break;
					default:
						System.out.println("ine.....plz agian");
						break;
				}
			} while (8 != ch);
			System.out.println("You Enter Wrong Input");
			return (false);

		}
	}

	public void displayMenu(ArrayList list, ArrayList prize) {
		int i = 1;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		Iterator itr = list.iterator();
		Iterator itr1 = prize.iterator();
		int j;
		do {
			while (itr.hasNext()) {
				System.out.println(
						" " + i + " " + itr.next() + "............................." + itr1.next() + "/-" + "...");
				i++;
			}
			j = i;
			if (flag = true) {
				System.out.println("  " + j + ". back<<");
				flag = false;
			}
			System.out.print("Enter choise : ");
			ch = sc.nextInt();
			if (ch < j) {
				cbill += (int) prize.get(ch - 1);
			} else {
				System.out.println("unavaible choise..........try again");
			}
			System.out.println("Current bill : " + cbill);
		} while (ch != j);
	}

	void displayMainMenu(ArrayList list) {
		int i = 1;
		Iterator itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println("    " + i + "." + itr1.next());
			i++;
		}
	}

	// void editprofile(){
	// Scanner sc = new Scanner(System.in);
	// System.out.println("_____________Edit profilr_____________");
	// System.out.println("1.change hotel name");
	// System.out.print("Enter your choise : ");
	// ch=sc.nextInt();
	// switch(ch)
	// {
	// case 1:
	// System.out.print("Enter new name of hotel : ");
	// hotelName=sc.next();
	// }
	// }
	void removeitem() {
		Scanner sc = new Scanner(System.in);
		boolean flag0, flag1;
		String Item;
		int prize;
		int ch;
		displayMainMenu(main_menu);
		System.out.print("Which catogeory : ");
		ch = sc.nextInt();
		System.out.print("Enter intem name to be remove : ");
		Item = sc.next();
		switch (ch) {
			case 1:
				int i, j;
				boolean flag;
				for (i = 0; i < list_Afghani.size(); i++) {
					flag = list_Afghani.get(i).equals(Item);
					if (flag == true) {
						list_Afghani.remove(i);
						price_Afghani.remove(i);
					}

				}
				break;

			case 2:
				for (i = 0; i < list_H.size(); i++) {
					flag = list_H.get(i).equals(Item);
					if (flag == true) {
						list_H.remove(i);
						price_H.remove(i);
					}

				}
				break;

			case 3:

				for (i = 0; i < list_chainies.size(); i++) {
					flag = list_chainies.get(i).equals(Item);
					if (flag == true) {
						list_chainies.remove(i);
						prize_chainies.remove(i);
					}

				}
				break;

			case 4:

				for (i = 0; i < list_K.size(); i++) {
					flag = list_K.get(i).equals(Item);
					if (flag == true) {
						list_K.remove(i);
						price_k.remove(i);
					}

				}
				break;
			case 5:
				for (i = 0; i < list_tea.size(); i++) {
					flag = list_tea.get(i).equals(Item);
					if (flag == true) {
						list_tea.remove(i);
						list_tea.remove(i);
					}

				}
				break;

			case 6:

				for (i = 0; i < list_icecream.size(); i++) {
					flag = list_icecream.get(i).equals(Item);
					if (flag == true) {
						list_icecream.remove(i);
						prize_icecream.remove(i);
					}

				}
				break;
			case 7:
				for (i = 0; i < list_local.size(); i++) {
					flag = list_local.get(i).equals(Item);
					if (flag == true) {
						list_local.remove(i);
						prize_local.remove(i);
					}

				}
				break;
			default:
				System.out.println("_______Invalid choise_______");
				break;
		}
	}

	void additem() {
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String Item;
		int prize;
		int ch;
		System.out.print("Enter intem name to be Add : ");
		Item = sc.next();
		System.out.print("Enter Prize of Item : ");
		prize = sc.nextInt();
		System.out.println("__________catageory____________");
		System.out.println("1.Afghani");
		System.out.println("2.Herati");
		System.out.println("3.chainies");
		System.out.println("4.Kabuli");
		System.out.println("5.tea");
		System.out.println("6.icecrime");
		System.out.println("7.Local of kutch");
		System.out.print("Which catogeory : ");
		ch = sc.nextInt();
		one: switch (ch) {

			case 1: {
				list_Afghani.add(Item);
				price_Afghani.add(prize);
				break;
			}

			case 2: {
				list_H.add(Item);
				price_H.add(prize);
				break;
			}

			case 3: {

				list_chainies.add(Item);
				prize_chainies.add(prize);
				break;
			}

			case 4: {
				list_K.add(Item);
				price_k.add(prize);
				break;
			}
			case 5: {
				list_icecream.add(Item);
				prize_icecream.add(prize);
				break;
			}
			case 6: {
				list_local.add(Item);
				prize_local.add(prize);
				break;
			}
			default:
				System.out.println("_______Invalid choise1_______");
				break one;
		}

	}
}