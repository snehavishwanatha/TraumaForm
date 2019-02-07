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

public class FollowUpData extends AppCompatActivity {

    public static EditText D48_1,D48_2,D50,D51,D52,D53_1,D54,D55;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_up_data);
        getSupportActionBar().setTitle("Follow Up Data");

        D48_1 = (EditText)findViewById(R.id.D48_1);
        D48_2 = (EditText)findViewById(R.id.D48_2);
        D50 = (EditText)findViewById(R.id.D50);
        D51 = (EditText)findViewById(R.id.D51);
        D52 = (EditText)findViewById(R.id.D52);
        D53_1 = (EditText)findViewById(R.id.D53_1);
        D54 = (EditText)findViewById(R.id.D54);
        D55 = (EditText)findViewById(R.id.D55);

        final Spinner spinner48 = (Spinner) findViewById(R.id.spinner48);
        final Spinner spinner49_1 = (Spinner) findViewById(R.id.spinner49_1);
        final Spinner spinner49_2 = (Spinner) findViewById(R.id.spinner49_2);
        final Spinner spinner49_3 = (Spinner) findViewById(R.id.spinner49_3);
        final Spinner spinner53 = (Spinner) findViewById(R.id.spinner53);

        String[] items = new String[]{"Not Selected","1. Yes", "2. No","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        spinner48.setAdapter(adapter);

        spinner48.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner48.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items1 = new String[]{"Not Selected","1. Wound Infection", "2. Septic Shock","3. Cradiac Arrest" ,"4. Renal Failure","5. Pneumonia","6. Ulcer/Pressure Sores","7. Other","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);

        spinner49_1.setAdapter(adapter1);

        spinner49_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner49_1.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items2 = new String[]{"Not Selected","1. Wound Infection", "2. Septic Shock","3. Cradiac Arrest" ,"4. Renal Failure","5. Pneumonia","6. Ulcer/Pressure Sores","7. Other","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);

        spinner49_2.setAdapter(adapter2);

        spinner49_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner49_2.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items3 = new String[]{"Not Selected","1. Wound Infection", "2. Septic Shock","3. Cradiac Arrest" ,"4. Renal Failure","5. Pneumonia","6. Ulcer/Pressure Sores","7. Other","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);

        spinner49_3.setAdapter(adapter2);

        spinner49_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner49_3.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items4 = new String[]{"Not Selected","1. Home", "2. Rehabilitation Hospital","3. Transfer to other hospital for acute care" ,"4. Residential aged care services or nursing home that is not the usual place of residence","5.  Death","6. Absconded","7. Discharged Against Medical Advice - DAMA ","8. LAMA","9. Other","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);

        spinner53.setAdapter(adapter4);

        spinner53.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner53.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Button b = (Button) findViewById(R.id.next9);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                share.auth = getApplicationContext().getSharedPreferences("0001", Context.MODE_PRIVATE);
                share.editor = share.auth.edit();

                share.editor.putString("48",spinner48.getSelectedItem().toString());
                share.editor.putString("48_1",D48_1.getText().toString());
                share.editor.putString("48_2",D48_2.getText().toString());
                share.editor.putString("49_1",spinner49_1.getSelectedItem().toString());
                share.editor.putString("49_2",spinner49_2.getSelectedItem().toString());
                share.editor.putString("49_3",spinner49_3.getSelectedItem().toString());
                share.editor.putString("50",D50.getText().toString());
                share.editor.putString("51",D51.getText().toString());
                share.editor.putString("52",D52.getText().toString());
                share.editor.putString("53",spinner53.getSelectedItem().toString());
                share.editor.putString("53_1",D53_1.getText().toString());
              
                share.editor.putString("54",D54.getText().toString());
                share.editor.putString("55",D55.getText().toString());
                                share.editor.apply();
                Intent i = new Intent(getApplicationContext(),InjuryCodingData.class);
                startActivity(i);
            }
        });
    }
}
