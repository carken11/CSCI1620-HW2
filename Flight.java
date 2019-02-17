// COURSE: CSCI1620-001
// TERM: Spring 2019
//
// NAME: Carter Kennell and Cameron Gilinsky
// RESOURCES: Partner programming with Cameron Gilinsky, along with 
//			the use of the provided JavaDoc.


package triptypes;
import java.util.Calendar;

/**
 * This class represents a single flight within the travel agency system.
 * @author ckennell and cgilinsky
 *
 */
public class Flight 
{
	/**
	 * Creates a new flight leg in the system.
	 * @param airline The Two letter airline code.
	 * @param flightNum The unique flight number on a given day.
	 * @param from The three letter airport code for the departure airport.
	 * @param to The three letter airport code for the arrival airport.
	 * @param leavesAt The departure time.
	 * @param arrives The arrival time.
	 * @param price The price for this flight in US dollars.
	 */
	public Flight(String airline, int flightNum, String from, String to,
				Calendar leavesAt, Calendar arrives, double price)
	{
		
	}
	
	/**
	 * Retrieves the price of this flight.
	 * @return The price in US dollars.
	 */
	public double getPrice()
	{
		return 0.0;
	}
	
	/**
	 * Retrieves a formatted string summarizing this Flight.
	 * @return The formatted string summary for the flight.
	 */
	public String toString()
	{
		return "";
	}
}
