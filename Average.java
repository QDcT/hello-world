package Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
	
	private static ArrayList<Integer> array = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = 0;
		try {
			
			do {
			System.out.println("Add an integer to the array: ");
			a = scan.nextInt();
			array.add(a);
			} while(a != 0);
			
		array.remove(array.size()-1);
		System.out.println(array);
		System.out.println(averager(array));}
		
			catch (Exception e) {
			System.out.println(e);
			
		}
		finally {scan.close();} 
		
	}
	
	public static double averager(ArrayList<Integer> array) {
		int sum =0;
		for (int i = 0; i< array.size(); i++ ) {
			sum = sum +array.get(i);
		}
		return sum/array.size();
	}

}
