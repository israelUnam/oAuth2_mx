package  mx.unam.sa.oAuth2.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class CustomOauth2SuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        log.info("Authentication success for user: {}", authentication.getName());
        try {
            response.sendRedirect("/complete-registration");
            log.info("Redirecting to /complete-registration");
        } catch (Exception e) {
            log.error("Error during redirecting to /complete-registration", e);
            throw e;
        }
    }
}
