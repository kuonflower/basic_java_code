package chapter07;

public class Mouse implements UsbConnectable {

	@Override
	public void usbConnect() {
		System.out.println("マウス操作ができます。");

	}

}
