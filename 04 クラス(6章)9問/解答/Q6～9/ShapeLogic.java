package q6_10;

public class ShapeLogic {

	//Ｑ７
	public static int square(int vertical , int horizontal){
		int result = CalcLogic.kakeru(vertical, horizontal);
		return result;
	}

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//Ｑ８
	public static int triangle(int bottom , int height){
		int result = CalcLogic.waru(CalcLogic.kakeru(bottom, height) , 2);
		return result;
	}

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	//Ｑ９
	public static int trapezoid(int upperSide , int underSide , int height){
		int x = CalcLogic.tasu(upperSide, underSide);
		int y = CalcLogic.kakeru(x, height);
		int result = CalcLogic.waru(y, 2);
		return result;
	}
}
