package com.example.menulist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.menulist.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView menuList = findViewById(R.id.listView);
        String[] items = {getResources().getString(R.string.menu_item_play), getResources().getString(R.string.menu_item_score), getResources().getString(R.string.menu_item_settings), getResources().getString(R.string.menu_item_help)};
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,
                R.layout.menu_item, items);
        menuList.setAdapter(adapt);

        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View itemClicked,
                                    int position, long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_item_play))) {
// Launch the Game Activity
                    Toast.makeText(getApplicationContext(), "Clicked play", Toast.LENGTH_SHORT).show();

                } else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_item_help))) {
// Launch the Help Activity
                    Toast.makeText(getApplicationContext(), "Clicked help", Toast.LENGTH_SHORT).show();
                } else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_item_settings))) {
// Launch the Settings Activity
                    Toast.makeText(getApplicationContext(), "Clicked settings", Toast.LENGTH_SHORT).show();
                } else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_item_score))) {
// Launch the Scores Activity
                    Toast.makeText(getApplicationContext(), "Clicked score", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
