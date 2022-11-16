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

    public void addRow() {
        if (dataVector.size() < 10) {
            Integer[] row = new Integer[]{0};
            addRow(row);
            return;
        }

        throw new RuntimeException("You already have 10/10 weights!");
    }

    public void deleteRow() {
        if (dataVector.size() > 0)
            dataVector.remove(dataVector.size() - 1);
    }

    public Integer[] getDataFromVector(){
        Integer[] data = new Integer[dataVector.size()];

        for (int i = 0; i < data.length; i++){
            data[i] = (Integer) dataVector.get(i).get(0);
        }

        return data;
    }
}
