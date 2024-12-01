package hust.soict.dsai.test.polymorphism;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Polymorphism {

	public static void main(String[] args) {
		ArrayList<Media> mediae = new ArrayList<Media>();
		
//		create some media here
//		for example: cd, dvd, book
		CompactDisc cd1 = new CompactDisc("Son Tung MTP");
		CompactDisc cd2 = new CompactDisc("Amee");
		
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
                "Animation", "Roger Allers", 87, 19.95f);
            
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
            "Science Fiction", "George Lucas", 87, 24.95f);
	}

}
