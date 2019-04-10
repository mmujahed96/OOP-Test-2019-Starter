package ie.tudublin;

public class Resistor{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistor()
    {   
        
        public Resistor(int value)
    {   this.value = row.getInt("Value");
        this.ones = row.getInt("Ones");
        this.tens = row.getInt("Tens");
        this.hundreds = row.getInt("Hundreds");
       
    }
        public void Calculate()
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

    }

}

