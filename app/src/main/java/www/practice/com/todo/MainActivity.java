package www.practice.com.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView varList;
    EditText varEt;
    Button varButton;

    ArrayList<String> arrList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayAdapter<String> arrListAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_expandable_list_item_1,arrList);


        varEt = (EditText)findViewById(R.id.et);
        varList = (ListView)findViewById(R.id.list);
        varButton = (Button)findViewById(R.id.button);


        varButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = varEt.getText().toString();
                arrListAdapter.notifyDataSetChanged();
                arrList.add(temp);
                varEt.setText("");
            }
        });
        varList.setAdapter(arrListAdapter);
    }
}