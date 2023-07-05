create table ACS_Customer (
	uuid_ VARCHAR(75) null,
	customerId LONG not null primary key,
	customerName VARCHAR(75) null,
	customerEmail VARCHAR(75) null,
	customerAddress VARCHAR(75) null,
	customerContact VARCHAR(75) null,
	customerNRIC VARCHAR(75) null,
	aaa_start_date DATE null,
	aaa_groupId LONG,
	aaa_companyId LONG,
	aaa_userId LONG,
	aaa_userName VARCHAR(75) null,
	aaa_createDate DATE null,
	aaa_modifiedDate DATE null,
	serviceName VARCHAR(75) null
);