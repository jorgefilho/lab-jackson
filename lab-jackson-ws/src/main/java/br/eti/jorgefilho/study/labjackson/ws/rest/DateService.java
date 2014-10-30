package br.eti.jorgefilho.study.labjackson.ws.rest;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.eti.jorgefilho.study.labjackson.ws.rest.model.InsertResponse;

@Path("/date")
public class DateService {
	private static final String JSON_UTF_8 = MediaType.APPLICATION_JSON + "; charset=utf-8"; 
	
	
	
	
	public DateService() {
		super();
		// TODO Auto-generated constructor stub
	}
	@POST
	@Consumes({JSON_UTF_8})
	public Response insert(InsertResponse response){
		System.out.println("Result : " + response.getNow());
		return Response.status(201).entity("OK").build();
	}
	@GET
	@Path("/retrieve")
	@Consumes({JSON_UTF_8}	)
	public Response retrieve(){
		 String result = "<h1>RESTful Demo Application</h1>In real world application, a collection of users will be returned !!";
	     return Response.status(200).entity(result).build();
	}
	
	
}
