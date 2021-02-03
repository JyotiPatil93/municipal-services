package org.egov.integration.model;

import org.egov.common.contract.request.RequestInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EawasRequestInfoWrapper {

	@JsonProperty("RequestInfo")
	private RequestInfo requestInfo;

	@JsonProperty("eawasRequest")
	private EawasRequest eawasRequest;
}
