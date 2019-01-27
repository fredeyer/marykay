/**
 * 
 */
package ca.leaders.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author frederic
 *
 */
@Entity
public class Produit {

	@Id @GeneratedValue
	private Long id_prod;
	@Column(nullable = false)
	private String nom_prod;
	@Column(nullable = false)
	private String description_prod;
	@Column(nullable = false)
	private double prix_prod;
	@Column(nullable = false)
	private int quantite_prod;
	@Column(nullable = false)
	private String image_prod;
	private String img1_prod;
	private String img2_prod;
	
	@ManyToOne (cascade=CascadeType.ALL)
	  private Categorie categorie;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String nom_prod, String description_prod, double prix_prod, int quantite_prod, String image_prod,
			String img1_prod, String img2_prod) {
		super();
		this.nom_prod = nom_prod;
		this.description_prod = description_prod;
		this.prix_prod = prix_prod;
		this.quantite_prod = quantite_prod;
		this.image_prod = image_prod;
		this.img1_prod = img1_prod;
		this.img2_prod = img2_prod;
	}
	
	public Produit(String nom_prod, String description_prod, double prix_prod, int quantite_prod, String image_prod) {
		super();
		this.nom_prod = nom_prod;
		this.description_prod = description_prod;
		this.prix_prod = prix_prod;
		this.quantite_prod = quantite_prod;
		this.image_prod = image_prod;
	}

	public Long getId_prod() {
		return id_prod;
	}

	public void setId_prod(Long id_prod) {
		this.id_prod = id_prod;
	}

	public String getNom_prod() {
		return nom_prod;
	}

	public void setNom_prod(String nom_prod) {
		this.nom_prod = nom_prod;
	}

	public String getDescription_prod() {
		return description_prod;
	}

	public void setDescription_prod(String description_prod) {
		this.description_prod = description_prod;
	}

	public double getPrix_prod() {
		return prix_prod;
	}

	public void setPrix_prod(double prix_prod) {
		this.prix_prod = prix_prod;
	}

	public int getQuantite_prod() {
		return quantite_prod;
	}

	public void setQuantite_prod(int quantite_prod) {
		this.quantite_prod = quantite_prod;
	}

	public String getImage_prod() {
		return image_prod;
	}

	public void setImage_prod(String image_prod) {
		this.image_prod = image_prod;
	}

	public String getImg1_prod() {
		return img1_prod;
	}

	public void setImg1_prod(String img1_prod) {
		this.img1_prod = img1_prod;
	}

	public String getImg2_prod() {
		return img2_prod;
	}

	public void setImg2_prod(String img2_prod) {
		this.img2_prod = img2_prod;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	
	
}
