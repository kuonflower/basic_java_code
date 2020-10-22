package chapter05;

public class Car {
	public double gasoline;//ガソリンの残量
	public double nenpi;//燃費(１ℓで走れる距離
	public double gasolineMax;//ガソリンを入れること
	
	public Car(double gasoline, double nenpi, double gasolineMax){
		this.gasoline = gasoline;
		this.nenpi = nenpi;
		this.gasolineMax = gasolineMax;
		
	}
	
	public void displayGasoline(){
		System.out.println("ガソリンの残量は" + this.gasoline);
	}
	public void addGasoline(double gasoline){
		double actual;
		if(gasoline + this.gasoline > this.gasolineMax){
			actual = this.gasolineMax - this.gasoline;
			this.gasoline = this.gasolineMax;
			System.out.println(actual + "リットル給油します");
		} else {
			actual = gasoline;
			this.gasoline += gasoline;
			System.out.println(actual + "リットル給油します");
		}
		System.out.println("現在の燃料は" + this.gasoline + "リットルです");
	}
	public void run(double distance){
		
		if(this.gasoline < distance / nenpi){
			System.out.println("ガソリンが足りません");
		} else{			
		System.out.println(distance + "キロ走行します！");
		this.gasoline -= distance /nenpi;
		}
	}

}
