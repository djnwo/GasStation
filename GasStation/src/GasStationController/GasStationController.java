package GasStationController;
import GasStationBL.*;
import GasStationEvents.*;
import GasStationViews.AbstractGasStationView;

public class GasStationController implements GasStationUiEventListener,GasStationEventsListener  {

	
    private GasStation theStationModel;
    private AbstractGasStationView  stationView;
    
    public GasStationController(GasStation theStation, AbstractGasStationView theView) {
    	theStationModel = theStation;
    	stationView  = theView;
        
        theStationModel.registerListener(this);
        stationView.registerListener(this);
}
	
	@Override
	public void addcar(int theCarid) {
		theStationModel.addNewCar(theCarid);
	}

	@Override
	public void addCarToPump(Car theCar, FuelPump thePump) {
		theStationModel.addToPump(theCar.getCarID() , thePump.getFuelPumpID());
	}

	@Override
	public void addCarToWash(Car theCar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillTheMainPump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeTheDay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getStatistic(GasStation theStation) {
		// TODO Auto-generated method stub
		
	}


	
	
	
}
