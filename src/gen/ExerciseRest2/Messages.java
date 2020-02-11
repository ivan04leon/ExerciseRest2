package gen.ExerciseRest2;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/services")
public class Messages {
	
	@GET
	public String MainMessage (@QueryParam("name") String name) {
		return name;
	}
	
	@POST
	public String SecondaryMessage(@QueryParam("name") String name) {
		return(name).toLowerCase();
	}
	
	@GET
	@Path("/add")
	public int adition(@QueryParam("a") int a, @QueryParam("b") int b) {
		return a*b;
	}
	
	

}
