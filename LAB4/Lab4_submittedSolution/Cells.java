
public class Cells {
	private static int rows,columns;
	private static Cell[][] life;
	
	public static int getRows() {
		return rows;
	}
	
	public static void setRows(int rows) {
		Cells.rows = rows;
	}
	
	public static int getColumns() {
		return columns;
	}
	
	public static void setColumns(int columns) {
		Cells.columns = columns;
	}
	
	public static void setState(String[] inputState){
		life=new Cell[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				life[i][j]=new Cell(inputState[i].charAt(j),i,j);
			}
		}
	}
	
	public static void nextState(){
		Cell[][] newLife=new Cell[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				newLife[i][j]=new Cell(life[i][j].getNextState(),i,j);
			}
		}
		life=newLife;
	}
	
	public static void printState(){
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(life[i][j].getState());
			}
			System.out.println();
		}
	}
	
	public static int getNeighbourCount(Cell original,int rowIndex,int columnIndex){
		if(life[rowIndex][columnIndex]!=original){
			return -1;
		}
		int count=0;
		for(int i=Math.max(0,rowIndex-1);i<=Math.min(rows-1,rowIndex+1);i++){
			for(int j=Math.max(0,columnIndex-1);j<=Math.min(columns-1,columnIndex+1);j++){
				if(i!=rowIndex || j!=columnIndex){
					if(life[i][j].getState()=='*'){
						count++;
					}
				}
			}
		}
		return count;
	}
}