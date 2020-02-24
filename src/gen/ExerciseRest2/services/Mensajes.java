package gen.ExerciseRest2.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/mensajes") //recursos
public class Mensajes {
	
	//anotaciones, en angular son componentes o decoraciones, solo agregan informacion a la clase, no procesos
	@GET
	@Path("/saluda")
	public String SaludamePerro() {
		return "Hola Prru!";
	}
	
	@GET
	@Path("/saluda2")
	public String diHola (@QueryParam("name") String name, @QueryParam("apellido") String apellido) {
		return "hola: " +name +" tu apellido es: "+apellido ;
	}
	
	@POST
	@Path("/suma/numero1/{num1}/numero2/{num2}")
	public int sumaNumeros(@PathParam("num1") int x, @PathParam("num2") int y) {
		return x+y;
	}
	
	

}
