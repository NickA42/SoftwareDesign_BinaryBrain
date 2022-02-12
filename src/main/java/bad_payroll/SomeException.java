package bad_payroll;

public class SomeException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -136693161557174157L;

	/**
	 * 
	 */
	public SomeException()
	{
		super("Person doesn't exist.");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public SomeException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
