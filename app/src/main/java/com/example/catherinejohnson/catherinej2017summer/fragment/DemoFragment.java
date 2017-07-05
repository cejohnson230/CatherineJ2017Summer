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

import com.example.catherinejohnson.catherinej2017summer.ActivityA;
import com.example.catherinejohnson.catherinej2017summer.AdvancedListViewActivity;
import com.example.catherinejohnson.catherinej2017summer.AdvancedViewPagerActivity;
import com.example.catherinejohnson.catherinej2017summer.AnimationActivity;
import com.example.catherinejohnson.catherinej2017summer.AnimatorActivity;
import com.example.catherinejohnson.catherinej2017summer.CheckBoxActivity;
import com.example.catherinejohnson.catherinej2017summer.DialogActivity;
import com.example.catherinejohnson.catherinej2017summer.GestureActivity;
import com.example.catherinejohnson.catherinej2017summer.HandlerActivity;
import com.example.catherinejohnson.catherinej2017summer.NinePatch;
import com.example.catherinejohnson.catherinej2017summer.NotificationActivity;
import com.example.catherinejohnson.catherinej2017summer.R;
import com.example.catherinejohnson.catherinej2017summer.RadioGroupActivity;
import com.example.catherinejohnson.catherinej2017summer.ResultActivity;
import com.example.catherinejohnson.catherinej2017summer.RunableHandlerActivity;
import com.example.catherinejohnson.catherinej2017summer.ScaleTypeActivity;
import com.example.catherinejohnson.catherinej2017summer.SharedPreferenceActivity;
import com.example.catherinejohnson.catherinej2017summer.ViewPagerActivity;
import com.example.catherinejohnson.catherinej2017summer.adapter.ListNormalAdapter;
import com.example.catherinejohnson.catherinej2017summer.audio.BaseBean;

import java.util.ArrayList;


public class DemoFragment extends Fragment {

    private final ArrayList<String> contentList;
    private final Context context;
    private ListView listView;

    public DemoFragment() {
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("9Patch");
        contentList.add("Notification");
        contentList.add("AdvanceListView");
        contentList.add("AdvanceViewPagerActivity");
        contentList.add("LaunchMode");
        contentList.add("ActivityResult");
        contentList.add("RadioGroup");
        contentList.add("CheckBox");
        contentList.add("Dialog");
        contentList.add("Handler");
        contentList.add("RunnableHandler");
        contentList.add("Animation");
        contentList.add("Animator");
        contentList.add("Gesture");
        contentList.add("Shared Preference");
        contentList.add("Service & Broadcast");

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
        listView = (ListView) view.findViewById(R.id.fragment_demo_lv);
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(), contentList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), ViewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), NinePatch.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), NotificationActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), AdvancedListViewActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), AdvancedViewPagerActivity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), ActivityA.class);
                        intent6.putExtra("StringInfo", "fromDemoFragment");
                        intent6.putExtra("IntegerInfo", 10);
                        Bundle bundle = new Bundle();
                        BaseBean bean = new BaseBean();
                        bean.setName("bean");
                        bundle.putString("StringBundle", "FromBundleDemo");
                        bundle.putInt("IntegerBUndle", 101);
                        bundle.putSerializable("Object", bean);
                        intent6.putExtra("Bundle", bundle);
//                        bundle.putString("StringBundle","FromBundleDemo");
//                        bundle.putInt("IntegerBundle",101);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), ResultActivity.class);
                        startActivityForResult(intent7, 400);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), RadioGroupActivity.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), CheckBoxActivity.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getActivity(), DialogActivity.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getActivity(), HandlerActivity.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getActivity(), RunableHandlerActivity.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getActivity(), AnimationActivity.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(getActivity(), AnimatorActivity.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(getActivity(), GestureActivity.class);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(getActivity(), SharedPreferenceActivity.class);
                        startActivity(intent16);
                        break;
//                    case 17:
//                        Intent intent17 = new Intent(getActivity(), ServiceActivity.class);
//                        startActivity(intent17);
//                        break;
                    default:

                }
            }
        });
        return view;
    }
}


