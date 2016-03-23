import java.util.Scanner;
import java.io.File;

class Input {
    public static void main(String[] args) throws Exception {
        Scanner readFile = new Scanner(new File("inp5"));
        int m, n;
        m = readFile.nextInt();
        n = readFile.nextInt();
        readFile.nextLine(); // The first line will contain ''
        String[] inputState = new String[m];
        Cells.setRows(m);
        Cells.setCols(n);
        for (int i = 0; i < m; i++) {
            inputState[i] = readFile.nextLine();
        }
        Cells.setState(inputState);
        for (int i = 0; i < 100; i++) {
            Cells.nextState();
            Cells.printState();
            System.out.println("State: "+(i+1));
            Thread.sleep(600);
            if (i != 99)
                for (int j = 0; j < 60; j++) System.out.print('\f');
        }
    }
}
