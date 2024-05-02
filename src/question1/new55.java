package question1;

import java.util.Scanner;

public class new55{
	static int getArea(int length,int breadth) {
		return length*breadth;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of rectangle:");
		int breadth=sc.nextInt();
		int Area= getArea( length, breadth);
		System.out.println("Area of rectangle is:"+Area);
		}
	}