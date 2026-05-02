/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_ap;

import java.util.Scanner;

/**
 *
 * @author Ramin_Afghanyar
 */
public class customers {
	int tableNo;
	String name;
	int phoneNo;

	void customerData1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter table no.    :");
		tableNo = sc.nextInt();
		System.out.print("Enter Custmer name : ");
		name = sc.next();
		System.out.print("Enter phone no.    :");
		phoneNo = sc.nextInt();
	}

}
