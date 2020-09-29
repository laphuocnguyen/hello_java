package ch.klara.hello_world;

import java.time.LocalDateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("hellos")
public class HelloResource {

	@GET
	public Response sayHello() {
		System.out.println("Request at: " + LocalDateTime.now());
		return Response.ok("Request at: " + LocalDateTime.now()).build();
	}
}
