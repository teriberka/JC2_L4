package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button buttonMultiply;
    @FXML
    private Button buttonDivide;
    @FXML
    private Button buttonResult;
    @FXML
    private Button buttonClean;


    @FXML
    private TextArea textArea;
    @FXML
    private TextField textField;

    public int firstDigit = 0;
    public int secondDigit = 0;
    public String actionType = "";

    public void btn1Click() {
        textArea.appendText("1");

    }

    public void btn2Click() {
        textArea.appendText("2");

    }

    public void btn3Click() {
        textArea.appendText("3");

    }

    public void btn4Click() {
        textArea.appendText("4");

    }

    public void btn5Click() {
        textArea.appendText("5");

    }

    public void btn6Click() {
        textArea.appendText("6");

    }

    public void btn7Click() {
        textArea.appendText("7");

    }

    public void btn8Click() {
        textArea.appendText("8");

    }

    public void btn9Click() {
        textArea.appendText("9");

    }

    public void btnAction(String s){
        firstDigit = Integer.parseInt(textArea.getText());
        textArea.clear();
        textArea.appendText(s);
        actionType = textArea.getText();
        textArea.clear();
    }

    public void btnPlusClick() {
        btnAction("+");
    }

    public void btnMinusClick() {
        btnAction("-");
    }

    public void btnMultiplyClick() {
        btnAction("*");
    }

    public void btnDivideClick() {
        btnAction("/");
    }

    public void btnClean() {
        textArea.clear();
    }


    public void btnResultClick() {
        secondDigit = Integer.parseInt(textArea.getText());

        textArea.clear();

        System.out.println("firstDigit = " + firstDigit);
        System.out.println("firstAction = " + actionType);
        System.out.println("secondDigit = " + secondDigit);

        if (actionType.equals("+")) {
            textArea.appendText(String.valueOf(firstDigit + secondDigit));
        } else if (actionType.equals("-")) {
            textArea.appendText(String.valueOf(firstDigit - secondDigit));
        } else if (actionType.equals("*")) {
            textArea.appendText(String.valueOf(firstDigit * secondDigit));
        } else if (actionType.equals("/")) {
            textArea.appendText(String.valueOf(firstDigit / secondDigit));
        } else {
            System.out.println("Algorithm dont know that action type! check logic");
            textArea.appendText(String.valueOf("Error!"));
        }

        firstDigit = 0;
        secondDigit = 0;
        actionType = "";

    }
}
