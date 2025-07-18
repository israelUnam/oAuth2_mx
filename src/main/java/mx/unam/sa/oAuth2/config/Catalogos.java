package mx.unam.sa.oAuth2.config;

import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import mx.unam.sa.oAuth2.entity.Authority;
import mx.unam.sa.oAuth2.repository.AuthorityRepository;

@Configuration
public class Catalogos {
    AuthorityRepository authorityRepository;

    public Catalogos(AuthorityRepository authorityRepository) {
        this.authorityRepository = authorityRepository;
    }

    @PostConstruct
    public void initDatabase() {
        // Si ya hay usuarios no se hace nada
        if (authorityRepository.count() > 0) {
            return;
        }
        System.out.println("Creando catálogos...");
        // En caso contrario llena los datos básicos
        alta_authorities();
        
    }

    private void alta_authorities() {
        authorityRepository.save(new Authority("ROLE_ADMIN"));

        System.out.println("Catálogos creados.");
    }


}
