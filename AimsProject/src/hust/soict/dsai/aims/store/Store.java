package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<Media>();
    }
    
    public void addMedia(Media media) {
    	itemsInStore.add(media);
    }
    
    public void removeMedia(Media media) {
    	if (itemsInStore.contains(media)) {
    		itemsInStore.remove(media);
    	} else {
    		System.out.println("This item is not in store!");
    	}
    }
}
