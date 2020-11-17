package com.codechallenge.cityconnectservice.resource;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codechallenge.cityconnectservice.util.Constants;


@RestController
@RequestMapping("/connected")
public class CityConnectServiceResource {
	
	/**
	 * 
	 * This method takes in a Source City and Destination City as input
	 * and returns if a route exists based on the city.txt file
	 * It takes the following input in browser
	 * http://localhost:8081/connected/origin/Boston/destination/Philadelphia
	 * 
	 * @param sourceCity
	 * @param destinationCity
	 * @return
	 * @throws IOException
	 */
	@GetMapping("/origin/{sourceCity}/destination/{destinationCity}")
	public boolean fetchCityConnectorRoutes(@PathVariable final String sourceCity,
			@PathVariable final String	destinationCity) throws IOException {

	    String read=sourceCity.concat(Constants.lineSeparator).concat(destinationCity);
	    boolean hasRoutes=false;
	    try {	    
		    File file = new File(Constants.filePath); 
		    Scanner sc = new Scanner(file);  
		    sc.useDelimiter(Constants.delimiter); 
		    while (sc.hasNextLine()) {
		    	if(sc.nextLine().contains(read)) {
		    		hasRoutes = true;
		    		break;	
		    	}
		    }

	    } catch (IOException e) {
	        //error happened
	    }

        return hasRoutes;    
        		
    }
	

}
