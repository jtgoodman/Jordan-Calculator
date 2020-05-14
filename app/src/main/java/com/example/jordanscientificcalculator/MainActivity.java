package com.example.jordanscientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    TextView userInput, signBox;

    String sign, str1, str2, ans;
    Double int1, int2, result;
    boolean hasDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (TextView) findViewById(R.id.userInput);
        signBox = (TextView) findViewById(R.id.sign);

        hasDecimal = false;

    }
    public void btnClear(View view) {

        userInput.setText(null);
        signBox.setText(null);
        str1 = null;
        str2 = null;
        sign = null;
        hasDecimal = false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_dot(View view) {
        if (!hasDecimal) {
            if (userInput.getText().equals("")) {

                userInput.setText("0.");
            } else {

                userInput.setText(userInput.getText() + ".");
            }

            hasDecimal = true;
        }
    }

    public void btnClick_add(View view) {
        sign = "+";
        str1 = userInput.getText().toString();
        userInput.setText(null);
        signBox.setText(str1 + " +");
        hasDecimal = false;
    }
    public void btnAns(View view) {
        userInput.setText(ans);
    }
    public void btnClick_subtract(View view) {
        sign = "-";
        str1 = userInput.getText().toString();
        userInput.setText(null);
        signBox.setText(str1 + " -");
        hasDecimal = false;
    }

    public void btnClick_multiply(View view) {
        sign = "*";
        str1 = userInput.getText().toString();
        userInput.setText(null);
        signBox.setText(str1 + " ×");
        hasDecimal = false;
    }

    public void btnClick_divide(View view) {
        sign = "/";
        str1 = userInput.getText().toString();
        userInput.setText(null);
        signBox.setText(str1 + " ÷");
        hasDecimal = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_log(View view) {
        sign = "log";
        userInput.setText(null);
        signBox.setText("log(");
        hasDecimal = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_ln(View view) {
        sign = "ln";
        userInput.setText(null);
        signBox.setText("ln(");
        hasDecimal = false;
    }

    public void btnClick_power(View view) {
        sign = "power";
        str1 = userInput.getText().toString();
        userInput.setText(null);
        hasDecimal = false;
        signBox.setText(str1 + "ⁿ");
    }

    public void btnClick_factorial(View view) {
        sign = "factorial";
        userInput.setText(null);
        hasDecimal = false;
        signBox.setText("!");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_sin(View view) {
        sign = "sin";
        userInput.setText(null);
        hasDecimal = false;
        signBox.setText("sin(");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_cos(View view) {
        sign = "cos";
        userInput.setText(null);
        hasDecimal = false;
        signBox.setText("cos(");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_tan(View view) {
        sign = "tan";
        str1 = userInput.getText().toString();
        userInput.setText(null);
        userInput.setText(str1);
        hasDecimal = false;
        signBox.setText("tan(");
    }

    public void btnClick_root(View view) {
        sign = "root";
        userInput.setText(null);
        hasDecimal = false;
        signBox.setText("√");
    }
    public void btnClick_Prcnt(View view) {
        str2 = userInput.getText().toString();
        int2 = Double.parseDouble(str2) * .01;
        str2 = (int2.toString());
        userInput.setText(int2.toString());
    }
    public void btnClick_Pi(View view) {
        if(userInput.getText().toString().equals("0")){
            signBox.setText("Error");
        }
        else if(userInput.getText().toString().equals("")) {
            userInput.setText(String.valueOf(Math.PI));
        }
        else{
            sign = "π";
            signBox.setText(userInput.getText().toString() + "π");

        }
    }
    public void btnClick_Neg(View view) {
        str2 = userInput.getText().toString();
        String value3 = "";
        int1 = Double.parseDouble(str2);
        int i = 1;
        if(int1 < 0) {
            while (i < str2.length()) {
                value3 += str2.charAt(i);
                i += 1;
            }
            str2 = value3;
            userInput.setText(value3);
        }
        else if(int1 > 0){
            value3 = "-";
            i = 0;
            while (i < str2.length()) {
                value3 += str2.charAt(i);
                i += 1;
            }
            str2 = value3;
            userInput.setText(value3);
        }
        else if(int1 == 0) {
            signBox.setText("Error");
        }
    }
    @SuppressLint("SetTextI18n")
    public void btn0(View view) {
        userInput.setText(userInput.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void btn1(View view) {
        userInput.setText(userInput.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btn2(View view) {
        userInput.setText(userInput.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void btn3(View view) {
        userInput.setText(userInput.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btn4(View view) {
        userInput.setText(userInput.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btn5(View view) {
        userInput.setText(userInput.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btn6(View view) {
        userInput.setText(userInput.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btn7(View view) {
        userInput.setText(userInput.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void btn8(View view) {
        userInput.setText(userInput.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btn9(View view) {
        userInput.setText(userInput.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_equal(View view) {
        if (sign == null) {
            signBox.setText("Error!");
        } else if (userInput.getText().equals("")) {
            signBox.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && str1.equals("")) {
            signBox.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "π":
                    str1 = userInput.getText().toString();
                    int1 = Double.parseDouble(str1);
                    userInput.setText(Math.PI * (int1) + "");
                    sign = null;
                    signBox.setText(int1.toString() + "π");
                    ans = userInput.getText().toString();
                    break;
                case "log":
                    str1 = userInput.getText().toString();
                    int1 = Double.parseDouble(str1);
                    userInput.setText(Math.log10(int1) + "");
                    sign = null;
                    signBox.setText("log(" + int1 +")");
                    ans = userInput.getText().toString();
                    break;
                case "ln":
                    str1 = userInput.getText().toString();
                    int1 = Double.parseDouble(str1);
                    userInput.setText(Math.log(int1) + "");
                    sign = null;
                    signBox.setText("ln(" + int1 +")");
                    ans = userInput.getText().toString();
                    break;
                case "power":
                    int1 = Double.parseDouble((str1));
                    str2 = userInput.getText().toString();
                    int2 = Double.parseDouble(str2);
                    signBox.setText(int1 +"^"+int2);
                    userInput.setText(Math.pow(int1, int2) + "");
                    sign = null;
                    signBox.setText(int1 +"^"+ int2);
                    ans = userInput.getText().toString();
                    break;
                case "root":
                    str1 = userInput.getText().toString();
                    int1 = Double.parseDouble((str1));
                    userInput.setText(Math.sqrt(int1) + "");
                    sign = null;
                    signBox.setText("√" + int1);
                    ans = userInput.getText().toString();
                    break;
                case "factorial":
                    str1 = userInput.getText().toString();
                    int1 = Double.parseDouble(str1);
                    int j = (int)Math.round(int1);
                    int i = j - 1;

                    while (i > 0) {
                        j = j * i;
                        i--;
                    }

                    userInput.setText(j + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "sin":
                    str1 = userInput.getText().toString();
                    int1 = Double.parseDouble((str1));
                    userInput.setText(Math.sin(int1) + "");
                    sign = null;
                    signBox.setText("sin(" + int1 +")");
                    ans = userInput.getText().toString();
                    break;
                case "cos":
                    str1 = userInput.getText().toString();
                    int1 = Double.parseDouble((str1));
                    userInput.setText(Math.cos(int1) + "");
                    sign = null;
                    signBox.setText("cos(" + int1 +")");
                    ans = userInput.getText().toString();
                    break;
                case "tan":
                    str1 = userInput.getText().toString();
                    int1 = Double.parseDouble((str1));
                    userInput.setText(Math.tan(int1) + "");
                    sign = null;
                    signBox.setText("tan(" + int1 +")");
                    ans = userInput.getText().toString();
                    break;
                case "+":
                    str2 = userInput.getText().toString();
                    int1 = Double.parseDouble(str1);
                    int2 = Double.parseDouble(str2);
                    result = int1 + int2;
                    userInput.setText(result + "");
                    sign = null;
                    signBox.setText(int1 +  " + " + int2);
                    ans = userInput.getText().toString();
                    break;
                case "-":
                    str2 = userInput.getText().toString();
                    int1 = Double.parseDouble(str1);
                    int2 = Double.parseDouble(str2);
                    result = int1 - int2;
                    userInput.setText(result + "");
                    sign = null;
                    signBox.setText(int1 + " - " + int2);
                    ans = userInput.getText().toString();
                    break;
                case "*":
                    str2 = userInput.getText().toString();
                    int1 = Double.parseDouble(str1);
                    int2 = Double.parseDouble(str2);
                    result = int1 * int2;
                    userInput.setText(result + "");
                    sign = null;
                    signBox.setText(int1 + " * " + int2);
                    ans = userInput.getText().toString();
                    break;
                case "/":
                    str2 = userInput.getText().toString();
                    int1 = Double.parseDouble(str1);
                    int2 = Double.parseDouble(str2);
                    result = int1 / int2;
                    userInput.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    ans = userInput.getText().toString();
                    break;
            }

        }
    }


    public void btnDelete(View view) {
        if (userInput.getText().equals("")) {
            userInput.setText(null);
        } else {
            int len = userInput.getText().length();
            String s = userInput.getText().toString();
            if (s.charAt(len - 1) == '.') {
                hasDecimal = false;
                userInput.setText(userInput.getText().subSequence(0, userInput.getText().length() - 1));

            } else {
                userInput.setText(userInput.getText().subSequence(0, userInput.getText().length() - 1));
            }
        }
    }
}
