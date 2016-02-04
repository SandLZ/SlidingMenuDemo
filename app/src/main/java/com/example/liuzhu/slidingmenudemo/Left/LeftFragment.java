package com.example.liuzhu.slidingmenudemo.Left;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.liuzhu.slidingmenudemo.R;

public class LeftFragment extends Fragment {

    private View view;
    private ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_left, null);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        mListView = (ListView) view.findViewById(R.id.index_left_listview);
        IndexLeftMenuAdapter adapter = new IndexLeftMenuAdapter(this.getActivity());
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0: {
                        //我的资料

                        break;
                    }
                    case 1: {
                        //天气预览

                        break;
                    }
                    case 2: {
                        //系统设置

                        break;
                    }
                    case 3: {
                        //关于我们

                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
        });
    }

    //选择回调的接口
    public interface LeftMenuItemSelectedListener {
        void leftMenuClick();
    }

    private LeftMenuItemSelectedListener mLeftMenuItemSelectedListener;

    public void setLeftMenuItemSelectedListener(LeftMenuItemSelectedListener leftMenuItemSelectedListener) {
        this.mLeftMenuItemSelectedListener = leftMenuItemSelectedListener;
    }
}