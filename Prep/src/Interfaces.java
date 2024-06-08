interface Camera{
	public void takeSnap();
}


interface VideoRecorder{
	public void recordVideo();
	
	default void recordIn4K() {
		System.out.println("Recording video in 4k..");
	}
}


interface Wifi{
	public String[] getNetworks();
	public void connectToNetwork(String network);
}


class CellularPhone{
	public void dialNumber(int num) {
		System.out.println("Dialing to: "+num);
	}
	
	public void calling(){
		System.out.println("Calling...");
	}
}

class SmartPhone extends CellularPhone implements Camera, VideoRecorder, Wifi{
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


//class containing main method
public class Interfaces {
	public static void main(String[] args) {
		SmartPhone obj = new SmartPhone();
		
		System.out.println("Following networks are available: ");
		String[] availableNetworks = obj.getNetworks();
		for(String str: availableNetworks) {
			System.out.println(str);
		}
		
		obj.connectToNetwork("Airtel");
		
		//Executing default method
		obj.recordIn4K();

	}

}
