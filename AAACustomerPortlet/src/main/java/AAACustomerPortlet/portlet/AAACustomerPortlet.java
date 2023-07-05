package AAACustomerPortlet.portlet;

import AAACustomerPortlet.constants.AAACustomerPortletKeys;

import com.liferay.docs.customer.model.Customer;
import com.liferay.docs.customer.service.CustomerLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Calendar;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author PC
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=AAACustomer",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AAACustomerPortletKeys.AAACUSTOMER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AAACustomerPortlet extends MVCPortlet {
	
	
private Customer _updateCustomer(ActionRequest request) throws PortalException {
		
		// Collect all information UpdateCustomer.JSP
		long customerId = ParamUtil.getLong(request, "customerId");
		String name = ParamUtil.getString(request, "customerName");
		String email = ParamUtil.getString(request, "customerEmail");
		String address = ParamUtil.getString(request, "customerAddress");
		String contact = ParamUtil.getString(request, "customerContact");
		String nric = ParamUtil.getString(request, "customerNRIC");
		String service = ParamUtil.getString(request, "serviceName");
		
		
		int year = ParamUtil.getInteger(request, "start_dateYear");
	    int month = ParamUtil.getInteger(request, "start_dateMonth");
	    int day = ParamUtil.getInteger(request, "start_dateDay");
	    int hour = ParamUtil.getInteger(request, "start_dateHour");
	    int minute = ParamUtil.getInteger(request, "start_dateMinute");
	    int amPm = ParamUtil.getInteger(request, "start_dateAmPm");

	    if (amPm == Calendar.PM) {
	       hour += 12;
	    }
		
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Customer.class.getName(), request);
		
		
		Customer customer = null;
		
		
		//Check old customer or new Customer
        if (customerId <= 0) {
        	
        	System.out.println("\n== Adding New Customer ==");
        	System.out.println("name is : " + name);
        	System.out.println("email is : " + email);
        	System.out.println("address is : " + address);
        	System.out.println("contact is : " + contact);
        	System.out.println("NRIC is : " + nric);
        	System.out.println("service is : " + service);
        	System.out.println("\n===== Processing... =====");
        	
        	//  add Customer Method 
        	customer = CustomerLocalServiceUtil.addCustomer(serviceContext.getUserId(), serviceContext.getScopeGroupId(), name, email, address, 
        			contact, nric, service, month, day, year, hour, minute, serviceContext);
        	System.out.println("\n== Customer Added Successfully ==");
        	
        } else {
        	
        	System.out.println("\n=== Editting Customer ===");
        	customer = CustomerLocalServiceUtil.getCustomer(customerId);
        	
        	//Call update method
        	System.out.println("EDIT ID : " + customerId);
        	System.out.println("Customer Name " + customer.getCustomerName());
        	System.out.println("\n===== Processing... =====");
        	
        	customer = CustomerLocalServiceUtil.updateCustomer(customerId , serviceContext.getUserId(), serviceContext.getScopeGroupId(), name, email, address, 
        			contact, nric, service, month, day, year, hour, minute, serviceContext);
        	System.out.println("\n== Customer Edited Successfully ==");
        	
        }
    
		return customer;
	}
	
	
	
	public void addCustomer(ActionRequest request, ActionResponse response)
            throws Exception {

        _updateCustomer(request);

        sendRedirect(request, response);
    }
	
	
	
	public void deleteCustomer(ActionRequest request, ActionResponse response)
	        throws Exception {

	        long customerId = ParamUtil.getLong(request, "customerId");
	        
	        System.out.println("\n\n= Deleting Customer .... =");
	        System.out.println("Customer ID : " + customerId);
	        CustomerLocalServiceUtil.deleteCustomer(customerId);
	        System.out.println("== Customer Deleted Successfully ==\n\n");

	        sendRedirect(request, response);
	}
	
	
	public void updateCustomer(ActionRequest request, ActionResponse response)
	        throws Exception {

	        _updateCustomer(request);
	        sendRedirect(request, response);
	        
	}
	
}