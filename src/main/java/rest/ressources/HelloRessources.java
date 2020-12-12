package rest.ressources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@javax.ws.rs.Path("abb")
public class HelloRessources {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(@QueryParam(value="image") String image) throws IOException {
		      Path temp =  Files.move 
		        (Paths.get("C:\\Users\\acer\\Desktop\\"+image), 
		        Paths.get("C:\\Users\\acer\\Desktop\\test angu\\aa\\Agence\\src\\assets\\"+image)); 
		  
		        if(temp != null) 
		        { 
		            System.out.println("Deplacer avec succ"); 
		        } 
		        else
		        { 
		            System.out.println("Erreur de deplacement"); 
		        }
		return "Hello from JAXRS";
	}

}
