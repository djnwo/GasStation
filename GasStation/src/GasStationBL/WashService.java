package GasStationBL;

import javax.xml.bind.annotation.XmlAttribute;

public class WashService {
	@XmlAttribute
	private int numOfTeams;
	@XmlAttribute
	private float price;
	@XmlAttribute
	private int secondsPerAutoClean;
	@Override
	public String toString() {
		return "WashService [numOfTeams=" + numOfTeams + ", price=" + price
				+ ", secondsPerAutoClean=" + secondsPerAutoClean + "]";
	}
	
	
	
}
