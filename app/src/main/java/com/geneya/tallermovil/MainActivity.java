package com.geneya.tallermovil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    private static String dato;

    private static Button aux;
    private static int Last;
    private static boolean first=true;
    private static int parejas=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button2);
        b2=(Button) findViewById(R.id.button3);
        b3=(Button) findViewById(R.id.button5);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button6);
        b6=(Button) findViewById(R.id.button7);
        b7=(Button) findViewById(R.id.button8);
        b8=(Button) findViewById(R.id.button9);
        b9=(Button) findViewById(R.id.button10);
        b10=(Button) findViewById(R.id.button11);
        b11=(Button) findViewById(R.id.button12);
        b12=(Button) findViewById(R.id.button13);
        b13=(Button) findViewById(R.id.button14);
        b14=(Button) findViewById(R.id.button15);
        b15=(Button) findViewById(R.id.button16);
        b16=(Button) findViewById(R.id.button17);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText("1");
                if(first == true) {
                    first=false;
                    dato="1";
                    Last=b1.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="1"){
                        b1.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b1.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setText("7");
                if(first == true) {
                    first=false;
                    dato="7";
                    Last=b2.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="7"){
                        b2.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b2.setText("X");
                        aux.setText("X");
                    }
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setText("6");
                if(first == true) {
                    first=false;
                    dato="6";
                    Last=b3.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="6"){
                        b3.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b3.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setText("4");
                if(first == true) {
                    first=false;
                    dato="4";
                    Last=b4.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="4"){
                        b4.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b4.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setText("7");
                if(first == true) {
                    first=false;
                    dato="7";
                    Last=b5.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="7"){
                        b5.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b5.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setText("1");
                if(first == true) {
                    first=false;
                    dato="1";
                    Last=b6.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="1"){
                        b6.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b6.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setText("4");
                if(first == true) {
                    first=false;
                    dato="4";
                    Last=b7.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="4"){
                        b7.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b7.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setText("6");
                if(first == true) {
                    first=false;
                    dato="6";
                    Last=b8.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="6"){
                        b8.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b8.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9.setText("5");
                if(first == true) {
                    first=false;
                    dato="5";
                    Last=b9.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="5"){
                        b9.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b9.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b10.setText("3");
                if(first == true) {
                    first=false;
                    dato="3";
                    Last=b10.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="3"){
                        b10.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b10.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b11.setText("2");
                if(first == true) {
                    first=false;
                    dato="2";
                    Last=b11.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="2"){
                        b11.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b11.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b12.setText("8");
                if(first == true) {
                    first=false;
                    dato="8";
                    Last=b12.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="8"){
                        b12.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b12.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b13.setText("3");
                if(first == true) {
                    first=false;
                    dato="3";
                    Last=b13.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="3"){
                        b13.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b13.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b14.setText("5");
                if(first == true) {
                    first=false;
                    dato="5";
                    Last=b14.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="5"){
                        b14.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b14.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b15.setText("8");
                if(first == true) {
                    first=false;
                    dato="8";
                    Last=b15.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="8"){
                        b15.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b15.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b16.setText("2");
                if(first == true) {
                    first=false;
                    dato="2";
                    Last=b16.getId();
                }
                else {
                    first=true;
                    aux=(Button) findViewById(Last);
                    if(dato=="2"){
                        b16.setEnabled(false);
                        aux.setEnabled(false);
                    }
                    else{
                        b16.setText("X");
                        aux.setText("X");
                    }
                }
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
