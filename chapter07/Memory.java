package chapter07;

public class Memory implements UsbConnectable {

	@Override
	public void usbConnect() {
		System.out.println("データを保存できます。");

	}

}
