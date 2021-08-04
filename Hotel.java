package HotelReservationProgram;

public class Hotel {
	
	  private String hotelName;
	    private int weekDayRegularRate;
	    private int weekEndRegularRate;

	    public Hotel(String hotelName, int weekDayRegularRate, int weekEndRegularRate)
	    {
	        this.hotelName = hotelName;
	        this.weekDayRegularRate = weekDayRegularRate;
	        this.weekEndRegularRate=weekEndRegularRate;
	    }

	    public String getName() {
	        return hotelName;
	    }

	    public void setName(String hotelName) {
	        this.hotelName = hotelName;
	    }

	    public int getWeekDayRegularRate() {
	        return weekDayRegularRate;
	    }

	    public void setWeekDayRegularRate(int weekDayRegularRate) {
	        this.weekDayRegularRate = weekDayRegularRate;
	    }

	    public int getWeekEndRegularRate() {
	        return weekEndRegularRate;
	    }

	    public void setWeekEndRegularRate(int weekEndRegularRate) {
	        this.weekEndRegularRate = weekEndRegularRate;
	    }

}
