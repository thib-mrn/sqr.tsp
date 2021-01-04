package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

/** Création de 3 villes pour réaliser les tests */
	City c1 = new City(5,4);
 	City c2 = new City(5,5);
 	City c3 = new City(5,6);
	 
	 @Test
 	public void getDistanceToSameCity() throws Exception{
 		double expected = 0;
		double actual = c3.distanceTo(c3);
 		assertEquals(expected, actual, 0.0);
 	}


 	@Test
 	public void getDistanceToOnlyOneCity() {
 		TourManager.addCity(c1);
 		Tour t1 = new Tour();
 		t1.setCity(0, c1); 

 		double actual = t1.getDistance();
 		double expected = 0;

 		assertEquals(expected, actual, 0);
	 }

	@Test
 	public void getDistanceBetweenTwoCities(){
 		double expected = 1;
 		double actual = c1.distanceTo(c2);
 		assertEquals(expected, actual, 0.0);
 	}
}