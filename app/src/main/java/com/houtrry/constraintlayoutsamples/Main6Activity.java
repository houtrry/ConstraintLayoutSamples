package com.houtrry.constraintlayoutsamples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main6Activity extends AppCompatActivity {

    @BindView(R.id.btn1)
    Button mBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn2)
    public void click(View view) {
        mBtn1.setVisibility(mBtn1.getVisibility() == View.GONE?View.VISIBLE:View.GONE);
    }

}
