package chapter07;

public class PC {
	private UsbConnectable device;

	public void execApp() {
		if(this.device == null) {
			System.out.println("アプリケーションを実行できます。先にUSBを接続して下さい");
		}else {			
		this.device.usbConnect();
		}
		
	}
	
	public UsbConnectable getDevice() {
		return this.device;
	}

	public void setDevice(UsbConnectable device) {
		this.device = device;
	}





}
