
interface Camera1{
	public void takeSnap();
}


interface VideoRecorder1{
	public void recordVideo();
	
	default void recordIn4K() {
		System.out.println("Recording video in 4k..");
	}
}


interface Wifi1{
	public String[] getNetworks();
	public void connectToNetwork(String network);
}


class MyCellularPhone{
	public void dialNumber(int num) {
		System.out.println("Dialing to: "+num);
	}
	
	public void calling(){
		System.out.println("Calling...");
	}
}

class MySmartPhone extends MyCellularPhone implements Camera1, VideoRecorder1, Wifi1{
	public void takeSnap() {
		System.out.println("Taking snap...");
	}
	
	public void recordVideo() {
		System.out.println("Recording video...");
	}
	
	public String[] getNetworks() {
		String[] myNetworks = {"Airtel", "Jio", "VI", "Reliance","Vodafone"};
		return myNetworks;
	}
	
	public void connectToNetwork(String network) {
		System.out.println("Connecting to "+network+" network...");
	}
}



public class InterfacePolymorphism {

	public static void main(String[] args) {
		Camera1 cam1 = new MySmartPhone();		//We can only use the methods of Camera interface
											//We only want to use the Camera thus restricting the other features to ensure security
		cam1.takeSnap();
		
		MySmartPhone smrtPhone = new MySmartPhone();
		smrtPhone.recordVideo();
		smrtPhone.connectToNetwork("Jio");

	}

}
