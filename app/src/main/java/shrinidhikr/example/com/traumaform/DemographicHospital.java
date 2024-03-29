package shrinidhikr.example.com.traumaform;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DemographicHospital extends AppCompatActivity {
    public static EditText D24,D26,D27,D28,D30,D31,D32,D33;
    String id="";
    String name="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demographic_hospital);
        getSupportActionBar().setTitle("Demographic & Hospital Data");

        Intent intent = getIntent();
        id= intent.getStringExtra("Parent");
        name = intent.getStringExtra("Reg_id");

        Toast.makeText(getApplicationContext(), id+name,
                Toast.LENGTH_LONG).show();
        D24 = (EditText)findViewById(R.id.D24);
        D26 = (EditText)findViewById(R.id.D26);
        D27 = (EditText)findViewById(R.id.D27);
        D28 = (EditText)findViewById(R.id.D28);
        D30 = (EditText)findViewById(R.id.D30);
        D31 = (EditText)findViewById(R.id.D31);
        D32 = (EditText)findViewById(R.id.D32);
        D33 = (EditText)findViewById(R.id.D33);

        final Spinner spinner25 = (Spinner) findViewById(R.id.spinner25);
        final Spinner spinner29 = (Spinner) findViewById(R.id.spinner29);

        String[] items = new String[]{"Not Selected","1. Male", "2. Female","3. Transgender","-1. Not Applicable","-2. Unknown or not available","-3. Not recorded or inadequately described"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        spinner25.setAdapter(adapter);

        spinner25.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner25.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] items1 = new String[]{"Not Selected", "1: Yes","2: No"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);

        spinner29.setAdapter(adapter1);

        spinner29.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                       long arg3) {
                String anyvariable=String.valueOf(spinner29.getSelectedItem());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Button b = (Button) findViewById(R.id.next3);

        if(id.equals("P")||id=="P")
        {

            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference("Partial Database");
            DatabaseReference itemsRef = rootRef.child("R"+name);
            ValueEventListener eventListener = new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Log.e("kess", dataSnapshot.toString());
                    int i = 0, q = 25;
                    String fp[] = new String[200];
                    for (DataSnapshot ds : dataSnapshot.getChildren()) {
                        String link = ds.getValue(String.class);
                        Log.e("TAG", link);
                        fp[i++] = link;

                    }

                    D24.setText(fp[q++]);
                    spinner25.setSelection(SpinnerValue.getIndex(spinner25, fp[q++]));
                    D26.setText(fp[q++]);
                    D27.setText(fp[q++]);
                    D28.setText(fp[q++]);
                    spinner29.setSelection(SpinnerValue.getIndex(spinner29, fp[q++]));
                    D30.setText(fp[q++]);
                    D31.setText(fp[q++]);
                    D32.setText(fp[q++]);
                    D33.setText(fp[q++]);


                }
                @Override
                public void onCancelled(DatabaseError databaseError) {}
            };
            itemsRef.addListenerForSingleValueEvent(eventListener);




        }


        else if(id.equals("C")||id=="C")
        {
            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference("Complete Database");
            DatabaseReference itemsRef = rootRef.child("R"+name);
            ValueEventListener eventListener = new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Log.e("kess", dataSnapshot.toString());
                    int i = 0, q = 25;
                    String fc[] = new String[200];
                    for (DataSnapshot ds : dataSnapshot.getChildren()) {
                        String link = ds.getValue(String.class);
                        Log.e("TAG", link);
                        fc[i++] = link;

                    }

                    D24.setText(fc[q++]);
                    spinner25.setSelection(SpinnerValue.getIndex(spinner25, fc[q++]));
                    D26.setText(fc[q++]);
                    D27.setText(fc[q++]);
                    D28.setText(fc[q++]);
                    spinner29.setSelection(SpinnerValue.getIndex(spinner29, fc[q++]));
                    D30.setText(fc[q++]);
                    D31.setText(fc[q++]);
                    D32.setText(fc[q++]);
                    D33.setText(fc[q++]);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {}
            };
            itemsRef.addListenerForSingleValueEvent(eventListener);


        }



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                share.auth = getApplicationContext().getSharedPreferences("0001", Context.MODE_PRIVATE);
                share.editor = share.auth.edit();

                share.editor.putString("26",D24.getText().toString());
                share.editor.putString("27",spinner25.getSelectedItem().toString());
                share.editor.putString("28",D26.getText().toString());
                share.editor.putString("29",D27.getText().toString());
                share.editor.putString("30",D28.getText().toString());
                share.editor.putString("31",spinner29.getSelectedItem().toString());
                share.editor.putString("32",D30.getText().toString());
                share.editor.putString("33",D31.getText().toString());
                share.editor.putString("34",D32.getText().toString());
                share.editor.putString("35",D33.getText().toString());
                share.editor.apply();
                Intent i = new Intent(getApplicationContext(), FirstSetofVitals.class);
                if(id.equals("P")||(id=="P"))
                {
                    i.putExtra("Reg_id", name);
                    i.putExtra("Parent", "P");
                }
                else if(id.equals("C")||id=="C")
                {
                    i.putExtra("Reg_id", name);
                    i.putExtra("Parent", "C");
                }
                else
                {
                    i.putExtra("Parent", "Nav");
                }
                startActivity(i);
            }
        });

    }
}
