package may09;

import may05.CellPhone;
import may05.LandLine;
public class PhoneDriver {

	public static void main(String[] args) {
		
		CellPhone c = new CellPhone("Apple", 5);
		LandLine l  = new LandLine("Samsung", 6);
		System.out.println(c.getBrand());
		System.out.println(l.getSize());
		c.makeCallFromCell();
		l.makeCallFromLand();
	
			

	}

}
