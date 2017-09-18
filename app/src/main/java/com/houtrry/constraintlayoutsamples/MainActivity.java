package com.houtrry.constraintlayoutsamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1: {
                toAty(Main2Activity.class);
                break;
            }
            case R.id.btn2: {
                toAty(Main3Activity.class);
                break;
            }
            case R.id.btn3: {
                toAty(Main4Activity.class);
                break;
            }
            case R.id.btn4: {
                toAty(Main5Activity.class);
                break;
            }
            case R.id.btn5: {
                toAty(Main6Activity.class);
                break;
            }
        }
    }

    private void toAty(Class clazz) {
        Intent intent = new Intent(MainActivity.this, clazz);
        MainActivity.this.startActivity(intent);
    }
}
