package chapter02;

public class Q10 {

	public static void main(String[] args) {
		int[] nums = {3, 8, 10, 5, 4};
		
		int a0 = nums[0];
		int a1 = nums[1];
		int a2 = nums[2];
		int a3 = nums[3];
		int a4 = nums[4];
		
		nums[0] = a4;
		nums[1] = a3;
		nums[2] = a2;
		nums[3] = a1;
		nums[4] = a0;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("---------------------");
		for(int num : nums){
			System.out.println(num);
		}
		

		/*for(int i = nums.length; i > 0; i--) {
			System.out.println(nums[i -1]);

		}
		//わからない
*/	}

}
