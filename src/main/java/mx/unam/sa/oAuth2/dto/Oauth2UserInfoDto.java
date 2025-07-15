package mx.unam.sa.oAuth2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Oauth2UserInfoDto {
    private String id;
    private String name;
    private String email;
    private String picture;
    private String provider;
    private String providerId;
}
