package a3d3;

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
		int sum=0;
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i)<0) {
				sum+= nums.get(i);
			}
		}
		System.out.printf("Result is: %s",sum);
	}
}
