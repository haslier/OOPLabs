package hust.soict.dsai.test.polymorphism;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Polymorphism {

	public static void main(String[] args) {
		ArrayList<Media> mediae = new ArrayList<Media>();


		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);

		Book b1 = new Book("fdfa", "coticg", 80.25f);
		Book b2 = new Book("bo doi", "Truyen clmm", 40.5f);

		mediae.add(dvd1);
		mediae.add(dvd2);
		mediae.add(b1);
		mediae.add(b2);

		for (Media media : mediae) {
			System.out.println(media.toString());
		}
	}

}
