package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_simpleadapter = (Button)findViewById(R.id.button);
        btn_simpleadapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SimpleAdapter.class);
                startActivity(intent);
            }
        });

        Button btn_custom_dialog = (Button)findViewById(R.id.button2);
        btn_custom_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AlertDialog.class);
                startActivity(intent);
            }
        });

        Button btn_xml_menu = (Button)findViewById(R.id.button3);
        btn_xml_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, XmlDefineMenu.class);
                startActivity(intent);
            }
        });

        Button btn_action_context = (Button)findViewById(R.id.button4);
        btn_action_context.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContextualActionBar.class);
                startActivity(intent);
            }
        });



    }
}
