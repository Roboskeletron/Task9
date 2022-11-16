package task9.jtable;

import javax.swing.*;
import java.awt.event.ActionEvent;
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

        addWeightButton.addActionListener(this::addWeightButtonClicked);
        deleteWeightButton.addActionListener(this::deleteWeightButtonClicked);
        openCloseFileBtn.addActionListener(this::openCloseFileBtnClicked);
        saveFileButton.addActionListener(this::saveFileButtonClicked);
    }

    private void saveFileButtonClicked(ActionEvent actionEvent) {

    }

    private void openCloseFileBtnClicked(ActionEvent actionEvent) {
        if (Objects.equals(actionEvent.getActionCommand(), "Open")){
            openCloseFileBtn.setText("Close");
        }
        else{
            openCloseFileBtn.setText("Open");
        }
    }

    private void deleteWeightButtonClicked(ActionEvent actionEvent) {
    }

    private void addWeightButtonClicked(ActionEvent e){

    }
}
