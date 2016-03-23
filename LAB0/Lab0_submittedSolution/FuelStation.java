
public class FuelStation {
	private String fuelName;
	private int fuelPrice,fuelQuantity;
	
	FuelStation(String name,int p,int q){
		this.fuelName=name;
		this.fuelPrice=p;
		this.fuelQuantity=q;
	}
	
	public void sellFuel(String name,int q){
		if(fuelName!=name){
			System.out.println("Sorry, we don't have the type of fuel demanded.");
		}
		else if(q>fuelQuantity){
			System.out.println("Sorry, the quantity of fuel demanded exceeds the fuel available with us.");
		}
		else{
			fuelQuantity=fuelQuantity-q;
			viewTransactionDetails(name,q);
		}
	}
	
	public void viewTransactionDetails(String name,int q){
		int totalBill=fuelPrice*q;
		System.out.println("The fuel has been filled in your vehicle.");
		System.out.println("Bill for the transaction is Rs."+totalBill+"/-");
		System.out.println("THANK YOU - VISIT AGAIN :)");
		System.out.println("Remaining quantity of "+fuelName+" is "+fuelQuantity+"L");
	}

}
