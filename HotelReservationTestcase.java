package HotelReservationProgram;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelReservationTestcase {
	
	   HotelReservation hotelReservation = new HotelReservation();
	    Hotel newHotel = hotelReservation.addHotel("Lakewood", 110, 90);
	    Hotel newHotel_1 = hotelReservation.addHotel("BridgeWood", 150, 60);
	    Hotel newHotel_2 = hotelReservation.addHotel("RidgeWood", 220, 150);

	      //To perform test case to add hotel details. 
	    @Test
	    public void givenHotelDetails_whenAddedHotelName_ShouldReturnEnteredName() {
	        assertEquals(newHotel.getName(), "Lakewood");
	        assertEquals(newHotel_1.getName(), "BridgeWood");
	        assertEquals(newHotel_2.getName(), "RidgeWood");
	    }

	   ////Hotel's week day rate for regular customer
	    @Test
	    public void givenHotelDetails_whenAddedWeekDayRate_ShouldReturnEnteredWeekDayRate() {
	        assertEquals(newHotel.getWeekDayRegularRate(), 110);
	        assertEquals(newHotel_1.getWeekDayRegularRate(), 150);
	        assertEquals(newHotel_2.getWeekDayRegularRate(), 220);
	    }

	    //// Hotel's weekend rate for regular customer.
	    @Test
	    public void givenHotelDetails_whenAddedWeekEndRate_ShouldReturnEnteredWeekendRate() {
	        assertEquals(newHotel.getWeekEndRegularRate(), 90);
	        assertEquals(newHotel_1.getWeekEndRegularRate(), 60);
	        assertEquals(newHotel_2.getWeekEndRegularRate(), 150);
	    }
	
}
