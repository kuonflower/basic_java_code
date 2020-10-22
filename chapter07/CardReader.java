package chapter07;

public class CardReader implements UsbConnectable {

	@Override
	public void usbConnect() {
		System.out.println("SDカードの読み書きができます。");

	}

}
