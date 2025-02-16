public class Post {
	private String linkToImage;
	private String description;
	private int numberOfLikes;
	
	public Post(String linkToImage, String description) {
		this.linkToImage = linkToImage;
		this.description = description;
		this.numberOfLikes = 0;
		
	}
	
	public String getLinkToImg() {
		return this.linkToImage;
	}
	
	public void setLinkToImage(String linkToImage) {
		this.linkToImage = linkToImage;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getNumberOfLikes() {
		return numberOfLikes;
	}
	
	public void setNumberOfLikes(int l) {
		this.numberOfLikes = l;
	}
	
	public void like(){
		this.numberOfLikes = this.numberOfLikes + 1;
	}
}