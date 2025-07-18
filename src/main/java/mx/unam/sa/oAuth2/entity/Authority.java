package mx.unam.sa.oAuth2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.springframework.security.core.GrantedAuthority;

@Data
@Entity
public class Authority implements GrantedAuthority {


    @Id
    @JdbcTypeCode(java.sql.Types.INTEGER)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String authority;
}
