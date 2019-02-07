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

public class CTScan extends AppCompatActivity {
    public static EditText D45_5_2,D45_5_3,D45_6_3,D45_6_2,D45_4_2,D45_4_3,D45_7_3,D45_7_2,D45_8_2,D45_8_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctscan);
        getSupportActionBar().setTitle("CT Scan");


        D45_4_2 = (EditText)findViewById(R.id.D45_4_2);
        D45_4_3 = (EditText)findViewById(R.id.D45_4_3);
        D45_5_2 = (EditText)findViewById(R.id.D45_5_2);
        D45_5_3 = (EditText)findViewById(R.id.D45_5_3);
        D45_6_2 = (EditText)findViewById(R.id.D45_6_2);
        D45_6_3 = (EditText)findViewById(R.id.D45_6_3);
        D45_7_2 = (EditText)findViewById(R.id.D45_7_2);
        D45_7_3 = (EditText)findViewById(R.id.D45_7_3);
        D45_8_2 = (EditText)findViewById(R.id.D45_8_2);
        D45_8_3 = (EditText)findViewById(R.id.D45_8_3);



        final Spinner spinner45_4_1 = (Spinner) findViewById(R.id.spinner45_4_1);
        final Spinner spinner45_5_1 = (Spinner) findViewById(R.id.spinner45_5_1);
        final Spinner spinner45_6_1 = (Spinner) findViewById(R.id.spinner45_6_1);
        final Spinner spinner45_7_1 = (Spinner) findViewById(R.id.spinner45_7_1);
        final Spinner spinner45_8_1 = (Spinner) findViewById(R.id.spinner45_8_1);

        String[] items = new String[]{"Not Selected","1. Done", "2. Not Done","3. Done But Not Recorded","4. Not Availabel","5. Not Required","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        spinner45_5_1.setAdapter(adapter);

        spinner45_5_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner45_5_1.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items1 = new String[]{"Not Selected","1. Done", "2. Not Done","3. Done But Not Recorded","4. Not Availabel","5. Not Required","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);

        spinner45_4_1.setAdapter(adapter1);

        spinner45_4_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner45_4_1.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items2 = new String[]{"Not Selected","1. Done", "2. Not Done","3. Done But Not Recorded","4. Not Availabel","5. Not Required","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);

        spinner45_6_1.setAdapter(adapter2);

        spinner45_6_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner45_6_1.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items3 = new String[]{"Not Selected","1. Done", "2. Not Done","3. Done But Not Recorded","4. Not Availabel","5. Not Required","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);

        spinner45_7_1.setAdapter(adapter3);

        spinner45_7_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner45_7_1.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items4 = new String[]{"Not Selected","1. Done", "2. Not Done","3. Done But Not Recorded","4. Not Availabel","5. Not Required","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);

        spinner45_8_1.setAdapter(adapter4);

        spinner45_8_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner45_8_1.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Button b = (Button) findViewById(R.id.next6);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                share.auth = getApplicationContext().getSharedPreferences("0001", Context.MODE_PRIVATE);
                share.editor.putString("45_4_1",spinner45_4_1.getSelectedItem().toString());
                share.editor.putString("45_4_2",D45_4_2.getText().toString());
                share.editor.putString("45_4_3",D45_4_3.getText().toString());
                share.editor.putString("45_5_1",spinner45_5_1.getSelectedItem().toString());
                share.editor.putString("45_5_2",D45_5_2.getText().toString());
                share.editor.putString("45_5_3",D45_5_3.getText().toString());
                share.editor.putString("45_6_1",spinner45_6_1.getSelectedItem().toString());
                share.editor.putString("45_6_2",D45_6_2.getText().toString());
                share.editor.putString("45_6_3",D45_6_3.getText().toString());
                share.editor.putString("45_7_1",spinner45_7_1.getSelectedItem().toString());
                share.editor.putString("45_7_2",D45_7_2.getText().toString());
                share.editor.putString("45_7_3",D45_7_3.getText().toString());
                share.editor.putString("45_8_1",spinner45_8_1.getSelectedItem().toString());
                share.editor.putString("45_8_2",D45_8_2.getText().toString());
                share.editor.putString("45_8_3",D45_8_3.getText().toString());

                share.editor.apply();

                Intent i = new Intent(getApplicationContext(), CriticalEDProcedure.class);
                startActivity(i);
            }
        });
    }
}
