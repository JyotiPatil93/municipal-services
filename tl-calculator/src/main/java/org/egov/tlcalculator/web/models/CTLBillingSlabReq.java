package org.egov.tlcalculator.web.models;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.egov.common.contract.request.RequestInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CTLBillingSlabReq {
	@JsonProperty("RequestInfo")
	@NotNull
	@Valid
	private RequestInfo requestInfo = null;

	@JsonProperty("CTLBillingSlabs")
	@Valid
	private List<CTLBillingSlab> ctlBillingSlab = null;

}
