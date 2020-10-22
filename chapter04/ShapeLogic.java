package chapter04;

public class ShapeLogic {
	//Q7
	public static int square(int x, int y){
		return CalcLogic.kakeru(x, y);
	}
	//Q8
	public static int triangle(int x, int y){
		return CalcLogic.waru(CalcLogic.kakeru(x, y), 2);
	}
	//Q9
	
//	台形の面積は(上底+下底)×(高さ)÷2
	public static int trapezoid(int x, int y, int z){
		
		return CalcLogic.waru(CalcLogic.kakeru(CalcLogic.tasu(x, y), z), 2);
		}

}
