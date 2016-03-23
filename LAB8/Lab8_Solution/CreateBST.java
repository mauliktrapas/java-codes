import java.util.Scanner;
public class CreateBST {
    public static void main(String[] args) {
        BST bst = new BST();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] line = (scanner.nextLine()).split(" ");
            int id = Integer.parseInt(line[0]);
            String name = line[1];
            int tenure = Integer.parseInt(line[2]);
            int salary = Integer.parseInt(line[3]);
            bst.insert(id, name, tenure, salary);
            System.out.println(bst);
        }
        int m = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < m; i++) {
            String line[] = scanner.nextLine().split(" ");
            int tenure = Integer.parseInt(line[0]);
            int salary = Integer.parseInt(line[1]);
            java.util.ArrayList<Employee> matchedEmployees = bst.search(tenure, salary);
            if (matchedEmployees != null) {
                for (Employee e: matchedEmployees)
                    System.out.println(e);
            } else System.out.println("None found");
        }
    }
}
