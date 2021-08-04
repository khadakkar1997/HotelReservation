package HotelReservationProgram;

public class HotelReservation {
	

	// Method to add hotels details with name and rates for regular customer
	public Hotel addHotel(String hotelName, int weekDayRate, int weekendRate) {
        return new Hotel(hotelName, weekDayRate, weekendRate);
    }
}
