/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.customer.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Customer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @generated
 */
public class CustomerWrapper
	extends BaseModelWrapper<Customer>
	implements Customer, ModelWrapper<Customer> {

	public CustomerWrapper(Customer customer) {
		super(customer);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("customerId", getCustomerId());
		attributes.put("customerName", getCustomerName());
		attributes.put("customerEmail", getCustomerEmail());
		attributes.put("customerAddress", getCustomerAddress());
		attributes.put("customerContact", getCustomerContact());
		attributes.put("customerNRIC", getCustomerNRIC());
		attributes.put("aaa_start_date", getAaa_start_date());
		attributes.put("aaa_groupId", getAaa_groupId());
		attributes.put("aaa_companyId", getAaa_companyId());
		attributes.put("aaa_userId", getAaa_userId());
		attributes.put("aaa_userName", getAaa_userName());
		attributes.put("aaa_createDate", getAaa_createDate());
		attributes.put("aaa_modifiedDate", getAaa_modifiedDate());
		attributes.put("serviceName", getServiceName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String customerName = (String)attributes.get("customerName");

		if (customerName != null) {
			setCustomerName(customerName);
		}

		String customerEmail = (String)attributes.get("customerEmail");

		if (customerEmail != null) {
			setCustomerEmail(customerEmail);
		}

		String customerAddress = (String)attributes.get("customerAddress");

		if (customerAddress != null) {
			setCustomerAddress(customerAddress);
		}

		String customerContact = (String)attributes.get("customerContact");

		if (customerContact != null) {
			setCustomerContact(customerContact);
		}

		String customerNRIC = (String)attributes.get("customerNRIC");

		if (customerNRIC != null) {
			setCustomerNRIC(customerNRIC);
		}

		Date aaa_start_date = (Date)attributes.get("aaa_start_date");

		if (aaa_start_date != null) {
			setAaa_start_date(aaa_start_date);
		}

		Long aaa_groupId = (Long)attributes.get("aaa_groupId");

		if (aaa_groupId != null) {
			setAaa_groupId(aaa_groupId);
		}

		Long aaa_companyId = (Long)attributes.get("aaa_companyId");

		if (aaa_companyId != null) {
			setAaa_companyId(aaa_companyId);
		}

		Long aaa_userId = (Long)attributes.get("aaa_userId");

		if (aaa_userId != null) {
			setAaa_userId(aaa_userId);
		}

		String aaa_userName = (String)attributes.get("aaa_userName");

		if (aaa_userName != null) {
			setAaa_userName(aaa_userName);
		}

		Date aaa_createDate = (Date)attributes.get("aaa_createDate");

		if (aaa_createDate != null) {
			setAaa_createDate(aaa_createDate);
		}

		Date aaa_modifiedDate = (Date)attributes.get("aaa_modifiedDate");

		if (aaa_modifiedDate != null) {
			setAaa_modifiedDate(aaa_modifiedDate);
		}

		String serviceName = (String)attributes.get("serviceName");

		if (serviceName != null) {
			setServiceName(serviceName);
		}
	}

	@Override
	public Customer cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the aaa_company ID of this customer.
	 *
	 * @return the aaa_company ID of this customer
	 */
	@Override
	public long getAaa_companyId() {
		return model.getAaa_companyId();
	}

	/**
	 * Returns the aaa_create date of this customer.
	 *
	 * @return the aaa_create date of this customer
	 */
	@Override
	public Date getAaa_createDate() {
		return model.getAaa_createDate();
	}

	/**
	 * Returns the aaa_group ID of this customer.
	 *
	 * @return the aaa_group ID of this customer
	 */
	@Override
	public long getAaa_groupId() {
		return model.getAaa_groupId();
	}

	/**
	 * Returns the aaa_modified date of this customer.
	 *
	 * @return the aaa_modified date of this customer
	 */
	@Override
	public Date getAaa_modifiedDate() {
		return model.getAaa_modifiedDate();
	}

	/**
	 * Returns the aaa_start_date of this customer.
	 *
	 * @return the aaa_start_date of this customer
	 */
	@Override
	public Date getAaa_start_date() {
		return model.getAaa_start_date();
	}

	/**
	 * Returns the aaa_user ID of this customer.
	 *
	 * @return the aaa_user ID of this customer
	 */
	@Override
	public long getAaa_userId() {
		return model.getAaa_userId();
	}

	/**
	 * Returns the aaa_user name of this customer.
	 *
	 * @return the aaa_user name of this customer
	 */
	@Override
	public String getAaa_userName() {
		return model.getAaa_userName();
	}

	/**
	 * Returns the customer address of this customer.
	 *
	 * @return the customer address of this customer
	 */
	@Override
	public String getCustomerAddress() {
		return model.getCustomerAddress();
	}

	/**
	 * Returns the customer contact of this customer.
	 *
	 * @return the customer contact of this customer
	 */
	@Override
	public String getCustomerContact() {
		return model.getCustomerContact();
	}

	/**
	 * Returns the customer email of this customer.
	 *
	 * @return the customer email of this customer
	 */
	@Override
	public String getCustomerEmail() {
		return model.getCustomerEmail();
	}

	/**
	 * Returns the customer ID of this customer.
	 *
	 * @return the customer ID of this customer
	 */
	@Override
	public long getCustomerId() {
		return model.getCustomerId();
	}

	/**
	 * Returns the customer name of this customer.
	 *
	 * @return the customer name of this customer
	 */
	@Override
	public String getCustomerName() {
		return model.getCustomerName();
	}

	/**
	 * Returns the customer nric of this customer.
	 *
	 * @return the customer nric of this customer
	 */
	@Override
	public String getCustomerNRIC() {
		return model.getCustomerNRIC();
	}

	/**
	 * Returns the primary key of this customer.
	 *
	 * @return the primary key of this customer
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the service name of this customer.
	 *
	 * @return the service name of this customer
	 */
	@Override
	public String getServiceName() {
		return model.getServiceName();
	}

	/**
	 * Returns the uuid of this customer.
	 *
	 * @return the uuid of this customer
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the aaa_company ID of this customer.
	 *
	 * @param aaa_companyId the aaa_company ID of this customer
	 */
	@Override
	public void setAaa_companyId(long aaa_companyId) {
		model.setAaa_companyId(aaa_companyId);
	}

	/**
	 * Sets the aaa_create date of this customer.
	 *
	 * @param aaa_createDate the aaa_create date of this customer
	 */
	@Override
	public void setAaa_createDate(Date aaa_createDate) {
		model.setAaa_createDate(aaa_createDate);
	}

	/**
	 * Sets the aaa_group ID of this customer.
	 *
	 * @param aaa_groupId the aaa_group ID of this customer
	 */
	@Override
	public void setAaa_groupId(long aaa_groupId) {
		model.setAaa_groupId(aaa_groupId);
	}

	/**
	 * Sets the aaa_modified date of this customer.
	 *
	 * @param aaa_modifiedDate the aaa_modified date of this customer
	 */
	@Override
	public void setAaa_modifiedDate(Date aaa_modifiedDate) {
		model.setAaa_modifiedDate(aaa_modifiedDate);
	}

	/**
	 * Sets the aaa_start_date of this customer.
	 *
	 * @param aaa_start_date the aaa_start_date of this customer
	 */
	@Override
	public void setAaa_start_date(Date aaa_start_date) {
		model.setAaa_start_date(aaa_start_date);
	}

	/**
	 * Sets the aaa_user ID of this customer.
	 *
	 * @param aaa_userId the aaa_user ID of this customer
	 */
	@Override
	public void setAaa_userId(long aaa_userId) {
		model.setAaa_userId(aaa_userId);
	}

	/**
	 * Sets the aaa_user name of this customer.
	 *
	 * @param aaa_userName the aaa_user name of this customer
	 */
	@Override
	public void setAaa_userName(String aaa_userName) {
		model.setAaa_userName(aaa_userName);
	}

	/**
	 * Sets the customer address of this customer.
	 *
	 * @param customerAddress the customer address of this customer
	 */
	@Override
	public void setCustomerAddress(String customerAddress) {
		model.setCustomerAddress(customerAddress);
	}

	/**
	 * Sets the customer contact of this customer.
	 *
	 * @param customerContact the customer contact of this customer
	 */
	@Override
	public void setCustomerContact(String customerContact) {
		model.setCustomerContact(customerContact);
	}

	/**
	 * Sets the customer email of this customer.
	 *
	 * @param customerEmail the customer email of this customer
	 */
	@Override
	public void setCustomerEmail(String customerEmail) {
		model.setCustomerEmail(customerEmail);
	}

	/**
	 * Sets the customer ID of this customer.
	 *
	 * @param customerId the customer ID of this customer
	 */
	@Override
	public void setCustomerId(long customerId) {
		model.setCustomerId(customerId);
	}

	/**
	 * Sets the customer name of this customer.
	 *
	 * @param customerName the customer name of this customer
	 */
	@Override
	public void setCustomerName(String customerName) {
		model.setCustomerName(customerName);
	}

	/**
	 * Sets the customer nric of this customer.
	 *
	 * @param customerNRIC the customer nric of this customer
	 */
	@Override
	public void setCustomerNRIC(String customerNRIC) {
		model.setCustomerNRIC(customerNRIC);
	}

	/**
	 * Sets the primary key of this customer.
	 *
	 * @param primaryKey the primary key of this customer
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the service name of this customer.
	 *
	 * @param serviceName the service name of this customer
	 */
	@Override
	public void setServiceName(String serviceName) {
		model.setServiceName(serviceName);
	}

	/**
	 * Sets the uuid of this customer.
	 *
	 * @param uuid the uuid of this customer
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected CustomerWrapper wrap(Customer customer) {
		return new CustomerWrapper(customer);
	}

}