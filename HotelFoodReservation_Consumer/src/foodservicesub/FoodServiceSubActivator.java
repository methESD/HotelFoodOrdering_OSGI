package foodservicesub;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import foodservicepublisher.FoodPublish;

public class FoodServiceSubActivator implements BundleActivator {

ServiceReference serviceReferenceFood;
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Food customer has started.");
		serviceReferenceFood = context.getServiceReference(FoodPublish.class.getName());
		FoodPublish FoodPublish = (FoodPublish) context.getService(serviceReferenceFood);
		FoodPublish.FoodService();
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Food customer has stopped.");
		context.ungetService(serviceReferenceFood);

	}


}
