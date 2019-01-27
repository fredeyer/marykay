/**
 * 
 */
package ca.leaders.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.leaders.entities.Categorie;

/**
 * @author frederic
 *
 */
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
