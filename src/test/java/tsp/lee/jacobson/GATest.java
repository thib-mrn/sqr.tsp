package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {
	
	City c1 = new City(5,4);
	City c2 = new City(5,5);
	City c3 = new City(5,6);
	City c4 = new City(5,5);

	@Test
	public void evolvePopulationTestingNotSamePop() {
		
		Population pop = new Population(15, true);
		Population newPop = GA.evolvePopulation(pop);
		
		/** "assertNotEquals" pour vérifier que pop et newPop ne soient pas identiques */
		assertNotEquals(pop, newPop);
	}

	@Test
	public void evolvePopulationTestingBestDistance() {
		
		TourManager.addCity(c1);
		TourManager.addCity(c2);
		TourManager.addCity(c3);
		TourManager.addCity(c4);
		
		Tour t1 = new Tour();
		

		t1.setCity(0, c4);
		t1.setCity(1, c1);
		t1.setCity(2, c2);
		t1.setCity(3, c3);

		Population pop = new Population(15, true);
		Population newPop = GA.evolvePopulation(pop);

		int expectedDistance = t1.getDistance();
		int actualDistance = newPop.tours[0].getDistance();
		 
		 assertEquals(expectedDistance, actualDistance);
 	}

}
