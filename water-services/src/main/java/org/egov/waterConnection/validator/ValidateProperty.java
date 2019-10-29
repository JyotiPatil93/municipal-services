package org.egov.waterConnection.validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.egov.tracer.model.CustomException;
import org.egov.waterConnection.model.Property;
import org.egov.waterConnection.model.WaterConnectionRequest;
import org.egov.waterConnection.model.WaterConnectionSearchCriteria;
import org.egov.waterConnection.util.WaterServicesUtil;
import org.javers.common.collections.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ValidateProperty {

	@Autowired
	WaterServicesUtil waterServiceUtil;

	public void validatePropertyCriteria(WaterConnectionRequest waterConnectionRequest) {
		Map<String, String> errorMap = new HashMap<>();
		Property property = new WaterConnectionRequest().getWaterConnection().getProperty();
		if (property.getId() == null || !property.getId().isEmpty()) {
			errorMap.put("INVALID PROPERTY", "WaterConnection cannot be updated without propertyId");
		}
		if (property.getTenantId() == null || !property.getTenantId().isEmpty()) {
			errorMap.put("INVALID PROPERTY", "WaterConnection cannot be updated without tenantId");
		}
		if (!errorMap.isEmpty())
			throw new CustomException(errorMap);
	}

	public void validateProperty(WaterConnectionRequest waterConnectionRequest) {
		WaterConnectionSearchCriteria waterConnectionSearchCriteria = new WaterConnectionSearchCriteria();
		Property property = new Property();
		property = waterConnectionRequest.getWaterConnection().getProperty();
		if (property.getId() != null && !property.getId().isEmpty()) {
			List<String> propertyIds = new ArrayList<>();
			propertyIds.add(property.getId());
			waterConnectionSearchCriteria.setIds(propertyIds);
		}
		if (property.getTenantId() != null && !property.getTenantId().isEmpty()) {
			waterConnectionSearchCriteria.setTenantId(property.getTenantId());
		}
		List<Property> propertyList = waterServiceUtil.propertyCallForSearchCriteria(waterConnectionSearchCriteria,
				waterConnectionRequest.getRequestInfo());
	}

	public boolean isPropertyIdPresent(WaterConnectionRequest waterConnectionRequest) {
		Property property = new WaterConnectionRequest().getWaterConnection().getProperty();
		if (property.getId() == null || !property.getId().isEmpty()) {
			return false;
		}
		return true;
	}
}
