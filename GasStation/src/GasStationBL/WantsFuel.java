package GasStationBL;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class WantsFuel {
	@XmlAttribute
	public float numOfLiters;
	@XmlAttribute
	public int pumpNum;
	@Override
	public String toString() {
		return "WantsFuel [numOfLiters=" + numOfLiters + ", pumpNum="
				+ pumpNum + "]";
	}
}
