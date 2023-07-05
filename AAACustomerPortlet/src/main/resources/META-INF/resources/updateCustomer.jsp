<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.docs.customer.service.CustomerService"%>
<%@page import="com.liferay.docs.customer.service.CustomerLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.docs.customer.model.Customer"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="init.jsp" %>

<%
	Customer customer = null;
	long customerId = ParamUtil.getLong(request, "customerId");

	if (customerId > 0) {
		customer = CustomerLocalServiceUtil.getCustomer(customerId);

	}
	
	String redirect = ParamUtil.getString(request, "redirect");
	
%>

<aui:model-context bean="<%= customer %>" model="<%= Customer.class %>" />
<portlet:renderURL var="viewCustomerURL" />
<portlet:actionURL name='<%=customer==null?"addCustomer":"updateCustomer"%>' var="editCustomerURL" windowState="normal" />
<liferay-ui:header
	backURL="<%= viewCustomerURL %>"
	title='<%= (customer != null) ? customer.getCustomerName() : "New Customer" %>'
/>

<aui:form action="<%= editCustomerURL %>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

		<aui:input name="customerId" type="hidden" value='<%= customer == null ? "" : customer.getCustomerId() %>'/>

		<aui:input name="customerName" />
		
		<aui:input name="customerEmail" />
		
		<aui:input name="customerAddress" />
		
		<aui:input name="customerContact" />
		
		<aui:input name="customerNRIC" />
		
	
		<aui:select label="Services" name="serviceName" showEmptyOption="<%= true %>">

			<aui:option selected="<%= customer!=null %>" value="DomainName">Domain name</aui:option>
			<aui:option selected="<%= customer!=null %>" value="SharedHosting">Shared Hosting</aui:option>
			<aui:option selected="<%= customer!=null %>" value="ResellerHosting">Reseller Hosting</aui:option>
			<aui:option selected="<%= customer!=null %>" value="CloudHosting">Cloud Hosting</aui:option>
			<aui:option selected="<%= customer!=null %>" value="VPSHosting">VPS Hosting</aui:option>
			<aui:option selected="<%= customer!=null %>" value="DedicatedHosting">Dedicated Hosting</aui:option>
			<aui:option selected="<%= customer!=null %>" value="ColocationService">Colocation Service</aui:option>
			
		</aui:select>
		
		
		<aui:input name="aaa_start_date" />

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />
		<aui:button onClick="<%= viewCustomerURL %>"  type="cancel" />
	</aui:button-row>
</aui:form>