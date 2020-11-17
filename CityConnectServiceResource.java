package com.codechallenge.cityconnectservice.resource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	public String fetchCityConnectorRoutes(@PathVariable final String sourceCity,
			@PathVariable final String	destinationCity) throws IOException {

		List<String> list = new ArrayList<>();
		String hasRoutes="no";
		String filePath = Constants.filePath;
		String read=sourceCity.concat(Constants.lineSeparator).concat(destinationCity);
		try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
			list = stream
					.filter(line -> line.equalsIgnoreCase(read))
					.map(String::toUpperCase)
					.collect(Collectors.toList());
		} catch(IOException e) {
			e.printStackTrace();
		}
		list.forEach(System.out::println);
		if(list.contains(read.toUpperCase()))
			hasRoutes="yes";
		else 
			hasRoutes="no";
        return hasRoutes;    
        		
    }
	

}
