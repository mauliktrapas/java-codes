import java.util.ArrayList;

public class BST {

    private Employee root;
    
    /**
     * Inserts an Employee to the Employee database
     * @param employeeId - Integer ID of the employee
     * @param employeeName - Name of the employee
     * @param tenure - Tenure (integer) of the employee
     * @param salary - Salary (integer) of the employee
     * @return inserted? - Returns "true" when successfully inserted. In case of an exception, 
     * false should be returned. I have skipped exception handling currently.
     */
    public boolean insert(int employeeId, String employeeName, int tenure, int salary) {
        Employee newEmployee = new Employee(employeeId, employeeName, tenure, salary);
        if (root == null) {
            root = newEmployee;
            return true;
        }
        // If root is not null
        return this._insert(newEmployee, root);
    }

    private boolean _insert(Employee newEmployee, Employee currentEmployee) {
        // We are using the (tenure, salary) as comparator
        if (newEmployee.getTenure() > currentEmployee.getTenure() ||
               (newEmployee.getTenure() == currentEmployee.getTenure() 
                && newEmployee.getSalary() > currentEmployee.getSalary())) {
            // new employee has more power than current employee
            // we will insert the new employee in the right tree of current employee
            if (currentEmployee.getRightChild() == null) {
                // Set newEmployee as the right child of currentEmployee
                currentEmployee.setRightChild(newEmployee);
                newEmployee.setParent(currentEmployee);
                return true;
            }
            return _insert(newEmployee, currentEmployee.getRightChild());
        }
        else {
            // new employee has equal or less power than current employee
            // we will insert the new employee in the left tree of current employee
            if (currentEmployee.getLeftChild() == null) {
                currentEmployee.setLeftChild(newEmployee);
                newEmployee.setParent(currentEmployee);
                return true;
            }
            return _insert(newEmployee, currentEmployee.getLeftChild());
        }
    }
 
    /**
     * Searches an employee through the employee database using the binary search property of the tree.
     * Feel free to modify the method signature (return type, parameters).
     */
    public ArrayList<Employee> search(int tenure, int salary) {
        if (root == null) return null;
        return _search(tenure, salary, root);
    }
    
    private ArrayList<Employee> _search(int tenure, int salary, Employee currentEmployee) {
        ArrayList<Employee> matchedEmployees = new ArrayList<Employee>();
        if (tenure == currentEmployee.getTenure() && salary == currentEmployee.getSalary())
            matchedEmployees.add(currentEmployee);
        if (tenure > currentEmployee.getTenure() || (tenure == currentEmployee.getTenure() &&
         salary > currentEmployee.getSalary())) {
            if (currentEmployee.getRightChild() != null)
               return _search(tenure, salary, currentEmployee.getRightChild());
        } else {
            if (currentEmployee.getLeftChild() != null) {
                ArrayList<Employee> submatch = _search(tenure, salary, currentEmployee.getLeftChild());
                for (Employee e: submatch)
                    matchedEmployees.add(e);
            }
        }
        return matchedEmployees;
    }

    /**
     * Provides a textual representation of the class instance.
     * @see <a href="http://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#toString()">Object.toString()</a>
     */
    public String toString() {
        return _toString(new StringBuffer(""), root, 0).toString();
    }

    // Recursively traverses the tree and returns a string representation ot it.
    // You don't need to understand how this method works.
    private StringBuffer _toString(StringBuffer treePrint, Employee node, int level) {
        treePrint.append(node.toString());
        treePrint.append("\n");
        for (int i = 0; i < level; i++)
            treePrint.append("|    ");
        treePrint.append("|--- ");
        if (node.getLeftChild() == null)
            treePrint.append("Nothing\n");
        else {
            treePrint.append(_toString(new StringBuffer(""), node.getLeftChild(), level+1));
        }
        for (int i = 0; i < level; i++)
            treePrint.append("|    ");
        treePrint.append("|___ ");
        if (node.getRightChild() == null)
            treePrint.append("Nothing\n");
        else {
            treePrint.append(_toString(new StringBuffer(""), node.getRightChild(), level+1));
        }
        return treePrint;
    }
}
