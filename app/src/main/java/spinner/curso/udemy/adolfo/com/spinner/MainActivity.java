package spinner.curso.udemy.adolfo.com.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText etDatos;
    private Spinner mSpinner;
    private ArrayList<String> mList;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etDatos = (EditText) findViewById(R.id.etDatos);
        mSpinner = (Spinner) findViewById(R.id.spinner);
        mList = new ArrayList<>();
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,mList);
        mSpinner.setAdapter(mAdapter);
    }

    public void ingresarDatos(View view) {
        String nuevoDato = etDatos.getText().toString();
        mList.add(nuevoDato);
        mAdapter.notifyDataSetChanged();
        etDatos.setText(null);
    }
}
