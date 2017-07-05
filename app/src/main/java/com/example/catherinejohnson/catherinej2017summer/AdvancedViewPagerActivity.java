package com.example.catherinejohnson.catherinej2017summer;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.catherinejohnson.catherinej2017summer.adapter.ViewFragmentStateAdapter;
import com.example.catherinejohnson.catherinej2017summer.fragment.BlueFragment;
import com.example.catherinejohnson.catherinej2017summer.fragment.GreenFragment;
import com.example.catherinejohnson.catherinej2017summer.fragment.RedFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvancedViewPagerActivity extends AppCompatActivity {
    private ArrayList<Pair<String,Fragment>> list = new ArrayList<Pair<String,Fragment>>();

    @BindView(R.id.advance_view_pager_tablayout)
    TabLayout tabLayout;

    @BindView(R.id.activity_advance_view_pager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_view_pager);
        ButterKnife.bind(this);
        list.add(new Pair<String, Fragment>("Red",new RedFragment()));
        list.add(new Pair<String, Fragment>("Red",new BlueFragment()));
        list.add(new Pair<String, Fragment>("Red",new GreenFragment()));
        ViewFragmentStateAdapter adapter =
                new ViewFragmentStateAdapter(this.getSupportFragmentManager(),list);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
