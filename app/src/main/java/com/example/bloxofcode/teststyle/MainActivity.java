package com.example.bloxofcode.teststyle;


import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

class CustomDialog extends Dialog implements android.view.View.OnClickListener {
    public Activity c;
    public CustomDialog(Activity a) {
        super(a);
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_activity);
        getWindow().setBackgroundDrawableResource(android.R.drawable.dialog_holo_dark_frame);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //dosomething
            }
        });
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}

public class MainActivity extends AppCompatActivity {
    private CustomDialog customDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        customDialog = new CustomDialog(MainActivity.this);
        customDialog.show();

    }


}




