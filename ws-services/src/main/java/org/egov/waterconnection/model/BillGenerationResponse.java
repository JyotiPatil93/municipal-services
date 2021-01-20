package org.egov.waterconnection.model;

import java.util.List;

import javax.validation.Valid;

import org.egov.common.contract.response.ResponseInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
public class BillGenerationResponse {
	@JsonProperty("ResponseInfo")
	private ResponseInfo responseInfo = null;

	@JsonProperty("billGeneration")
	@Valid
	private List<BillGeneration> billGeneration;

	@JsonProperty("billGenerationFile")
	@Valid
	private List<BillGenerationFile> billGenerationFile;
}