package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track> ();
	public CompactDisc() {
		this.artist = "";
	}
	public CompactDisc(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	public void addTrack(Track track) {
		if (!tracks.contains(track)) {
			tracks.add(track);
		} else {
			System.out.println("This track already exist!");
		}
	}
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
		} else {
			System.out.println("This track is not existed!");
		}
	}
	public int getLength() {
		int totalLength = 0;
		for (Track track : tracks) {
			totalLength += track.getLength();
		}
		
		return totalLength;
	}
	@Override
	public void play() {
		System.out.println("CompactDisc Artist: " + this.getArtist());
		System.out.println("Total length: " + this.getLength());

		System.out.println("-----------------Play All Tracks----------------");
		for (Track track: tracks) {
			track.play();
		}
	}
	
}
