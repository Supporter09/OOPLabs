package hust.soict.dsai.aims.media;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	
	public Media() {
	    this.id = 0;
	    this.title = "";
	    this.category = "";
	    this.cost = 0.0f;
	}
	
//Full parameter constructor
	public Media(int id, String title, String category, float cost) {
	 this.id = id;
	 this.title = title;
	 this.category = category;
	 this.cost = cost;
	}
// Additional constructors you might want
	public Media(String title) {
	    this(0, title, "", 0.0f);
	}

	public Media(String title, String category) {
	    this(0, title, category, 0.0f);
	}	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}
	
	public boolean equals(Object o) {
		Media media = (Media) o;
		return this.getTitle().equals(media.getTitle());
	}

}
