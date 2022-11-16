package task9.jtable;

import javax.swing.table.DefaultTableModel;

public class WeightsListTableModel extends DefaultTableModel {
    public WeightsListTableModel(){
        setColumnIdentifiers(new String[] {"Weights"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Integer.class;
    }

    public void setDataVector(Integer[] weights) {
        Integer[][] dataVector = new Integer[weights.length][1];

        for (int i = 0; i < weights.length; i++)
            dataVector[i][0] = weights[i];

        setDataVector(dataVector, new String[]{"Weights"});
    }

    public void addRow() {
        if (dataVector.size() < 10) {
            Integer[] row = new Integer[]{0};
            addRow(row);
            fireTableDataChanged();
            return;
        }

        throw new RuntimeException("You already have 10/10 weights!");
    }

    public void deleteRow() {
        if (dataVector.size() > 0) {
            dataVector.remove(dataVector.size() - 1);
            fireTableDataChanged();
        }
    }

    public Integer[] getDataFromVector() {
        Integer[] data = new Integer[dataVector.size()];

        for (int i = 0; i < data.length; i++) {
            data[i] = (Integer) dataVector.get(i).get(0);
        }

        return data;
    }
}
