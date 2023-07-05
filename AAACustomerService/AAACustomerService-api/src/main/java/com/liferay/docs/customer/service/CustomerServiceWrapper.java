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

package com.liferay.docs.customer.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CustomerService}.
 *
 * @author Brian Wing Shun Chan
 * @see CustomerService
 * @generated
 */
public class CustomerServiceWrapper
	implements CustomerService, ServiceWrapper<CustomerService> {

	public CustomerServiceWrapper() {
		this(null);
	}

	public CustomerServiceWrapper(CustomerService customerService) {
		_customerService = customerService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _customerService.getOSGiServiceIdentifier();
	}

	@Override
	public CustomerService getWrappedService() {
		return _customerService;
	}

	@Override
	public void setWrappedService(CustomerService customerService) {
		_customerService = customerService;
	}

	private CustomerService _customerService;

}