package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	
	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(String title) {
		super(nbDigitalVieoDiscs + 1 ,title,"",0);
		nbDigitalVieoDiscs += 1;

	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);

		nbDigitalVideoDiscs += 1;
		this.setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(director);
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);

		nbDigitalVideoDiscs += 1;
		this.setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(director, length);
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);

		nbDigitalVideoDiscs += 1;
		this.setId(nbDigitalVideoDiscs);
	}

	public boolean isMatch(String title) {
		return this.getTitle().equals(title);
	}

	public String toString() {
		
		return "DVD" + "-" + this.getTitle() + "-" + this.getCategory() + "-" + this.getDirector() + "-" + String.valueOf(this.getLength()) + ": " + String.valueOf(this.getCost()) + "$";
	}
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}
}