package Temperature;

public class Temperature {
	//declare field attributes
	
	private double ftemp; //for farenheight temp
	
	//constructor
	public Temperature(double ftemp)
	{
		this.ftemp = ftemp;
	}
	
	//mutator methods 
	public void setFahrenheit(double newtemperature)
	{
		this.ftemp = newtemperature;
	}
	
	
	//access modifier 
	
	public double getfahrenheit()
	{
		return this.ftemp;
	}
	
	public double getCelsius()
	{
		return (double)((5/9) * (ftemp - 32));
	}
	
	public double getKelvin()
	{
		return (double)((5/9) * (ftemp - 32) + 273);
	}
	
	public static void main(String[] args) {
		//define the temps
		
		Temperature temp1 = new Temperature(290.0);
		
		//change the description of item1
		//Item1.
		
		System.out.print("Fahrenheit temperature is" + " " + temp1.getfahrenheit());
	}

}