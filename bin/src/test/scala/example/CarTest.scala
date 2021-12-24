package example;

import org.junit.Test;
import org.junit.Before;

import org.junit.Assert.*;

// @RunWith attaches a runner with the test class to initialize the test data
class CarTest {

    var service: xample.service.CarService = new example.service.CarServiceImpl()

    @Before
    def before(): Unit = {
       service = new example.service.CarServiceImpl();
    }

    @Test
    def createCar_getPrice(): Unit = {
      val o = service.createCar();
      val expected = 0;
      assertEquals(o.getPrice(), expected, 0);
    }

    @Test
    def createCar_getYear(): Unit = {
      val o = service.createCar();
      val expected = 0;
      assertEquals(o.getYear(), expected);
    }

    @Test
    def createCar_getMake(): Unit = {
      val o = service.createCar();
      val expected = "test";
      assertEquals(o.getMake(), expected);
    }

    @Test
    def createCar_getModel(): Unit = {
      val o = service.createCar();
      val expected = "test";
      assertEquals(o.getModel(), expected);
    }

    @Test
    def createCar_objectNotNull(): Unit = {
      val o = service.createCar();
      assertNotNull(o);
    }

    @Test
    def createRandomCar_objectNotNull(): Unit = {
      val o = service.createRandomCar();
      assertNotNull(o);
    }

    @Test
    def findAll_sizeIsThree(): Unit = {
      val lst = service.findAll();
      val expected = 3;
      assertEquals(lst.size(), expected);
    }

    @Test
    def addCar_sizeIsFour(): Unit = {
      val lst = service.addCar();
      val expected = 4;
      assertEquals(lst.size(), expected);
    }

    @Test
    def deleteCar_sizeIsTwo(): Unit = {
      val lst = service.deleteCar();
      val expected = 2;
      assertEquals(lst.size(), expected);
    }
}
