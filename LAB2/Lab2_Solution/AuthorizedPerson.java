import java.lang.Math;

public class AuthorizedPerson {
    
    private String name;
    private String sex;
    private int age;
    private String address;
    
    public AuthorizedPerson() {
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
        
    public String getSex() {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getAddress() {
    	return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Return the number of residents elder than me.
     * This should only happen 
	 */
    public int residentsElderThanMe(Person[] residents, int totalResidents) {
        int numResidents = 0;
        for (int i = 0; i < totalResidents; i++) {
            if (residents[i].getAge() > this.age)
                numResidents++;
        }
        return numResidents;
    }
    
    public int oldestMaleAge(Person[] residents, int totalResidents) {
        int oldestAge = this.age;
        for (int i = 0; i < totalResidents; i++) {
            if (residents[i].getSex().equals("male")) {
                oldestAge = Math.max(oldestAge, residents[i].getAge());
            }
        }
        return oldestAge;
    }
    
    public String getNameGivenAddress(Person[] residents, int totalResidents, String address) {
        for (int i = 0; i < totalResidents; i++) {
            if (residents[i].getAddress().equals(address))
                return residents[i].getName();
        }
        return null;
    }
    
    public String toString() {
        return "Name: "+this.getName()+"\nSex: "+this.getSex()+"\nAge: "+this.getAge()+"\nAddress: "+this.getAddress();
    }
}