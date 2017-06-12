package com.example.catherinejohnson.catherinej2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.catherinejohnson.catherinej2017summer.R;
import com.example.catherinejohnson.catherinej2017summer.ViewPagerActivity;
import com.example.catherinejohnson.catherinej2017summer.adapter.ListNormalAdapter;

import java.util.ArrayList;


public class DemoFragment extends Fragment {

    private final ArrayList<String> contentList;
    private final Context context;
    private ListView listView;

    public DemoFragment() {
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("View Pager");
        contentList.add("View 2");
        contentList.add("View Pr");
        contentList.add("View Pagr");
        contentList.add("Pager");
        contentList.add("hhh");
        contentList.add("Launch Mode");
        contentList.add("View");
        contentList.add("View Pr");
        contentList.add("Vieger");
        contentList.add("Viewer");

    }
    

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       
        View view = inflater.inflate(R.layout.fragment_demo, container, false);

        //looking for id inside of "view" defined above
        listView = (ListView)view.findViewById(R.id.fragment_demo_lv);
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(),contentList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent = new Intent(getActivity(), ViewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        Intent intent1 = new Intent(getActivity(), ViewPagerActivity.class);
                        startActivity(intent1);
                    default:
                }
            }
        });
        return view;
    }

}
