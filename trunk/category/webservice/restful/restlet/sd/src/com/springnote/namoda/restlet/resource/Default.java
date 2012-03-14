package com.springnote.namoda.restlet.resource;

import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import com.springnote.namoda.restlet.resource.html.HtmlRepresentation;

public class Default extends ServerResource {
	
	@Get("html")
	public Representation representation() {
		return HtmlRepresentation.get(HtmlRepresentation.DEFAULT_HTML);
	}
}
