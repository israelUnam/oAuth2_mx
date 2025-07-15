package  mx.unam.sa.oAuth2.repository;

import  mx.unam.sa.oAuth2.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{
    // Eagerly load the user's authorities, such that they are available in the returned User object
    @EntityGraph(attributePaths = "authorities")
    Optional<User> findByUsername(String username);

}
