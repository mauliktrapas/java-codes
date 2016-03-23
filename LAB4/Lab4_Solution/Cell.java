class Cell {
    private char life = '-';
    private int rowIndex;
    private int colIndex;

    public Cell(char life, int rowIndex, int colIndex) {
        this.life = life;
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }

    public char getState() {
        return life;
    }

    public void setState(char life) {
        this.life = life;
    }

    public char getNextState() {
        int count = Cells.getNeighborCount(this, rowIndex, colIndex);
        if ((count ==2 || count == 3) && this.life == '*')
            return '*'; 
        else if (count == 3 && this.life == '-')
            return '*';
        return '-';
    }
}
