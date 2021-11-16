package com.example.calculator;

import static com.example.calculator.R.*;
import static com.example.calculator.R.id.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button zeroBTN,oneBTN,twoBTN,threeBTN,fourBTN,fiveBTN,sixBTN,sevenBTN,eightBTN,nineBTN,modBTN,plusBTN,minusBTN,divideBTN,mulBTN,equalBTN,pointBTN,clearBTN;
    EditText end;
    float v1,v2;
    boolean add,sub,div,Mul,Mod;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zeroBTN=(Button)findViewById(R.id.zeroBTN);
        oneBTN=(Button)findViewById(id.oneBTN);
        twoBTN=(Button)findViewById(R.id.twoBTN);
        threeBTN=(Button)findViewById(R.id.threeBTN);
        fourBTN=(Button)findViewById(R.id.fourBTN);
        fiveBTN=(Button)findViewById(R.id.fiveBTN);
        sixBTN=(Button)findViewById(R.id.sixBTN);
        sevenBTN=(Button)findViewById(R.id.sevenBTN);
        eightBTN=(Button)findViewById(R.id.eightBTN);
        nineBTN=(Button)findViewById(R.id.nineBTN);
        plusBTN=(Button)findViewById(R.id.plusBTN);
        minusBTN=(Button)findViewById(R.id.minusBTN);
        divideBTN=(Button)findViewById(R.id.divideBTN);
        mulBTN=(Button)findViewById(R.id.mulBTN);
        modBTN=(Button)findViewById(R.id.modBTN);
        clearBTN=(Button)findViewById(R.id.clearBTN);
        pointBTN=(Button)findViewById(R.id.pointBTN);
        equalBTN=(Button)findViewById(R.id.equalBTN);
        end=(EditText) findViewById(R.id.editTextTextPersonName);

        zeroBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(end.getText()+"0");
            }
        });

        oneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(end.getText()+"1");
            }
            });

        twoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(end.getText() + "2");
            }
        });

        threeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(end.getText() + "3");
            }
        });

        fourBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(end.getText() + "4");
            }
        });

        fiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(end.getText() + "5");
            }
        });

        sixBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(end.getText() + "6");
            }
        });

        sevenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(end.getText() + "7");
            }
        });

        eightBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(end.getText() + "8");
            }
        });

        nineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(end.getText() + "9");
            }
        });

        pointBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(end.getText() + ".");
            }
        });



        plusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(end==null) {
                    end.setText("");
                }else
                {
                    v1=Float.parseFloat(end.getText()+"");
                    add=true;
                    end.setText(null);
                }


            }
        });


        minusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(end==null) {
                    end.setText("");
                }else
                {
                    v1=Float.parseFloat(end.getText()+"");
                    sub=true;
                    end.setText(null);
                }


            }
        });

        divideBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(end==null) {
                    end.setText("");
                }else
                {
                    v1=Float.parseFloat(end.getText()+"");
                    div=true;
                    end.setText(null);
                }


            }
        });


        mulBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(end==null) {
                    end.setText("");
                }else
                {
                    v1=Float.parseFloat(end.getText()+"");
                    Mul=true;
                    end.setText(null);
                }


            }
        });

        modBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(end==null) {
                    end.setText("");
                }else
                {
                    v1=Float.parseFloat(end.getText()+"");
                    Mod=true;
                    end.setText(null);
                }


            }
        });

        equalBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2=Float.parseFloat(end.getText()+"");
                if(add==true)
                {
                    end.setText(v1+v2+"");
                    add=false;
                }
                if(sub==true)
                {
                    end.setText(v1-v2+"");
                    sub=false;
                }
                if(div==true)
                {
                    end.setText(v1/v2+"");
                    div=false;
                }
                if(Mul==true)
                {
                    end.setText(v1*v2+"");
                    Mul=false;
                }
                if(Mod==true)
                {
                    end.setText(v1%v2+"");
                    Mod=false;
                }

            }
        });

        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end.setText(" ");
            }
        });












    }
}