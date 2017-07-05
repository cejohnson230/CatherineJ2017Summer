package com.example.catherinejohnson.catherinej2017summer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ResultActivity extends BaseActivity {

    private final int ACTIVITY1 = 123;
    private final int ACTIVITY2 = 321;

    @OnClick(R.id.activity_result_bt1)
    public void toResult1(View v){
        Intent intent = new Intent(this, ResultActivity1.class);
        startActivityForResult(intent,ACTIVITY1);
    }
    @OnClick(R.id.activity_result_bt2)
    public void toResult2(View v){
        Intent intent = new Intent(this, ResultActivity2.class);
        startActivityForResult(intent,ACTIVITY2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        String s = data.getStringExtra("Data");
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode){
            case ACTIVITY1:
                shortToast(s+"FromResultActivity1");
                break;
            case ACTIVITY2:
                shortToast(s+"FromResultActivity2");
                break;
            default:
        }
    }
}
