package task9.jtable;

import javax.swing.table.DefaultTableModel;

public class WeightsListTableModel extends DefaultTableModel {
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Integer.class;
    }

    @Override
    public String getColumnName(int column) {
        return "Weights";
    }


    public void setDataVector(Integer[] weights) {
        Integer[][] dataVector = new Integer[weights.length][1];

        for (int i = 0; i < weights.length; i++)
            dataVector[i][0] = weights[i];

        setDataVector(dataVector, new String[]{"Weights"});
    }
}
