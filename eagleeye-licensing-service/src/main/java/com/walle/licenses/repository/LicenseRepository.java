package com.walle.licenses.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.walle.licenses.model.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, String>{
	public List<License> findByOrganizationId(String organizationId);
	public License findByOrganizationIdAndLicenseId(String organizationID, String licenseId);
	
}
