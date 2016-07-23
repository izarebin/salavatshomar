package com.izarebin.salavatcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SalavatCounter extends AppCompatActivity {
    int counter;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salavat_counter);
        final TextView txttitle = (TextView) findViewById(R.id.txttitle);
        final EditText edtcounter = (EditText) findViewById(R.id.edtcounter);
        Button btncounter = (Button) findViewById(R.id.btncounter);
        Button btnreset = (Button) findViewById(R.id.btnreset);

        btncounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = Integer.parseInt(edtcounter.getText().toString());
                if (counter < count){
                    counter++;
                    txttitle.setText("Tedade Salavat haye shoma = " + counter);
                } else {
                    txttitle.setText("Tedade Salavat haye shoma be andaze moshakhas shode resid");
                }
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                txttitle.setText("Reset Shod");
            }
        });
    }
}
