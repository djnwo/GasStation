package GasStationEvents;

import GasStationBL.Car;
import GasStationBL.FuelPump;

public interface GasStationEventsListener {
	void addcar(int theCarid);
	void addCarToPump(Car theCar, FuelPump PumpID);
	void addCarToWash(Car theCar);
	void fillTheMainPump();
	void closeTheDay();
}
