package org.egov.pt.calculator.web.models.property;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Unit
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Unit   {
        @JsonProperty("id")
        private String id;

        @JsonProperty("tenantId")
        private String tenantId;

        @NotEmpty
        @JsonProperty("floorNo")
        private String floorNo;

        @JsonProperty("unitType")
        private String unitType;

        @NotNull
        @JsonProperty("unitArea")
        private BigDecimal unitArea;

        @JsonProperty("usageCategoryMajor")
        private String usageCategoryMajor;

        @JsonProperty("usageCategoryMinor")
        private String usageCategoryMinor;

        @JsonProperty("usageCategorySubMinor")
        private String usageCategorySubMinor;

        @JsonProperty("usageCategoryDetail")
        private String usageCategoryDetail;

        @NotEmpty
        @JsonProperty("occupancyType")
        private String occupancyType;

        @JsonProperty("occupancyDate")
        private Long occupancyDate;

        @JsonProperty("constructionType")
        private String constructionType;

        @JsonProperty("constructionYear")
        private String constructionYear ;

        @JsonProperty("constructionSubType")
        private String constructionSubType;

        @JsonProperty("arv")
        private BigDecimal arv;

        @JsonProperty("additionalDetails")
        private UnitAdditionalDetails additionalDetails;

}

