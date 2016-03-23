
public class Vehicles {
	private String fuelNameReq;
	private int fuelQuantityReq;
	
	Vehicles(String name,int q){
		this.fuelNameReq=name;
		this.fuelQuantityReq=q;
	}
	
	public void askForFuel(FuelStation pump){
		pump.sellFuel(fuelNameReq,fuelQuantityReq);
	}

}
