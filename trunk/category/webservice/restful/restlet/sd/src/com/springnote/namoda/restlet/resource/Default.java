package com.springnote.namoda.restlet.resource;

import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class Default extends ServerResource {
	@Get("html")
	public Representation representation() {
		return new StringRepresentation("Default Resource");
	}
}
