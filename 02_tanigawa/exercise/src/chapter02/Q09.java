package chapter02;

public class Q09 {

	public static void main(String[] args) {
		int[] nums = {3, 8, 10, 5, 4};
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] *= 2;
		}
		
		for(int num: nums) {
			System.out.println(num);
		}

	}

}
