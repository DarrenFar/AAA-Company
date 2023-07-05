<%@ include file="/init.jsp" %>
<%@page import="javax.portlet.RenderRequest"%>
<%@page import="javax.portlet.RenderURL"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.docs.customer.service.CustomerLocalServiceUtil"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>


<%
	String redirect = PortalUtil.getCurrentURL(request);
%>

<p>All Customer</p>

<aui:button-row>
	<portlet:renderURL var="addCustomerURL">
		<portlet:param name="mvcPath" value="/updateCustomer.jsp" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<aui:button onClick="<%= addCustomerURL.toString() %>" value="New Customer" />
</aui:button-row>


<liferay-ui:search-container>
	<liferay-ui:search-container-results results="<%= CustomerLocalServiceUtil.getCustomers(searchContainer.getStart(), searchContainer.getEnd()) %>" />
	<liferay-ui:search-container-row className="com.liferay.docs.customer.model.Customer" keyProperty="customerId" modelVar="customer" escapedModel="<%= true %>" >
	
		<!-- Customer Code -->
		<liferay-ui:search-container-column-text
			name="customerNRIC"
			value="<%= customer.getCustomerNRIC() %>"
		/>
		
	
		<!-- Customer First Name -->
		<liferay-ui:search-container-column-text
			name="customerName"
			value="<%= customer.getCustomerName() %>"
		/>
		
		
		<!-- Customer Email -->
		<liferay-ui:search-container-column-text
			name="customerEmail"
			value="<%= customer.getCustomerEmail() %>"
		/>
		
		<!-- Customer Address -->
		<liferay-ui:search-container-column-text
			name="customerAddress"
			value="<%= customer.getCustomerAddress() %>"
		/>
		
		<!-- Customer PhoneNumber  -->
		<liferay-ui:search-container-column-text
			name="customerContact"
			value="<%= customer.getCustomerContact() %>"
		/>
		
		
		<!-- Service Name -->
		<liferay-ui:search-container-column-text
			name="serviceName"
			value="<%= customer.getServiceName() %>"
		/>
		
		<!-- ACTION BUTTON  -->
		<liferay-ui:search-container-column-jsp
			align="right"
			path="/CustomerActions.jsp"
		/>
		
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>