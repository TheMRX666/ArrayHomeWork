package a3d6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print("Enter num: ");
			int num = scan.nextInt();
			nums.add(num);
		}
		int max=0;
		for(int i=0;i<nums.size();i++) {
			if(max<nums.get(i)) {
				max = nums.get(i);
			}
		}
		System.out.printf("Result is: %s",max);
	}
	
}
