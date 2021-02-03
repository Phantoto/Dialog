package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private Button bgButton;
    public ConstraintLayout RelativeLayout;
    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgButton = (Button)findViewById(R.id.button_fon);
        RelativeLayout = (ConstraintLayout) findViewById(R.id.RelativeLayout);
        context = MainActivity.this;
        bgButton.setOnClickListener(this);
    }


    public void onClick(View v) {

    final CharSequence[] items = {getText(R.string.red),
        getText(R.string.green), getText(R.string.yellow)};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);
        builder.setItems(items, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch (item){
                    case 0:
                    {RelativeLayout.setBackgroundResource(R.color.redColor);
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        break;}
                    case 1:
                    {RelativeLayout.setBackgroundResource(R.color.greenColor);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        break;}
                    case 2:
                    { RelativeLayout.setBackgroundResource(R.color.yellowColor);
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_LONG).show();
                        break;}
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

}

