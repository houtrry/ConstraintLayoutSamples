# ConstraintLayoutSamples
ConstraintLayout的简单使用.  
可以查看[Google的官方网站](https://developer.android.com/reference/android/support/constraint/ConstraintLayout.html)以及[学习网站](https://developer.android.com/training/constraint-layout/index.html)学习相关知识.

### 相对位置  
* layout_constraintLeft_toLeftOf
* layout_constraintLeft_toRightOf
* layout_constraintRight_toLeftOf
* layout_constraintRight_toRightOf
* layout_constraintTop_toTopOf
* layout_constraintTop_toBottomOf
* layout_constraintBottom_toTopOf
* layout_constraintBottom_toBottomOf
* layout_constraintBaseline_toBaselineOf
* layout_constraintStart_toEndOf
* layout_constraintStart_toStartOf
* layout_constraintEnd_toStartOf
* layout_constraintEnd_toEndOf  
egg:  
app:layout_constraintLeft_toLeftOf="parent" 当前控件的左侧和父控件的左侧对齐.  
app:layout_constraintRight_toLeftOf="@+id/btn2" 当前控件的右侧和id为btn2的控件的左侧对齐.  
app:layout_constraintTop_toBottomOf="@id/btn1" 当前控件的顶部和id为btn1的控件的底部对齐.  
其他的也都是同样的套路.  
可以相对于父控件(parent, 也就是ConstraintLayout), 也可以相对于ConstraintLayout中的其他控件.  
具体使用可以参见Main2Activity.  

### 带gone的layout_goneMarginStart等
* layout_goneMarginStart
* layout_goneMarginEnd
* layout_goneMarginLeft
* layout_goneMarginTop
* layout_goneMarginRight
* layout_goneMarginBottom  
可以参见代码activity_main6  
```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.houtrry.constraintlayoutsamples.Main6Activity">

    <Button
        android:id="@+id/btn1"
        android:layout_width="200dp"
        android:layout_height="60dp"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toLeftOf="@+id/btn2"
        android:textAllCaps="false"
        android:text="btn1"
        android:textSize="16sp"
        android:textColor="@color/colorAccent"/>

    <Button
        android:id="@+id/btn2"
        android:layout_width="100dp"
        android:layout_height="60dp"
        app:layout_constraintLeft_toRightOf="@id/btn1"
        app:layout_constraintRight_toRightOf="parent"
        android:textAllCaps="false"
        android:text="btn2"
        android:textSize="16sp"
        app:layout_goneMarginLeft="200dp"
        android:textColor="@color/colorAccent"/>

</android.support.constraint.ConstraintLayout>

```
对于btn2, 它的左侧通过layout_constraintLeft_toRightOf制定为btn1, 那如果btn1消失了该如何显示呢? 这个时候layout_goneMarginLeft就生效了, 此时相当于指定marginLeft为200. 那如果btn1正常显示呢? layout_goneMarginLeft并没有任何效果.  
