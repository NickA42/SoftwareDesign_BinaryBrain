package bad_payroll;

public class Employee
{
	String whatever;
	float value; 
	int number;   
	String emmmm;

	public Employee(String whatever, float value, int number,String emmmm){
		this.whatever = whatever;this.value = value;this.number = number;this.emmmm = emmmm;}
	@Override
	public String toString(){return "Employee " + whatever;}

	public float pay(){
		if (emmmm == "Hourly") {if (number <= 40){return value * number;} else{float pay_more = (float) ((number - 40) * (1.5 * value));return value * 40 + pay_more;
			}
		}
		else if (emmmm == "Salary") {return value * 40;}
		else {return value * number;}}

	public String getWhatever(){return whatever;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void setWhatever(String whatever){this.whatever = whatever;}
	public float getValue(){return value;}
	public void setValue(float value)
	{this.value = value;}
	public int getNumber(){return number;}
	public void setNumber(int number)
	{this.number = number;
	}

}
