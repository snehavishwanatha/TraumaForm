package shrinidhikr.example.com.traumaform;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstSetofVitals extends AppCompatActivity {
    public static EditText D34,D35,D36,D37,D38,D39,D40,D41,D42,D43;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_setof_vitals);
        getSupportActionBar().setTitle("First Set of Vitals");

        D34 = (EditText)findViewById(R.id.D34);
        D35 = (EditText)findViewById(R.id.D35);
        D36 = (EditText)findViewById(R.id.D36);
        D37 = (EditText)findViewById(R.id.D37);
        D38 = (EditText)findViewById(R.id.D38);
        D39 = (EditText)findViewById(R.id.D39);
        D40 = (EditText)findViewById(R.id.D40);
        D41 = (EditText)findViewById(R.id.D41);
        D42 = (EditText)findViewById(R.id.D42);
        D43 = (EditText)findViewById(R.id.D43);

        Button b = (Button) findViewById(R.id.next4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                share.auth = getApplicationContext().getSharedPreferences("0001", Context.MODE_PRIVATE);
                share.editor.putString("34",D34.getText().toString());
                share.editor.putString("35",D35.getText().toString());
                share.editor.putString("36",D36.getText().toString());
                share.editor.putString("37",D37.getText().toString());
                share.editor.putString("38",D38.getText().toString());
                share.editor.putString("39",D39.getText().toString());
                share.editor.putString("40",D40.getText().toString());
                share.editor.putString("41",D41.getText().toString());
                share.editor.putString("42",D42.getText().toString());
                share.editor.putString("43",D43.getText().toString());
                share.editor.apply();
                Intent i = new Intent(getApplicationContext(), EDInvestigations.class);
                startActivity(i);
            }
        });
    }
}