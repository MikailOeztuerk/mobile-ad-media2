package de.mikailztrk.malen;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MalenActivity extends AppCompatActivity {

    LinearLayout linear;
    MalenView malen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final MalenView malenView = new MalenView(getApplicationContext());

        linear = new LinearLayout(this);
        linear.setOrientation(LinearLayout.VERTICAL);

        LinearLayout linearH = new LinearLayout(this);
        linearH.setOrientation(LinearLayout.HORIZONTAL);


        Button b = new Button (this);
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams (
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,
                1.0f
        );
        param.weight = 1;
        b.setLayoutParams(param);

        b.setWidth(500);
        b.setText("REFRESH");
        Button r = new Button (this);
        r.setText("Rot");
        r.setWidth(500);

        linearH.addView(b);
        linearH.addView(r);

        linear.addView(linearH);
        linear.addView(malenView);

        setContentView(linear);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                malenView.resetLeinwandFarbe();
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                malenView.setPaintRed();
            }
        });
    }




}
