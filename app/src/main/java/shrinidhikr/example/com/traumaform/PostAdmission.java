package shrinidhikr.example.com.traumaform;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class PostAdmission extends AppCompatActivity {
    public static EditText D47_1_1,D47_1_2,D47_2_1,D47_2_2,D47_3_1,D47_3_2,D47_4_1,D47_4_2,D47_5_1,D47_5_2,D47_6_1,D47_6_2,D47_7_1,D47_7_2,D47_8_1,D47_8_2,D47_9_1,D47_9_2,D47_10_1,D47_10_2,D47_11_1,D47_11_2,D47_12_1,D47_12_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_admission);
        getSupportActionBar().setTitle("Post Admission");

        D47_1_1 = (EditText)findViewById(R.id.D47_1_1);
        D47_1_2 = (EditText)findViewById(R.id.D47_1_2);
        D47_2_2 = (EditText)findViewById(R.id.D47_2_2);
        D47_2_1 = (EditText)findViewById(R.id.D47_2_1);
        D47_3_1 = (EditText)findViewById(R.id.D47_3_1);
        D47_3_2 = (EditText)findViewById(R.id.D47_3_2);
        D47_4_1 = (EditText)findViewById(R.id.D47_4_2);
        D47_4_2 = (EditText)findViewById(R.id.D47_4_1);
        D47_5_1 = (EditText)findViewById(R.id.D47_5_1);
        D47_5_2 = (EditText)findViewById(R.id.D47_5_2);
        D47_6_2 = (EditText)findViewById(R.id.D47_6_2);
        D47_6_1 = (EditText)findViewById(R.id.D47_6_1);
        D47_7_1 = (EditText)findViewById(R.id.D47_7_1);
        D47_7_2 = (EditText)findViewById(R.id.D47_7_2);
        D47_8_2 = (EditText)findViewById(R.id.D47_8_2);
        D47_8_1 = (EditText)findViewById(R.id.D47_8_1);
        D47_9_1 = (EditText)findViewById(R.id.D47_9_1);
        D47_9_2 = (EditText)findViewById(R.id.D47_9_2);
        D47_10_1 = (EditText)findViewById(R.id.D47_10_1);
        D47_10_2 = (EditText)findViewById(R.id.D47_10_2);
        D47_11_2 = (EditText)findViewById(R.id.D47_11_2);
        D47_11_1 = (EditText)findViewById(R.id.D47_11_1);
        D47_12_2 = (EditText)findViewById(R.id.D47_12_2);
        D47_12_1 = (EditText)findViewById(R.id.D47_12_1);


        final Spinner spinner47 = (Spinner) findViewById(R.id.spinner47);

        String[] items = new String[]{"Not Selected","1. Yes", "2. No","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        spinner47.setAdapter(adapter);

        spinner47.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner47.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        Button b = (Button) findViewById(R.id.next8);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                share.auth = getApplicationContext().getSharedPreferences("0001", Context.MODE_PRIVATE);
                share.editor.putString("47",spinner47.getSelectedItem().toString());
                share.editor.putString("47_1_1",D47_1_1.getText().toString());
                share.editor.putString("47_1_2",D47_1_2.getText().toString());
                share.editor.putString("47_2_1",D47_2_1.getText().toString());
                share.editor.putString("47_2_2",D47_2_2.getText().toString());
                share.editor.putString("47_3_1",D47_3_1.getText().toString());
                share.editor.putString("47_3_2",D47_3_2.getText().toString());
                share.editor.putString("47_4_1",D47_4_1.getText().toString());
                share.editor.putString("47_4_2",D47_4_2.getText().toString());
                share.editor.putString("47_5_1",D47_5_1.getText().toString());
                share.editor.putString("47_5_2",D47_5_2.getText().toString());
                share.editor.putString("47_6_1",D47_6_1.getText().toString());
                share.editor.putString("47_6_2",D47_6_2.getText().toString());
                share.editor.putString("47_7_1",D47_7_1.getText().toString());
                share.editor.putString("47_7_2",D47_7_2.getText().toString());
                share.editor.putString("47_8_1",D47_8_1.getText().toString());
                share.editor.putString("47_8_2",D47_8_2.getText().toString());
                share.editor.putString("47_9_1",D47_9_1.getText().toString());
                share.editor.putString("47_9_2",D47_9_2.getText().toString());
                share.editor.putString("47_10_1",D47_10_1.getText().toString());
                share.editor.putString("47_10_2",D47_10_2.getText().toString());
                share.editor.putString("47_11_1",D47_11_1.getText().toString());
                share.editor.putString("47_11_2",D47_11_2.getText().toString());
                share.editor.putString("47_12_1",D47_12_1.getText().toString());
                share.editor.putString("47_12_2",D47_12_2.getText().toString());




                share.editor.apply();

                Intent i = new Intent(getApplicationContext(), FollowUpData.class);
                startActivity(i);
            }
        });
    }
}
