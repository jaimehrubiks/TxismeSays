package supersay;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jaime Hidalgo García
 */
    public class TableModel extends DefaultTableModel implements Reorderable{
        
    //private boolean[][] editable_cells;    
    private boolean edit = false;    
        
    public TableModel(Object[] columnNames, int emptyRows){
        super(columnNames, emptyRows);
        //this.editable_cells = new boolean[10][10];
        
    }
    
//    public void reset_editables(){
//        for( int i = 0; i < editable_cells.length ; i++)
//            for( int j =0 ; j < editable_cells[i].length ; j++)
//                editable_cells[i][j] = true;
//    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
    //    if(editable_cells[row][col]==false) return false;
        if     ( col == 3 && edit == false) return true;
        else if( col == 0 && edit == true) return true;
        else if( col == 2 && edit == true) return true;
        
        else return false;
        
        //return true;
    }
    
    public void setEditMode(boolean edit){
        this.edit = edit;
    }
    
    @Override
    public Class getColumnClass(int c) {
        if ( getValueAt(0, c) == null ) return Object.class;
        else
        return getValueAt(0, c).getClass();
        //else super.get
    }
    
    public void reorder(int fromIndex, int toIndex){
        
    }
    
    
    
//    public void setCellEditable(int row, int col, boolean value) {
//        this.editable_cells[row][col] = value; // set cell true/false
//        this.fireTableCellUpdated(row, col);
//    }
    
    
}

