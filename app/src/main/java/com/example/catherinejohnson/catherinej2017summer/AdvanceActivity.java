package com.example.catherinejohnson.catherinej2017summer;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.catherinejohnson.catherinej2017summer.adapter.AdvanceListViewAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceActivity extends BaseActivity {

    @BindView(R.id.activity_advance_list_view) ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        ButterKnife.bind(this);
        ArrayList<String> list = new ArrayList<>();
        list.add("hello what is up");
        list.add("hi");
        list.add("hey wanna chill");
        list.add("what?");
        list.add("i SAID u wanna chill");
        list.add("oh");
        list.add("oh what? so what u trying to do");
        list.add("nothin");
        list.add("nothinnnn???");
        list.add("ya nothin");
        list.add("ok");
        list.add("K");
        list.add("Dang ok");
        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this, list);
        lv.setAdapter(adapter);

        TextView tv = new TextView(this);
        tv.setText("HeaderView");
        tv.setTextSize(50);
        lv.addHeaderView(tv);

        TextView tv1 = new TextView(this);
        tv1.setText("FooterView");
        tv1.setTextSize(50);
        lv.addFooterView(tv1);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showToast(String.valueOf(position));
            }
        });
    }
}
