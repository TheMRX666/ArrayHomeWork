package a3d2;
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
		int index = 0;
		int max = 0;
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i) > max && nums.get(i)%2 != 0) {
				max = nums.get(i);
				index =i;
			}
		}
		
		
		System.out.println(nums.get(index));
	}
	
}
