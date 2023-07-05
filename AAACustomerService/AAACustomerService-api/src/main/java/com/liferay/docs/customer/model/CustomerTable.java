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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;ACS_Customer&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @generated
 */
public class CustomerTable extends BaseTable<CustomerTable> {

	public static final CustomerTable INSTANCE = new CustomerTable();

	public final Column<CustomerTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, Long> customerId = createColumn(
		"customerId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CustomerTable, String> customerName = createColumn(
		"customerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, String> customerEmail = createColumn(
		"customerEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, String> customerAddress = createColumn(
		"customerAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, String> customerContact = createColumn(
		"customerContact", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, String> customerNRIC = createColumn(
		"customerNRIC", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, Date> aaa_start_date = createColumn(
		"aaa_start_date", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, Long> aaa_groupId = createColumn(
		"aaa_groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, Long> aaa_companyId = createColumn(
		"aaa_companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, Long> aaa_userId = createColumn(
		"aaa_userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, String> aaa_userName = createColumn(
		"aaa_userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, Date> aaa_createDate = createColumn(
		"aaa_createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, Date> aaa_modifiedDate = createColumn(
		"aaa_modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, String> serviceName = createColumn(
		"serviceName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private CustomerTable() {
		super("ACS_Customer", CustomerTable::new);
	}

}