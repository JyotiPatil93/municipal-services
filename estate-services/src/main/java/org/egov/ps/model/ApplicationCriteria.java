package org.egov.ps.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApplicationCriteria {

	private String propertyId;

	private String applicationId;

	private String tenantId;

	private String fileNumber;

	private String applicationNumber;

	private List<String> state;

	private Long offset;

	private Long limit;

	private List<String> relations;

	private List<String> applicationType;

	private List<String> moduleType;

	private List<String> branchType;
	
}