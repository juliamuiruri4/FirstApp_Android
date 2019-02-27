package com.example.sa.firstapp;
//imports
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; //imports from button
import android.widget.EditText; //imports from editview
import android.widget.TextView; //imports from textview

public class MainActivity extends AppCompatActivity {
//instances of the objects listed
    Button clickme;
    TextView display1;
    TextView display2;
    EditText name;
    //EditText password;
    @Override
    //protected access specifier therefore properties can be accessed from friend classes
    protected void onCreate(Bundle savedInstanceState) {
        //incorporates the main activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//finds and incorporates the attributes in the activity
        clickme=findViewById(R.id.btnclickme);
        display1=findViewById(R.id.txtdispaly);
        name=findViewById(R.id.txtname);
        display2=findViewById(R.id.txtdispaly2);
        //password=findViewById(R.id.editText);

//prompts action after the click button is clicked on

        clickme.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                String Name = name.getText().toString().trim();

                display1.setText("hello there, " + Name  +" \nthank you for trying me out");
display2.setText("do you like it");

                name.requestFocus();
            }
        });
    }
}

