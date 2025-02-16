public class Led {
	private int red;
	private int green;
	private int blue;
	private int dimmer;
	
	public Led(){
		this.red = 0;
		this.green = 0;
		this.blue = 0;
		this.dimmer = 0;
	}
	
	public String setColor(String color) {
		Object[][] colors = {
			{"red", 255, 0, 0},
			{"blue", 0, 0, 255}
		};
		
		return (String) colors[0][0];
	}
}