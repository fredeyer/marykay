/**
 * 
 */
package ca.leaders.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author frederic
 *
 */
@Entity
public class Categorie implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id_cat;
	@Column(nullable = false)
	private String intitule_cat;
	@Column(nullable = false)
	private String description_cat;
	@Column(nullable = false)
	private String image_cat;
	private String img1_cat;
	private String img2_cat;
	@OneToMany(mappedBy="categorie", cascade=CascadeType.ALL)
	private List<Produit> produits = new ArrayList<Produit>();

	public Categorie(String intitule, String description, String image, String img1, String img2) {
		super();
		this.intitule_cat = intitule;
		this.description_cat = description;
		this.image_cat = image;
	}
	
	public Categorie(String intitule, String description, String image) {
		super();
		this.intitule_cat = intitule;
		this.description_cat = description;
		this.image_cat = image;
		this.img1_cat = null;
		this.img2_cat = null;
	}
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id_cat;
	}
	public void setId(Long id) {
		this.id_cat = id;
	}
	public String getIntitule() {
		return intitule_cat;
	}
	public void setIntitule(String intitule) {
		this.intitule_cat = intitule;
	}
	public String getDescription() {
		return description_cat;
	}
	public void setDescription(String description) {
		this.description_cat = description;
	}
	public String getImage() {
		return image_cat;
	}
	public void setImage(String image) {
		this.image_cat = image;
	}
	public String getImg1() {
		return img1_cat;
	}
	public void setImg1(String img1) {
		this.img1_cat = img1;
	}
	public String getImg2() {
		return img2_cat;
	}
	public void setImg2(String img2) {
		this.img2_cat = img2;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	
}
