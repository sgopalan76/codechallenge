package com.codechallenge.cityconnect;

import org.junit.jupiter.api.Test;
import com.codechallenge.cityconnectservice.resource.CityConnectServiceResource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CityConnectorApplicationTests {
	
	
	@Test
	  void cityConnectorRoutes_1() throws Exception {
	    assertEquals("yes",new CityConnectServiceResource().fetchCityConnectorRoutes("San Diego", "Los Angeles"));
	  }
	
	@Test
	  void cityConnectorRoutes_2() throws Exception {
	    assertEquals("yes",new CityConnectServiceResource().fetchCityConnectorRoutes("Los Angeles", "San Diego"));
	  }
	
	@Test
	  void cityConnectorRoutes_3() throws Exception {
	    assertEquals("yes",new CityConnectServiceResource().fetchCityConnectorRoutes("Boston", "New York"));
	  }
	
	@Test
	  void cityConnectorRoutes_4() throws Exception {
	    assertEquals("yes",new CityConnectServiceResource().fetchCityConnectorRoutes("boston", "New york"));
	  }
	
	@Test
	  void cityConnectorRoutes_5() throws Exception {
	    assertEquals("yes",new CityConnectServiceResource().fetchCityConnectorRoutes("trenton", "albany"));
	  }
	
	@Test
	  void cityConnectorRoutes_6() throws Exception {
	    assertEquals("no",new CityConnectServiceResource().fetchCityConnectorRoutes("Delhi", "Mumbai"));
	  }
	
	@Test
	  void cityConnectorRoutes_7() throws Exception {
	    assertEquals("no",new CityConnectServiceResource().fetchCityConnectorRoutes("Richmond", "DC"));
	  }
	
	@Test
	  void cityConnectorRoutes_8() throws Exception {
	    assertEquals("no",new CityConnectServiceResource().fetchCityConnectorRoutes("San Francisco", "Los Angeles"));
	  }
	
	@Test
	  void cityConnectorRoutes_9() throws Exception {
	    assertEquals("yes",new CityConnectServiceResource().fetchCityConnectorRoutes("newark", "boston"));
	  }
	
	@Test
	  void cityConnectorRoutes_10() throws Exception {
	    assertEquals("no",new CityConnectServiceResource().fetchCityConnectorRoutes("", ""));
	  }
	
	@Test
	  void cityConnectorRoutes_11() throws Exception {
	    assertEquals("no",new CityConnectServiceResource().fetchCityConnectorRoutes("", "Chennai"));
	  }
}
