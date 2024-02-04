package JavaAngular.PointofSale.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pictures")
public class Picture implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(nullable = false, updatable = false)
	private Long id;
	private String name;
	private Date dateCreated;
	private Double price;
	private String type;
	private String imageUrl;
	
	public Picture() {
	}
	
	
	public Picture(Long id, String name, Date dateCreated, Double price, String type, String imageUrl) {
		this.id = id;
		this.name = name;
		this.dateCreated = dateCreated;
		this.price = price;
		this.type = type;
		this.imageUrl = imageUrl;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	@Override
	public String toString() {
		return "Picture [id=" + id + ", name=" + name + ", dateCreated=" + dateCreated + ", price=" + price + ", type="
				+ type + ", imageUrl=" + imageUrl + "]";
	}

	
}
