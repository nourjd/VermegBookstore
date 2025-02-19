import java.util.Date;
public class Livre {
	int id;
	String title;
	String author;
	float price;
	Date releaseDate;
	public Livre(int id, String title, String author, float price,
			Date releaseDate) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.releaseDate = releaseDate;
	}
	public Livre(){
		
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "Livre [title=" + title + ", author=" + author + ", price="
				+ price + ", releaseDate=" + releaseDate + "]";
	}
	
	
	
}
