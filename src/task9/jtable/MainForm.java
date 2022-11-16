package task9.jtable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Objects;

public class MainForm extends JFrame {
    private JPanel panel;
    private JTable weightsList;
    private JLabel outputLabel;
    private JTextField weightSumInput;
    private JButton calculateButton;
    private JButton addWeightButton;
    private JButton deleteWeightButton;
    private JButton openCloseFileBtn;
    private JButton saveFileButton;

    public MainForm(){
        setContentPane(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        weightsList.setModel(new TableModel());

        addWeightButton.addActionListener(this::addWeightButtonClicked);
        deleteWeightButton.addActionListener(this::deleteWeightButtonClicked);
        openCloseFileBtn.addActionListener(this::openCloseFileBtnClicked);
        saveFileButton.addActionListener(this::saveFileButtonClicked);
    }

    private void saveFileButtonClicked(ActionEvent actionEvent) {

    }

    private void openCloseFileBtnClicked(ActionEvent actionEvent) {
        try {
            if (Objects.equals(actionEvent.getActionCommand(), "Open")) {
                openCloseFileBtn.setText("Close");
            } else {

                openCloseFileBtn.setText("Open");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void deleteWeightButtonClicked(ActionEvent actionEvent) {
    }

    private void addWeightButtonClicked(ActionEvent e){

    }

    private <T> T getFileStream(Class<T> type) throws FileNotFoundException {
        JFileChooser fileChooser = new JFileChooser("C:\\Users\\wwwrt\\source\\repos\\Task9");
        int dialogResult = JFileChooser.ERROR_OPTION;
        T stream;

        if (type == FileInputStream.class){
            dialogResult = fileChooser.showOpenDialog(this);

        } else if (type == FileOutputStream.class) {
            dialogResult = fileChooser.showSaveDialog(this);
        }

        if (dialogResult != JFileChooser.APPROVE_OPTION)
            return null;

        var file = fileChooser.getSelectedFile();

        if (type == FileInputStream.class)
            stream = (T) new FileInputStream(file);
        else stream = (T) new FileOutputStream(file);

        return stream;
    }
}
