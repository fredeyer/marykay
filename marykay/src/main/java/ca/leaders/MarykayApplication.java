package ca.leaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ca.leaders.DAO.CategorieRepository;
import ca.leaders.DAO.ProduitRepository;
import ca.leaders.entities.Categorie;
import ca.leaders.entities.Produit;

@SpringBootApplication
public class MarykayApplication implements CommandLineRunner {

	@Autowired
	private CategorieRepository categorieRepository;

	@Autowired
	private ProduitRepository produitRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MarykayApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		categorieRepository.save(new Categorie("Produit de Beate", "meilleur qualite", "cat.jpg"));
		categorieRepository.findAll().forEach(c -> {
			System.out.println(c.getIntitule());
		});
		
		produitRepository.save(new Produit("produit test", "ras", 80, 100, "produit.jpg"));
		
		}

}

