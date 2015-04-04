package GasStationBL;

import java.util.LinkedList;
import java.util.Vector;

import GasStationEvents.GasStationEventsListener;

public class GasStation {
	
	private FuelStock fuelStock;
	private LinkedList<FuelPump> pumps;
	private Vector<GasStationEventsListener> listeners;

	
	public GasStation(){
	
	}


	public void addNewCar(int theCarid) {
		// TODO Auto-generated method stub
		
	}
	
	public void addToPump(int carId,int pumpId) {
		// TODO Auto-generated method stub
		
	}
	

	public void registerListener(GasStationEventsListener listener) {
		listeners.add(listener);
		
	}
}
