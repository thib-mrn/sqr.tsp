package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	public void distanceToSameCity() {
		City c1 = new City(1,1);
		City c2 = new City(1,1);

		double actual = c1.distanceTo(c2);
		double expected = 0;

		assertEquals(actual, expected,0);

	}

	@Test
	public void distanceToSameX() {
		City c1 = new City(1,2);
		City c2 = new City(1,1);

		double actual = c1.distanceTo(c2);
		double expected = 1;

		assertEquals(actual, expected,0);

	}

	@Test
 	public void distanceToSameY() {
 		City c1 = new City(1,1);
 		City c2 = new City(2,1);

 		double actual = c1.distanceTo(c2);
 		double expected = 1;

 		assertEquals(actual, expected,0);

	 }
	 
	 @Test
	/**
	 * Testing cities with differents coordinates
	 */
 	public void distanceToDiffXAndY() {
 		City c1 = new City(2,2);
 		City c2 = new City(1,1);

 		double actual = c1.distanceTo(c2);
 		double expected = Math.sqrt(2);

 		assertEquals(actual, expected,0);

 	}
	
	 @Test
	public void distanceTo_city0_distance0() {
		City c1 = new City(5,2);
 		City c2 = new City(1,8);

		double actual = c1.distanceTo(c2);
		double expected = Math.sqrt(c1.getX()*c2.getX() + c1.getY()*c2.getY());

		assertEquals(expected, actual, 0);
	}

}
