/**
 * 
 */

package bad_payroll;

import java.util.ArrayList;

public class Give_Money
{
	ArrayList<Employee> p = new ArrayList<Employee>();
	int num = 0;
	public Give_Money(){} // doesn't care
	public void ae(Employee e){p.add(e); this.num = p.size();}
	public float[] payments(){float[] many_numbers = new float[num];
		for (int i = 0; i < num; i++){Employee e = p.get(i);many_numbers[i] = e.pay();}
		return many_numbers;}  // most important}
	public void ch(String whatever, int number) throws SomeException{int i = fp(whatever);if (i == -1) {throw new SomeException();}else{p.get(i).setNumber(number);}}
	private int fp(String whatever){for (int i = 0; i < num; i++){Employee e = p.get(i);if (e.getWhatever().equals(whatever))return i;
		}
		return -1; // this is important!!!!!
	}

}
