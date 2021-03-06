# ConstraintLayoutSamples
ConstraintLayout的简单使用.  
### 参考网站
* [Google的官方网站](https://developer.android.com/reference/android/support/constraint/ConstraintLayout.html)  
* [Google的学习网站](https://developer.android.com/training/constraint-layout/index.html)
* [解析ConstraintLayout的性能优势](https://mp.weixin.qq.com/s?__biz=MzAwODY4OTk2Mg==&mid=2652044589&idx=1&sn=36f09ada2b279b0c56fcd91085ebe93a&chksm=808d5d68b7fad47e4de2704b24e51fd57799d19f1f7b334aaa9bfa2671c34ca8cc6bcd493882&scene=21#wechat_redirect)
* [Android新特性介绍，ConstraintLayout完全解析](http://blog.csdn.net/guolin_blog/article/details/53122387)
* [拒绝拖拽 使用ConstraintLayout优化你的布局吧](https://mp.weixin.qq.com/s/vI-fPaNoJ7ZBlZcMkEGdLQ)

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

### layout_goneMarginStart等
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

### bias
* layout_constraintHorizontal_bias
* layout_constraintVertical_bias  

```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.houtrry.constraintlayoutsamples.Main4Activity">

    <ImageView
        android:layout_width="58dp"
        android:layout_height="58dp"
        android:background="@color/colorAccent"
        android:src="@mipmap/ic_launcher_round"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.9"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.9"/>

</android.support.constraint.ConstraintLayout>

```  
app:layout_constraintHorizontal_bias="0.9": 水平方向上, 假设控件左侧到parent左侧的间距和控件右侧到parent的右侧的总间距为1的话, 控件左侧到parent的左侧的间距占比为0.9, 那么, 控件右侧到parent的右侧的间距的占比为0.1.  
用官网的图片说明  
![](https://developer.android.com/reference/android/support/constraint/resources/images/centering-positioning-bias.png)  
控件A到左侧占控件左右间距之和的比值就是app:layout_constraintHorizontal_bias="0.9".  
### Widgets  
* layout_constraintHorizontal_weight
* layout_constraintVertical_weight  

类似于LinearLayout中的widget属性.  
参见R.layout.activity_main2  
```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.houtrry.constraintlayoutsamples.MainActivity">

    ...

    <Button
        android:id="@+id/bt4"
        android:layout_width="0dp"
        android:layout_height="45dp"
        android:background="@android:color/holo_blue_light"
        android:text="bt4"
        android:textAllCaps="false"
        android:textColor="@android:color/white"
        android:textSize="15sp"
        app:layout_constraintBottom_toTopOf="@id/bt1"
        app:layout_constraintHorizontal_weight="2"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toLeftOf="@+id/bt5"/>

    <Button
        android:id="@+id/bt5"
        android:layout_width="0dp"
        android:layout_height="45dp"
        android:background="@android:color/holo_red_light"
        android:text="bt5"
        android:textAllCaps="false"
        android:textColor="@android:color/white"
        android:textSize="15sp"
        app:layout_constraintBottom_toTopOf="@id/bt1"
        app:layout_constraintHorizontal_weight="1"
        app:layout_constraintLeft_toRightOf="@id/bt4"
        app:layout_constraintRight_toLeftOf="@+id/bt6"/>

    <Button
        android:id="@+id/bt6"
        android:layout_width="0dp"
        android:layout_height="45dp"
        android:background="@android:color/holo_orange_light"
        android:text="bt6"
        android:textAllCaps="false"
        android:textColor="@android:color/white"
        android:textSize="15sp"
        app:layout_constraintBottom_toTopOf="@id/bt1"
        app:layout_constraintHorizontal_weight="1"
        app:layout_constraintLeft_toRightOf="@id/bt5"
        app:layout_constraintRight_toRightOf="parent"/>


</android.support.constraint.ConstraintLayout>

```

### Ratio
 * app:layout_constraintDimensionRatio="16:9"  宽:高 = 16:9
 * app:layout_constraintDimensionRatio="W,16:9"  宽:高 = 16:9, 并且约束宽(宽度不变, 修改高度)
 * app:layout_constraintDimensionRatio="H,16:9"  宽:高 = 16:9, 并且约束高(高度不变, 修改宽度)

### Chains  
参见R.layout.activity_main3  

### Guideline
 有三个属性.
   * android:orientation="horizontal"  
   * app:layout_constraintGuide_end="100dp"
   * app:layout_constraintGuide_begin="404dp"
   * app:layout_constraintGuide_percent="0.8"

1. android:orientation="horizontal"  线条方向
2. app:layout_constraintGuide_end="100dp"  线条距离parent的右侧(orientation="horizontal"时)或者底部(orientation="vertical"时)的距离
3. app:layout_constraintGuide_begin="404dp"  线条距离parent的左侧(orientation="horizontal"时)或者顶部(orientation="vertical"时)的距离
4. app:layout_constraintGuide_percent="0.8"  线条距离parent的左侧的距离占parent的宽度的比例(orientation="horizontal"时)或者线条距离parent的顶部的距离占parent的高度的比例(orientation="vertical"时).  

注意: 三者生效的优先级是  
layout_constraintGuide_percent > layout_constraintGuide_begin > layout_constraintGuide_end.  
也就是, 当layout_constraintGuide_percent存在时, layout_constraintGuide_begin和layout_constraintGuide_end都不会生效.
当layout_constraintGuide_begin存在时, layout_constraintGuide_end不会生效