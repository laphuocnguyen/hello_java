package ch.klara.hello_world;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ch.klara.hello_world.model.Person;

@Path("persons")
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

	@GET
	public List<Person> getAllPersonInSystem() {
		System.out.println("Request at: " + LocalDateTime.now());
		List<Person> persons = new ArrayList<>();
		Person person = new Person();
		person.setLastName("Schema");
		person.setFirstname("Peter");
		persons.add(person);
		return persons;
	}
}
