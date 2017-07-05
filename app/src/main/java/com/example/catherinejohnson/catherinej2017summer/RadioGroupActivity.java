package com.example.catherinejohnson.catherinej2017summer;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RadioGroupActivity extends BaseActivity {
    private int checkedID;

    @BindView(R.id.activity_radio_group)
    RadioGroup radioGroup;

    @OnClick(R.id.activity_radio_group_submit)
    public void submit(View v){
        shortToast("You chose RadioButton"+checkedID);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);
        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId){
                checkedID = checkedId;
            }
        });
    }
}
