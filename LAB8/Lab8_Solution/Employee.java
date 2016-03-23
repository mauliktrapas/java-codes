public class Employee {
    // data attributes
    private int id;
    private String name;
    private int tenure;
    private int salary;

    // connection attributes
    private Employee parent;
    private Employee leftChild;
    private Employee rightChild;

    public Employee(int employeeId, String employeeName, int tenure, int salary) {
        this.id = employeeId;
        this.name = employeeName;
        this.tenure = tenure;
        this.salary = salary;
    }

    // getters for data attributes
    public int getId() {return this.id;}
    public String getName() {return this.name;}
    public int getTenure() {return this.tenure;}
    public int getSalary() {return this.salary;}

    // setters for connection attributes
    public void setParent(Employee parent) {this.parent = parent;}
    public void setLeftChild(Employee leftChild) {this.leftChild = leftChild;}
    public void setRightChild(Employee rightChild) {this.rightChild = rightChild;}

    // getters for connection attributes
    public Employee getParent() {return this.parent;}
    public Employee getLeftChild() {return this.leftChild;}
    public Employee getRightChild() {return this.rightChild;}

    public String toString() {
        return this.name;
    }
}
