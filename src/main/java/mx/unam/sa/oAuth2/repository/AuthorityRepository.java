package mx.unam.sa.oAuth2.repository;

import  mx.unam.sa.oAuth2.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
