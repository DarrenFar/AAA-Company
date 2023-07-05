<%@ include file="/init.jsp" %>

<h1>Customer Portlet</h1>


<liferay-ui:tabs names="Customer" refresh="false" tabsValues="Customer">

    <liferay-ui:section>
        <%@ include file="/viewCustomer.jsp" %>
    </liferay-ui:section>
   
</liferay-ui:tabs>