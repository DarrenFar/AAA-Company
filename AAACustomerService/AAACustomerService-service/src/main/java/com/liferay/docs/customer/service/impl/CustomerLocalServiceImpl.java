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

package com.liferay.docs.customer.service.impl;

import com.liferay.docs.customer.exception.customerEmailException;

import com.liferay.docs.customer.exception.customerNameException;
import com.liferay.docs.customer.exception.serviceNameException;
import com.liferay.docs.customer.model.Customer;
import com.liferay.docs.customer.service.CustomerLocalServiceUtil;
import com.liferay.docs.customer.service.base.CustomerLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.Calendar;
import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.docs.customer.model.Customer",
	service = AopService.class
)
public class CustomerLocalServiceImpl extends CustomerLocalServiceBaseImpl {
	
	protected void validate (String name, String email, String service) 
	        throws PortalException {
	    if (Validator.isNull(name)) {
	        throw new customerNameException();
	    }
	    
	    if (Validator.isNull(service)) {
	        throw new serviceNameException();
	    }

	    if (!Validator.isEmailAddress(email)) {
	        throw new customerEmailException();
	    }

	}
	
	public Customer addCustomer(
	        long userId, long groupId, String name,String email, String address, String contact,
	        String nric, String service, int month, int day, int year, int hour, int minute, ServiceContext serviceContext)
	
	    throws PortalException, SystemException {
		
		System.out.println("Add Customer Impl");

		//Get User using userLocalService
		User user = userLocalService.getUserById(userId);
		
		System.out.println("tes1");
	    
		Date now = new Date();
		
		System.out.println("tes2");
		
	    validate(name,email,service);
	    
	    System.out.println("tes3");

	    //increment the customer ID
	    long customerId = counterLocalService.increment(Customer.class.getName());
	    
	    System.out.println("tes4");
	   
	    // Creating new Customer and initialize
	    
	    Customer customer = CustomerLocalServiceUtil.createCustomer(customerId);
	    
	    customer.setCustomerName(name);
	    customer.setCustomerEmail(email);
	    customer.setCustomerAddress(address);
	    customer.setCustomerContact(contact);
	    customer.setCustomerNRIC(nric);
	    customer.setServiceName(service);
	    
	    System.out.println("tes5");
	    
	    Calendar dateCal = CalendarFactoryUtil.getCalendar(user.getTimeZone());
	    dateCal.set(year, month, day, hour, minute);
	    Date date = dateCal.getTime();
	    customer.setAaa_start_date(date);
	    
	    System.out.println("tes6");

	    customer.setAaa_groupId(groupId);
	    customer.setAaa_companyId(user.getCompanyId());
	    customer.setAaa_userId(user.getUserId());
	    customer.setAaa_createDate(serviceContext.getCreateDate(now));
	    customer.setAaa_modifiedDate(serviceContext.getModifiedDate(now));

	    //Add new customer to the database
	    super.addCustomer(customer);
	    

	    
	    System.out.println("End Customer Impl");
	    
	    return customer;
	}
	
	
	public Customer deleteCustomer(long customerId) throws PortalException, SystemException {

		Customer customer = CustomerLocalServiceUtil.getCustomer(customerId);
	    return deleteCustomer(customer);
	    
	}
	
	public Customer updateCustomer(
			long customerId, long userId, long groupId, String name, String email, String address, String contact,
	        String nric, String service, int month, int day, int year, int hour, int minute, ServiceContext serviceContext)
	    throws PortalException, SystemException {
		
		System.out.println("Updating Customer Impl........");

		User user = userLocalService.getUserById(userId);
	   
	    Date now = new Date();
	    
	    validate(name, email, service);

	    Customer customer = CustomerLocalServiceUtil.fetchCustomer(customerId);

	    customer.setAaa_modifiedDate(serviceContext.getModifiedDate(now));	    
	    customer.setCustomerName(name);
	    customer.setCustomerEmail(email);
	    customer.setCustomerAddress(address);
	    customer.setCustomerContact(contact);
	    customer.setCustomerNRIC(nric);
	    customer.setServiceName(service);

	    Calendar dateCal = CalendarFactoryUtil.getCalendar(user.getTimeZone());
	    dateCal.set(year, month, day, hour, minute);
	    Date date = dateCal.getTime();
	    customer.setAaa_start_date(date);

	    customer.setServiceName(service);
	    super.updateCustomer(customer);

	    return customer;
	}
	
}