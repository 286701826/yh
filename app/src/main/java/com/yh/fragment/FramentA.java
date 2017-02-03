package com.yh.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.amap.api.maps.MapView;
import com.yh.telaidian.Position;
import com.yh.telaidian.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
/**
 * Created by yh on 2017-01-17.
 */
public class FramentA extends Fragment {
    @InjectView(R.id.home_search_tv)
    TextView homeSearchTv;
    @InjectView(R.id.home_collect_tv)
    TextView homeCollectTv;
    @InjectView(R.id.home_newly_tv)
    TextView homeNewlyTv;
    @InjectView(R.id.home_position_tv)
    TextView homePositionTv;
    @InjectView(R.id.home_navigation_tv)
    TextView homeNavigationTv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmenta_layout, null);
        ButterKnife.inject(this, view);
        return view;
    }

    @OnClick({R.id.home_search_tv, R.id.home_collect_tv, R.id.home_newly_tv, R.id.home_position_tv, R.id.home_navigation_tv})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_search_tv:
                break;
            case R.id.home_collect_tv:
                break;
            case R.id.home_newly_tv:
                break;
            case R.id.home_position_tv:
                Intent intent = new Intent(getContext(),Position.class);
                startActivity(intent);
                break;
            case R.id.home_navigation_tv:
                break;
        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
