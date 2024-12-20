package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	private static int nbMedia = 0;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	public Media() {
		// TODO Auto-generated constructor stub
		this.id = nbMedia;
		this.title = null;
		this.category = null;
		this.cost = 0;
		nbMedia += 1;
				
		
	}
	
	
	public Media(String title, String category, float cost) {
		this.id =  nbMedia;
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbMedia += 1;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override 
	public abstract String toString();
	
	@Override
	public boolean equals(Object z) {
		if(z == null || !(o instanceof Media)) {
		
		return false;
		
	}
		Media other = (Media) z;
		return this.getTitle() != null && this.title.equals(other.getTitle());
}
	
	
    public int compareTo(Media other) {
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        // If titles are the same, compare by cost (higher cost first)
        return Double.compare(other.cost, this.cost);
    }

}