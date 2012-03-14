package com.springnote.namoda.restlet;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;
import com.springnote.namoda.restlet.resource.*;

public class AppEntry extends Application {
	/**
	 * Creates a root Restlet that will receive all incoming calls.
	 */
	@Override
	public synchronized Restlet createInboundRoot() {
		// Create a router Restlet that routes each call to a new instance of HelloWorldResource.
		Router router = new Router(getContext());
		
		// Default route
		router.attachDefault(Default.class);

		return router;		
	}
}
