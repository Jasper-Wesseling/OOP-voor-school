public class Televisie {
	private String brand;
	private String model;
	private int currentVolume;
	private int currentChannel;
	private String childLockPin;
	
	public Televisie(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.currentVolume = 10;
		this.currentChannel = 10;
		this.childLockPin = "";
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getCurrentVolume() {
		return this.currentVolume;
	}
	
	public void increaseVolume() {
		this.currentVolume++;
	}
	
	public void decreaseVolume() {
		this.currentVolume--;
	}
	
	public int getCurrentChannel() {
		return this.currentChannel;
	}
	
	public boolean setChannel(int channel) {
		if (this.childLockPin == "") {
			this.currentChannel = channel;
			return true;
		} else {
			return false;
		}
	}
	
	public void setChildLock(String lock) {
		this.childLockPin = lock;
	}
	
	public boolean unlockChildLock(String lock) {
		if (this.childLockPin == lock) {
			this.childLockPin = "";
			return true;
		} else {
			return false;
		}
	}
}