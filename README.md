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