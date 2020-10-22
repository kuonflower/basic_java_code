package chapter02;

public class Q12 {

	public static void main(String[] args) {
		int[] nums = new int[100];
		
		for(int i = 0; i < nums.length; i++){
			nums[i] = new java.util.Random().nextInt(100) + 1;	
			if(nums[i] == 77) {
				System.out.println("インデックス" + i + "が77です");
				break;
			} else if (i == (nums.length - 1)) {
				if (nums[i] != 77){
				System.out.println("含まれていません");
				}
			}
		}

		
	}

}
/*if (nums[i] == 77) {
	System.out.println("インデックス" + i + "が77です");
	break;
}*/
