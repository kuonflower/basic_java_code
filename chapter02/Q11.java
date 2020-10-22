package chapter02;

public class Q11 {

	public static void main(String[] args) {
		int[] nums = {3, 8, 10, 5, 4};
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
							
				}
			}
		}
		for(int i :nums) {
			System.out.println(i);
		}
		
	}

}
