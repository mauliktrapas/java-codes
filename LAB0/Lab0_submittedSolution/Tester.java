
public class Tester {
	public static void main(String[] args){
		FuelStation f1=new FuelStation("PETROL",60,100);
		FuelStation f2=new FuelStation("DIESEL",50,120);
		Vehicles v1=new Vehicles("PETROL",45);
		v1.askForFuel(f1);
		Vehicles v2=new Vehicles("DIESEL",125);
		v2.askForFuel(f2);
	}

}
