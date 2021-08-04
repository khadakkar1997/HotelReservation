package HotelReservationProgram;



public class HotelReservation {
	
	
	public void printWelcomeMessage() {
        System.out.println("Welcome to Hotel reservation problem");
    }
	
	public Hotel addHotel(String hotelName, int weekDayRate, int weekendRate) {
        return new Hotel(hotelName, weekDayRate, weekendRate);
    }

}
