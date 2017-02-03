package com.yh.telaidian;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import com.yh.fragment.FramentA;
import com.yh.fragment.FramentB;
import com.yh.fragment.FramentC;
import com.yh.fragment.FramentD;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.Home_Relative)
    RelativeLayout HomeRelative;
    @InjectView(R.id.Home_btn1)
    RadioButton HomeBtn1;
    @InjectView(R.id.Home_btn2)
    RadioButton HomeBtn2;
    @InjectView(R.id.Home_btn3)
    RadioButton HomeBtn3;
    @InjectView(R.id.Home_btn4)
    RadioButton HomeBtn4;
    @InjectView(R.id.Home_btn5)
    RadioButton HomeBtn5;
    @InjectView(R.id.activity_main)
    RelativeLayout activityMain;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        manager = getSupportFragmentManager();
        FragmentTransaction transaction1 = manager.beginTransaction();
        transaction1.replace(R.id.Home_Relative,new FramentA());
        initBtn();
    }



    @OnClick({R.id.Home_btn1, R.id.Home_btn2, R.id.Home_btn3, R.id.Home_btn4, R.id.Home_btn5})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Home_btn1:
                FragmentTransaction transaction1 = manager.beginTransaction();
                transaction1.replace(R.id.Home_Relative,new FramentA());
                initBtn();
                break;
            case R.id.Home_btn2:
                FragmentTransaction transaction2 = manager.beginTransaction();
                transaction2.replace(R.id.Home_Relative,new FramentB());
                initBtn();
                break;
            case R.id.Home_btn3:

                break;
            case R.id.Home_btn4:
                FragmentTransaction transaction3 = manager.beginTransaction();
                transaction3.replace(R.id.Home_Relative,new FramentD());
                initBtn();
                break;
            case R.id.Home_btn5:
                FragmentTransaction transaction4 = manager.beginTransaction();
                transaction4.replace(R.id.Home_Relative,new FramentD());
                initBtn();
                break;
        }
    }
    private void initBtn() {
        RadioButton[] RBbtn={HomeBtn1,HomeBtn2,HomeBtn4,HomeBtn5};
        for (int i = 0; i < RBbtn.length; i++) {
            if(RBbtn[i].isChecked()==true){
                RBbtn[i].setTextColor(Color.parseColor("#FF02A7CA"));
            }else{
                RBbtn[i].setTextColor(Color.parseColor("#999999"));
            }
        }
    }

}

