package chapter02;

public class Q06 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		
		
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = new java.util.Random().nextInt(101);
			System.out.println("nums[" + i + "]は" + nums[i]);
		}

	}

}
