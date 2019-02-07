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

public class InjuryEventData extends AppCompatActivity {

    public static EditText D12,D13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injury_event_data);
        getSupportActionBar().setTitle("Injury Event Data");

        D12 = (EditText)findViewById(R.id.D12);
        D13 = (EditText)findViewById(R.id.D13);
        final Spinner spinner14 = (Spinner) findViewById(R.id.spinner14);
        final Spinner spinner15 = (Spinner) findViewById(R.id.spinner15);
        final Spinner spinner16 = (Spinner) findViewById(R.id.spinner16);
        final Spinner spinner17 = (Spinner) findViewById(R.id.spinner17);
        final Spinner spinner18 = (Spinner) findViewById(R.id.spinner18);
        final Spinner spinner19 = (Spinner) findViewById(R.id.spinner19);
        final Spinner spinner20_1 = (Spinner) findViewById(R.id.spinner20_1);
        final Spinner spinner20_2 = (Spinner) findViewById(R.id.spinner20_2);
        final Spinner spinner20_3 = (Spinner) findViewById(R.id.spinner20_3);
        final Spinner spinner21 = (Spinner) findViewById(R.id.spinner21);
        final Spinner spinner22 = (Spinner) findViewById(R.id.spinner22);
        final Spinner spinner23 = (Spinner) findViewById(R.id.spinner23);



        String[] items = new String[]{"11 [URBAN] Urban Arterial (high Capacity Urban Road)", "12 [URBAN] Street","13  [URBAN] Others","14  [URBAN] Unknown","15 [URBAN] Not Recorded","21 [RURAL] State Highway","22 [RURAL] National highway","23 [RURAL] Others","24 [RURAL] Unknown","25 [RURAL] Not Recorded","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        spinner14.setAdapter(adapter);

        spinner14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner14.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items1 = new String[]{"Not Selected", "1. Blunt","2. Penetrating","3. Mixed","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);

        spinner15.setAdapter(adapter1);

        spinner15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner15.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items2 = new String[]{"Not Selected", "1.Pedal Cycle","2.Motorised2Wheeler","3.Motorised3Wheeler","4.Car","5.Pick-Up Truck/Van","6.HTV","7.Bus","8.Spl.IndustrialVehicle","9.Spl.ConstructionVehicle","10.Animal/A. Drawn Vehicle","11.Unknown","12.Others","13.Not Recorded","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);

        spinner16.setAdapter(adapter2);

        spinner16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner16.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items3 = new String[]{"1.Driver(of any vehicle)","2.Front Seat Passenger","3.Rear Seat Passenger","4.Other Passenger(bus/pick-up","5.Pedestrain","6.Pillion Rider","7.Other","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);

        spinner17.setAdapter(adapter3);

        spinner17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner17.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        String[] items4 = new String[]{"1.Hit Pedestrain","2.Head on Collision","3.Hit from back","4.Skid","5.Hit from side","6.Nose to tail collision","7.Hit and Run","8.Hit fixed object","9.Hit animal","10.Over turn","11.Fall from moving vehicle","12.Trapped between 2 vehicle","13.Others(specify)","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);

        spinner18.setAdapter(adapter4);

        spinner18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner18.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        String[] items5 = new String[]{"Not Selected", "1: Yes","2: No","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items5);

        spinner19.setAdapter(adapter5);

        spinner19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner19.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        String[] items6 = new String[]{"1.Alcohol","2.Texting","3.Music","4.Over Speeding","5.Talking on Phone","6.Others(Free Text)","7.Sleeping","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items6);

        spinner20_1.setAdapter(adapter6);

        spinner20_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner20_1.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        String[] items7 = new String[]{"1.Alcohol","2.Texting","3.Music","4.Over Speeding","5.Talking on Phone","6.Others(Free Text)","7.Sleeping","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter7 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items7);

        spinner20_2.setAdapter(adapter7);

        spinner20_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner20_2.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        String[] items8 = new String[]{"1.Alcohol","2.Texting","3.Music","4.Over Speeding","5.Talking on Phone","6.Others(Free Text)","7.Sleeping","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter8 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items8);

        spinner20_3.setAdapter(adapter8);

        spinner20_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner20_3.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        String[] items9 = new String[]{"1.Walking","2.Pedal Cycle","3.Motorised 2 Wheeler","4.Motorised 3 Wheeler","5.Taxi (Rented 4 Wheeler)","6.Private","7.NAS Ambulances/108/NHM Ambulance","8.Highway Petrol Ambulance","9.Other Govt Ambulance","10.Private Ambulance","11.Police vehicle","12.Other","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter9 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items9);

        spinner21.setAdapter(adapter9);

        spinner21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner21.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        String[] items10 = new String[]{"1.Pre-hospital Care Providers(Ambulance)","2.Private Clinic/Hospital"};

        ArrayAdapter<String> adapter10 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items10);

        spinner22.setAdapter(adapter10);

        spinner22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner22.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        String[] items11 = new String[]{"Not Selected", "1: Yes","2: No"};

        ArrayAdapter<String> adapter11 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items11);

        spinner23.setAdapter(adapter11);

        spinner23.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner23.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Button b = (Button) findViewById(R.id.next2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                share.auth = getApplicationContext().getSharedPreferences("0001", Context.MODE_PRIVATE);
                share.editor = share.auth.edit();

                share.editor.putString("12",D12.getText().toString());
                share.editor.putString("13",D13.getText().toString());
                share.editor.putString("14",spinner14.getSelectedItem().toString());
                share.editor.putString("15",spinner15.getSelectedItem().toString());
                share.editor.putString("16",spinner16.getSelectedItem().toString());
                share.editor.putString("17",spinner17.getSelectedItem().toString());
                share.editor.putString("18",spinner18.getSelectedItem().toString());
                share.editor.putString("19",spinner19.getSelectedItem().toString());
                share.editor.putString("20_1",spinner20_1.getSelectedItem().toString());
                share.editor.putString("20_2",spinner20_2.getSelectedItem().toString());
                share.editor.putString("20_3",spinner20_3.getSelectedItem().toString());
                share.editor.putString("21",spinner21.getSelectedItem().toString());
                share.editor.putString("22",spinner22.getSelectedItem().toString());
                share.editor.putString("23",spinner23.getSelectedItem().toString());
                share.editor.apply();

                Intent i = new Intent(getApplicationContext(), DemographicHospital.class);
                startActivity(i);
            }
        });

    }
}
