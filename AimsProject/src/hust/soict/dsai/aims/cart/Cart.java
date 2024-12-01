package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if(!itemsOrdered.contains(media)) {
			itemsOrdered.add(media);
		} else {
			System.out.println("This is already in your order!");
		}
	}
	public void removeMedia(Media media) {
		if(itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
		} else {
			System.out.println("This is not in the order!");
		}
	}
	public void printOrders() {
		for (Media item: itemsOrdered) {
			System.out.println(item.toString());
		}
	}
//
//	public void searchById(int id) {
//		boolean found = false;
//		for (int i = 0; i < qtyOrdered; i++) {
//			if (itemsOrdered[i].getId() == id) {
//				System.out.println("DVD found: " + itemsOrdered[i].toString());
//				found = true;
//				break;
//			}
//		}
//
//		if (!found) {
//			System.out.println("No DVD found with ID: " + id);
//		}
//	}
//
//	public void searchByTitle(String title) {
//		boolean found = false;
//		for (int i = 0; i < qtyOrdered; i++) {
//			if (itemsOrdered[i].isMatch(title)) {
//				System.out.println("DVD found: " + itemsOrdered[i].toString());
//				found = true;
//				break;
//			}
//		}
//
//		if (!found) {
//			System.out.println("No DVD found with title: " + title);
//		}
//	}
//
	public float totalCost() {
		float totalCost = 0;
		for (Media item: itemsOrdered) {
			totalCost += item.getCost();
		}
		return totalCost;
	}
}
