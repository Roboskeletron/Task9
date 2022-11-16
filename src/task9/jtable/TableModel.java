package task9.jtable;

import javax.swing.table.DefaultTableModel;

public class TableModel extends DefaultTableModel {
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Integer.class;
    }

    @Override
    public String getColumnName(int column) {
        return "Weights";
    }
}
