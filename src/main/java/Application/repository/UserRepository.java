package Application.repository;

import Application.model.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findFirstByUsername(String username);

    //Podemos probar un count más adelante.

   // User findFirstByUsernameAndPassword(String username, String password);

}