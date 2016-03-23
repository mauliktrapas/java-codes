
public class Cell {
	private char life='-';
	private int rowNumber;
	private int columnNumber;
	
	public Cell(char life, int rowIndex, int columnIndex) {
		this.life = life;
		this.rowNumber = rowIndex;
		this.columnNumber = columnIndex;
	}
	
	public void setState(char life){
		this.life=life;
	}
	
	public char getState(){
		return life;
	}
	
	public char getNextState(){
		int count=Cells.getNeighbourCount(this,rowNumber,columnNumber);
		if((count==2 || count==3) && this.life=='*'){
			return '*';
		}
		else if(count==3 && this.life=='-'){
			return '*';
		}
		return '-';
	}
}