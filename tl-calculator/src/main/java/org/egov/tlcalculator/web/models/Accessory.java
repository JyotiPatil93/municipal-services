package org.egov.tlcalculator.web.models;

import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * A Object holds the basic data for a Trade License
 */
@ApiModel(description = "A Object holds the basic data for a Trade License")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2018-09-18T17:06:11.263+05:30")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Accessory   {

        @JsonProperty("id")
        private String id;

        @JsonProperty("tenantId")
        private String tenantId;

        @JsonProperty("active")
        private Boolean active;

        @JsonProperty("accessoryCategory")
        private String accessoryCategory;

        @JsonProperty("uom")
        private String uom;

        @JsonProperty("uomValue")
        private String uomValue;

        @Min(value = 0)
        @JsonProperty("count")
        private Integer count;

        @JsonProperty("auditDetails")
        private AuditDetails auditDetails;


}

