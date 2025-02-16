import java.util.List;

public class Img {
	private int lengthInPixels;
	private int widthInPixels;
	private int dpi;
	private String description;
	private List<String> personsOnPicture;
	
	public Img(int lengthInPixels, int widthInPixels, int dpi, String description, List<String> personsOnPicture) {
		this.lengthInPixels = lengthInPixels;
		this.widthInPixels = widthInPixels;
		this.dpi = dpi;
		this.description = description;
		this.personsOnPicture = personsOnPicture;
	}
	
	public int getLengthInPixels() {
		return this.lengthInPixels;
	}
	
	public int getWidthInPixels() {
		return this.widthInPixels;
	}
	
	public int getDpi() {
		return this.dpi;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public boolean canBePrinted(){
		if (this.dpi >= 150 && this.lengthInPixels > 585 && this.widthInPixels > 878) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isGroupPicture() {
		if (this.personsOnPicture.size() > 2)
		{
			return true;
		}
		return false;
	}
}