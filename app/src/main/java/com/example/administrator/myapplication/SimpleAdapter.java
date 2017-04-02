package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017-03-28.
 */
public class SimpleAdapter extends Activity {
    private ListView lt1;
    String[] animalName={"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    int[] animalImages={R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleadapter);
        List<Map<String, Object>> listems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < animalName.length; i++) {
            Map<String, Object> listem = new HashMap<String, Object>();
            listem.put("name", animalName[i]);
            listem.put("picture", animalImages[i]+"");
            listems.add(listem);
        }

        android.widget.SimpleAdapter simplead = new android.widget.SimpleAdapter(this, listems,
                R.layout.list_items,new String[] {"name","picture"},
                new int[] {R.id.textView,R.id.imageView});

        lt1=(ListView)findViewById(R.id.simpleListView);
        lt1.setAdapter(simplead);
        lt1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),animalName[i],Toast.LENGTH_LONG).show();
            }
        });
    }



}
