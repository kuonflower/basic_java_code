package q1_5;

public class Calculation {

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//Ｑ１
	public static int tasu( int x , int y){
		return x + y;
	}

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//Ｑ２
	public static int hiku(int x , int y){
		return x - y;
	}

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//Ｑ３
	public static boolean evenNumberJudge(int x){
		boolean result = false;
		if( x % 2 == 0){
			result = true;
		}
		return result;
	}

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//Ｑ４
	public static boolean findNumber(int num ){
		boolean result = false;
		for(int i = 0 ; i < 100 ; i++ ){
			int r = new java.util.Random().nextInt(100) + 1 ;
			if(r == num){
				System.out.println( i + "回目に" + num + "を発見！ループを止めます");
				result = true;
				break;
			}
		}
		return result;
	}

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//Ｑ５
	public static int[] arrayGeneration(int num){
		int[] nums = new int[num];
		for(int i = 0 ; i < nums.length ; i++){
			nums[i] = new java.util.Random().nextInt(100) + 1;
		}
		return nums;
	}


}//class
