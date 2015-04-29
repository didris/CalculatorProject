package com.example.deema.calc2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    Double n1=0.0,n2=0.0,m;
    String operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onClick_zero(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText(display.getText().toString()+0);
    }
    public void onClick_one(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText(display.getText().toString()+1);
    }
    public void onClick_two(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText(display.getText().toString()+2);
    }
    public void onClick_three(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText(display.getText().toString()+3);
    }
    public void onClick_four(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText(display.getText().toString()+4);
    }
    public void onClick_five(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText(display.getText().toString()+5);
    }
    public void onClick_six(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText(display.getText().toString()+6);
    }
    public void onClick_seven(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText(display.getText().toString()+7);
    }
    public void onClick_eight(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText(display.getText().toString()+8);
    }
    public void onClick_nine(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText(display.getText().toString()+9);
    }

    public void on1(View v ){
        TextView display= (TextView) findViewById(R.id.textView1);
        Double nnn=Double.parseDouble(display.getText().toString());
        n2=nnn;
        calculate(n1,operation,n2);

    }


    public void calculate ( double n1 ,String o , double n2 ){
        TextView display= (TextView) findViewById(R.id.textView1);
        if(o.equals("+")){
            display.setText(n1+n2+"");
        }
        else if(o.equals("-")){
            display.setText(n1-n2+"");
        }
        else if(o.equals("*")){
            display.setText(n1*n2+"");
        }
        else if(o.equals("/")){
            display.setText(n1/n2+"");
        }
    }


    public void onClick_multi(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        operation="*";
        n1=Double.parseDouble(display.getText().toString());

    }
    public void onClick_add(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        Button b=(Button)findViewById(R.id.buttonAdd);
        operation=b.getText().toString();
        n1=Double.parseDouble(display.getText().toString());

    }


    public void onClick_div(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        Button b=(Button)findViewById(R.id.buttonDiv);
        operation="/";
        n1=Double.parseDouble(display.getText().toString());
    }


    public void onClick_subtract(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        Button b=(Button)findViewById(R.id.buttonSubtract);
        operation=b.getText().toString();
        n1=Double.parseDouble(display.getText().toString());

    }
    public void onClick_clear(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText("");

    }

    public void onClick_back(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        String str=display.getText().toString().substring(0,display.getText().toString().length()-1);
        display.setText(str);

    }
    public void onClick_n(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        Double num=Double.parseDouble(display.getText().toString());
        display.setText(num*-1+"");

    }
    public void onClick_m(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        m=Double.parseDouble(display.getText().toString());
        display.setText("0");


    }
    public void onClick_mr(View v){
        TextView display= (TextView) findViewById(R.id.textView1);
        display.setText(m+"");

    }
    public void onClick_mc(View v){
        m=0.0;

    }
}
