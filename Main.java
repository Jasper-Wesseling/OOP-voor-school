public class Main {
	public static void main(String[] args) {
		//System.out.println("kaas");
		//Post test = new Post("plaatje", "patat");
		//System.out.println(test.getDescription());
		
		//System.out.println(test.getNumberOfLikes());
		//test.like();
		//test.like();
		//System.out.println(test.getNumberOfLikes());
		
		Televisie televisie = new Televisie("de goedkoopste", "HP");
		
		System.out.println(televisie.getBrand());
		System.out.println(televisie.getModel());
		System.out.println(televisie.getCurrentVolume());
		System.out.println(televisie.getCurrentChannel());
		
		System.out.println("///////////////////////////////");
		televisie.increaseVolume();
		televisie.increaseVolume();
		televisie.increaseVolume();
		
		televisie.decreaseVolume();
		System.out.println(televisie.getCurrentVolume());
		
		System.out.println(televisie.setChannel(9999));
		System.out.println(televisie.getCurrentChannel());
		
		televisie.setChildLock("kaas");
		
		System.out.println(televisie.setChannel(0));
		System.out.println(televisie.getCurrentChannel());
		
		System.out.println("///////////////////////////////");
		System.out.println("///////////////////////////////");
		System.out.println("///////////////////////////////");
		Led led = new Led();
		System.out.println(led.setColor("test"));
		
		System.out.println("///////////////////////////////");
		System.out.println("///////////////////////////////");
		System.out.println("///////////////////////////////");
		
	}
}
