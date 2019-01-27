/**
 * 
 */
package ca.leaders.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.leaders.entities.Produit;

/**
 * @author frederic
 *
 */
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
