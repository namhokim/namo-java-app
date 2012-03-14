package com.springnote.namoda.restlet.resource;

import org.restlet.data.MediaType;
import org.restlet.representation.FileRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class Default extends ServerResource {
	@Get("html")
	public Representation representation() {
		FileRepresentation f = new FileRepresentation(
				this.getClass().getResource("/com/springnote/namoda/restlet/resource/html/index.html").getPath(),
				MediaType.TEXT_HTML);
		return f;
	}
}
