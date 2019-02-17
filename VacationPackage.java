// COURSE: CSCI1620-001
// TERM: Spring 2019
//
// NAME: Carter Kennell and Cameron Gilinsky
// RESOURCES: Partner programming with Cameron Gilinsky, along with 
//			the use of the provided JavaDoc.

package triptypes;

/**
 * This class serves as the base class of all types of VacationPackages
 * within the travel agency program.
 * @author ckennell, cgilinsky
 *
 */
public abstract class VacationPackage 
{
	/**
	 * Initializes a VacationPackage with provided values.
	 * @param name The promotional marketing name for this package.
	 * @param numDays The number of days included in this VacationPackage trip.
	 */
	public VacationPackage(String name, int numDays)
	{
		
	}
	
	/**
	 * Updates the VacationPackage's externally facing promotional name.
	 * Due to travel agency policy, this name is never allowed to be empty
	 * as it would be confusing for agents and customers interacting with the
	 * system. Names that do not comply with this policy will be ignored and
	 * the package will be given the name "PACKAGE NAME TBD" as a placeholder.
	 * @param name The updated name to use for this package.
	 */
	public void setName(String name)
	{
		
	}
	
	/**
	 * Updates the length of this VacationPackage. All packages must have
	 * a minimum of one day.
	 * @param numDays The new number of days for this package.
	 */
	public void setLength(int numDays)
	{
		
	}
	
	/**
	 * Retrieves the promotional name of this package.
	 * @return The name of the VacationPackage.
	 */
	public String getName()
	{
		return "";
	}
	
	/**
	 * The number of days for this trip.
	 * @return The number of days for this trip.
	 */
	public int getNumDays()
	{
		return 0;
	}
	
	/**
	 * This method provides the full price of a VacationPackage, which 
	 * must be computed based on the specific kind of trip being booked.
	 * Defined in a subclass method.
	 * @return The price of the VacationPackage
	 */
	public abstract double getPrice();
	
	/**
	 * This method provides the required upfront deposit amount for a given
	 * vacation. This must be computed based on rules determined by specific
	 * package types, per travel agency policies. 
	 * @return The deposit amount in US dollars.
	 */
	public abstract double getDepositAmount();
	
	/**
	 * Provides the remaining amount due to the travel agent for this trip
	 * less any deposit made upfront.
	 * @return The remaining balance to path the travel agency.
	 */
	public double getAmountDue()
	{
		return 0.0;
	}
	
	/**
	 * Provides the subtotal for a trip related to lodging expenses (ie. not
	 * including flights, meals, and incidentals). Lodging rates are determined
	 * by specific package types.
	 * @return The lodging subtotal in US dollars.
	 */
	public abstract double getLodgingCost();
	
	/**
	 * Produces a String summary of a VacationPackage. Strings will be prefixed
	 * with the $ symbol, followed by trip total price rounded to two decimal
	 * places in an 8 character wide field. Price details should be followed
	 * by two spaces and the promotional name of this trip.
	 * @return The formatted string summary.
	 */
	public String toString()
	{
		return "";
	}
	
	/**
	 * Provides a logical equality comparison for VacationPackages and
	 * any other object type.
	 * @return True iff this VacationPackage shares the same promotional
	 * name as one referred to by other. False when other is not a valid
	 * VacationPackage object or the names do not match.
	 * @param other A reference to another object to be compared with this one.
	 */
	public boolean equals(Object other)
	{
		return true;
	}
}
