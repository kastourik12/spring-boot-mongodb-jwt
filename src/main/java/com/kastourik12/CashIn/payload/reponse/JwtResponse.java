package com.kastourik12.CashIn.payload.reponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.util.Date;


@AllArgsConstructor
@Data
@Builder
public class JwtResponse {
	private String authenticationToken;
	private String refreshToken ;
	private Date expiresAt;
	private String username;


}
