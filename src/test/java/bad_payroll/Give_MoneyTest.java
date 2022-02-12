package bad_payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class Give_MoneyTest
{
	Give_Money payments;
	Employee c= new Employee("C-C", 15, 50, "Contractor");

	@BeforeEach
	void setUp() throws Exception
	{
		payments = new Give_Money();
		payments.ae(new Employee("A-H", 10, 45, "Hourly"));
		payments.ae(new Employee("B-H", 10, 30, "Hourly"));
		payments.ae(c);
		payments.ae(new Employee("D-S", 10, 40, "Salary"));
	}
	
	@Test
	void testAdd_employee()
	{
		assertEquals(4,payments.num);
		payments.ae(new Employee("E-S", 10, 40, "Salary"));
		assertEquals(5,payments.num);
		
	}

	@Test
	void testPayments()
	{
		assertArrayEquals(new float[] {475,300,750,400}, payments.payments());
	}

	@Test
	void testChange_hour() throws SomeException
	{
		payments.ch("C-C", 30);
		assertEquals(30, c.getNumber());
		
	}
	
	@Test
	void testPay_System() {
		assertThrows(SomeException.class,()->{
			payments.ch("S-S", 2);
		} );
	}

}
