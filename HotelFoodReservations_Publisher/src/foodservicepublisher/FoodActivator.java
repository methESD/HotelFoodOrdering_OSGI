package foodservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class FoodActivator implements BundleActivator {

	ServiceRegistration publishFoodRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("FoodService publisher has Started.");
		FoodPublish FoodPublisher = new FoodPublishImpl();
		publishFoodRegistration = context.registerService(
				FoodPublish.class.getName(), FoodPublisher, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("FoodService publisher has Stopped");
		publishFoodRegistration.unregister();
	}

}
