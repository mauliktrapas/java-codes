
public class AuthResident {
	private String name,sex,address;
	private int age;
	
	public void setName(String n){
		this.name=n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSex(String s){
		this.sex=s;
	}
	
	public String getSex(){
		return sex;
	}
	
	public void setAge(int a){
		this.age=a;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAddress(String add){
		this.address=add;
	}
	
	public String getAddress(){
		return address;
	}
	
	public int elderThanMe(Resident[] Person,int totalRes){
		int elder=0;
		for(int i=0;i<totalRes;i++){
			if(Person[i].getAge()>this.age){
				elder++;
			}
		}
		return elder;
	}
	
	public int oldestManAge(Resident[] Person,int totalRes){
		int MAX_AGE=this.age;
		for(int i=0;i<totalRes;i++){
			if(Person[i].getSex().charAt(0)=='m'){
				if(Person[i].getAge()>MAX_AGE){
					MAX_AGE=Person[i].getAge();
				}
			}
		}
		return MAX_AGE;
	}
	
	public String findName(Resident[] Person,int totalRes,String givenAddress){
		String foundName=null;
		for(int i=0;i<totalRes;i++){
			if(Person[i].getAddress().contains(givenAddress)){
				foundName=Person[i].getName();
				break;
			}
		}
		return foundName;
	}
}
