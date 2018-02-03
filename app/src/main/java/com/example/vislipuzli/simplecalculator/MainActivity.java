package com.example.vislipuzli.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final int MENU_RESET_ID = 1;
    final int MENU_QUIT_ID = 2;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    Button btnPoint;
    Button btnEquals;

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnPlus;

    TextView tvResult1;
    TextView tvResult2;
    TextView tvResult3;

    String s;

    String oper = "";

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0, MENU_RESET_ID, 0, "RESET");
        menu.add(0, MENU_QUIT_ID, 0, "QUIT");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case MENU_RESET_ID:
                tvResult1.setText("");
                tvResult2.setText("");
                tvResult3.setText("0");
                break;
            case MENU_QUIT_ID:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnEquals = (Button) findViewById(R.id.btnEquals);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        tvResult1 = (TextView) findViewById(R.id.tvResult1);
        tvResult2 = (TextView) findViewById(R.id.tvResult2);
        tvResult3 = (TextView) findViewById(R.id.tvResult3);

        tvResult3.setText("0");


        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnEquals.setOnClickListener(this);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        try {
//        float num3 = Integer.getInteger(tvResult3.getText().toString());
//        float num1 = Integer.getInteger(tvResult1.getText().toString());

            if (tvResult3.getText().toString().contains("+") ||
                    tvResult3.getText().toString().contains("-") ||
                    tvResult3.getText().toString().contains("*") ||
                    tvResult3.getText().toString().contains("/")) {
                tvResult1.setText(tvResult2.getText());
                tvResult2.setText(tvResult3.getText());
                tvResult3.setText("");
            }

            if (tvResult3.getText().toString().equals("0")) {
                tvResult3.setText("");
            }

            switch (v.getId()) {
                case R.id.btn0:
                    tvResult3.setText(tvResult3.getText() + "0");
                    break;
                case R.id.btn1:
                    tvResult3.setText(tvResult3.getText() + "1");
                    break;
                case R.id.btn2:
                    tvResult3.setText(tvResult3.getText() + "2");
                    break;
                case R.id.btn3:
                    tvResult3.setText(tvResult3.getText() + "3");
                    break;
                case R.id.btn4:
                    tvResult3.setText(tvResult3.getText() + "4");
                    break;
                case R.id.btn5:
                    tvResult3.setText(tvResult3.getText() + "5");
                    break;
                case R.id.btn6:
                    tvResult3.setText(tvResult3.getText() + "6");
                    break;
                case R.id.btn7:
                    tvResult3.setText(tvResult3.getText() + "7");
                    break;
                case R.id.btn8:
                    tvResult3.setText(tvResult3.getText() + "8");
                    break;
                case R.id.btn9:
                    tvResult3.setText(tvResult3.getText() + "9");
                    break;
                case R.id.btnPoint:
                    if (!tvResult3.getText().toString().contains(",")) {
                        tvResult3.setText(tvResult3.getText() + ".");
                        break;
                    }
                case R.id.btnAdd:
                    if (tvResult3.getText().length() > 0) {
                        tvResult2.setText(tvResult3.getText());
                        tvResult3.setText("+");
                        break;
                    }
                case R.id.btnSub:
                    if (tvResult3.getText().length() > 0) {
                        tvResult2.setText(tvResult3.getText());
                        tvResult3.setText("-");
                        break;
                    }
                case R.id.btnMult:
                    if (tvResult3.getText().length() > 0) {
                        tvResult2.setText(tvResult3.getText());
                        tvResult3.setText("*");
                        break;
                    }
                case R.id.btnDiv:
                    if (tvResult3.getText().length() > 0) {
                        tvResult2.setText(tvResult3.getText());
                        tvResult3.setText("/");
                        break;
                    }
                case R.id.btnEquals:
                    Integer x = (int) Integer.parseInt(tvResult1.getText().toString());
                    Integer y = (int) Integer.parseInt(tvResult3.getText().toString());
                    if (tvResult2.getText().toString().equals("+")) {
                        Integer res = x + y;
                        tvResult1.setText(tvResult3.getText().toString());
                        tvResult3.setText(String.valueOf(res));
                        break;
                    }
                    if (tvResult2.getText().toString().equals("-")) {
                        Integer res = x - y;
                        tvResult1.setText(tvResult3.getText().toString());
                        tvResult3.setText(String.valueOf(res));
                        break;
                    }
                    if (tvResult2.getText().toString().equals("*")) {
                        Integer res = x * y;
                        tvResult1.setText(tvResult3.getText().toString());
                        tvResult3.setText(String.valueOf(res));
                        break;
                    }
                    if (tvResult2.getText().toString().equals("/")) {
                        Integer res = x / y;
                        tvResult1.setText(tvResult3.getText().toString());
                        tvResult3.setText(String.valueOf(res));
                        break;
                    }
            }
        }
        catch (Exception e) {
            Toast.makeText(this, "OOOPS!", Toast.LENGTH_SHORT);
        }
    }
}
