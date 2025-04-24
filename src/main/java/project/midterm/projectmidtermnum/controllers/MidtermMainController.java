package project.midterm.projectmidtermnum.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import project.midterm.projectmidtermnum.models.MidtermMainModel;

public class MidtermMainController {

    @FXML
    private TextField numInputField;

    @FXML
    private Label numSumLabel;

    @FXML
    private Label numEntriesLabel;

    @FXML
    private Label statusLabel;

    private final MidtermMainModel model = new MidtermMainModel();

    @FXML
    private void submit() {
        String num = numInputField.getText();

        boolean success = model.addNumber(num);

        if (success) {
            String sum = model.getSum() + "";
            String entries = model.getEntries() + "";

            statusLabel.setText("");
            numSumLabel.setText(sum);
            numEntriesLabel.setText(entries);
        } else {
            statusLabel.setText("Invalid Input");
        }
        numInputField.clear();
    }

}
