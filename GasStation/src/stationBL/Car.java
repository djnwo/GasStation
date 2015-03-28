package stationBL;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Car {
	@XmlAttribute
	public boolean wantCleaning;
	
	@XmlAttribute
	public int id;
	
	@XmlElement(name = "WantsFuel")
	public WantsFuel wantsfuel;
	
	@Override
	public String toString() {
		return "Car [wantCleaning=" + wantCleaning + ", id=" + id
				+ ", wantsfuel=" + wantsfuel + "]";
	}

	
    
}
