package com.houtrry.constraintlayoutsamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * android.support.constraint.Guideline的使用.
 * 有三个属性.
 *     app:layout_constraintGuide_end="100dp"
 *     app:layout_constraintGuide_begin="404dp"
 *     app:layout_constraintGuide_percent="0.8"
 *  注意: 三者生效的优先级是layout_constraintGuide_percent > layout_constraintGuide_begin > layout_constraintGuide_end.
 *  也就是, 当layout_constraintGuide_percent存在时, layout_constraintGuide_begin和layout_constraintGuide_end都不会生效
 *  当layout_constraintGuide_begin存在时, layout_constraintGuide_end不会生效
 */
public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
}
