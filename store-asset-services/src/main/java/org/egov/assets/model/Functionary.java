package org.egov.assets.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Functionary is considered as another cost center. In the government set-up,
 * demands for expenditure are drawn by the department discharging the functions
 * and become the responsibility center for the assigned functions. Functionary
 * group represents this. Each sub-level within this group typically can
 * represent the organisational structure within the ULB. This level is used
 * only for the internal control of the ULB.
 */
public class Functionary {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("code")
	private String code = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("active")
	private Boolean active = null;

	@JsonProperty("auditDetails")
	private Auditable auditDetails = null;

	public Functionary id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * id is the unique identifier and it is generated internally
	 *
	 * @return id
	 **/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Functionary code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * code is uniue identifier and ULB may refer this for short name.
	 *
	 * @return code
	 **/

	@NotNull

	@Size(min = 1, max = 16)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Functionary name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * name is the name of the functionary
	 *
	 * @return name
	 **/

	@NotNull

	@Size(min = 1, max = 256)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Functionary active(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * active states whether the functionary is active or not . Only active
	 * functionaries will be used in transaction
	 *
	 * @return active
	 **/

	@NotNull

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Functionary auditDetails(Auditable auditDetails) {
		this.auditDetails = auditDetails;
		return this;
	}

	/**
	 * Get auditDetails
	 *
	 * @return auditDetails
	 **/

	@Valid

	public Auditable getAuditDetails() {
		return auditDetails;
	}

	public void setAuditDetails(Auditable auditDetails) {
		this.auditDetails = auditDetails;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Functionary functionary = (Functionary) o;
		return Objects.equals(this.id, functionary.id) && Objects.equals(this.code, functionary.code)
				&& Objects.equals(this.name, functionary.name) && Objects.equals(this.active, functionary.active)
				&& Objects.equals(this.auditDetails, functionary.auditDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, code, name, active, auditDetails);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Functionary {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    active: ").append(toIndentedString(active)).append("\n");
		sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
