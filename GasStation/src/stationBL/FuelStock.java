package stationBL;

public class FuelStock {
	private double fuelAmount;
	
	public double getfuelAmount()
	{
		return fuelAmount;
	}
	
	public void pumpFuel(double pumpAmount)
	{
		fuelAmount-=pumpAmount;
	}
}
