package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class AcCommandDto {

	CredentialDto credential;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("meter_sn")
	String msn;
	
	@JsonProperty("command")
	String cmd;
}
