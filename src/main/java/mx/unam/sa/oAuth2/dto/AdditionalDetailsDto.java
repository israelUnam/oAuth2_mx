package mx.unam.sa.oAuth2.dto;

import mx.unam.sa.oAuth2.entity.Authority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdditionalDetailsDto {
    private String phoneNumber;
    private String address;
    private Authority authority;
}
