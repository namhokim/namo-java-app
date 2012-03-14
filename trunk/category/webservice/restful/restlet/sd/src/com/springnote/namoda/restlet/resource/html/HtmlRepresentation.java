package com.springnote.namoda.restlet.resource.html;

import java.util.HashMap;
import java.util.Map;

import org.restlet.data.MediaType;
import org.restlet.representation.FileRepresentation;
import org.restlet.representation.Representation;

public class HtmlRepresentation {
	public static final String DEFAULT_HTML = "Default";
	
	private static final Map<String, Representation> htmlResource;
	static {
		htmlResource = new HashMap<String, Representation>();
		String basicPath = HtmlRepresentation.class.getResource(
				"/com/springnote/namoda/restlet/resource/html/").getPath();
		// initizlize item
		htmlResource.put(DEFAULT_HTML, new FileRepresentation(basicPath+"index.html", MediaType.TEXT_HTML));
	}

	public static Representation get(String name) {
		return htmlResource.get(name);
	}

}
