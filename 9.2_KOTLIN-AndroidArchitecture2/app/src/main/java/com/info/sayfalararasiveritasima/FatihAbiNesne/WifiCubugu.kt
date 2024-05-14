package com.info.sayfalararasiveritasima.FatihAbiNesne

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.info.sayfalararasiveritasima.R

class WifiCubugu : View {

    private var totalLine: Int = 5
    private var enabledLine: Int = 0
    private var primaryColor: Int = context.getColor(R.color.black)
    private var levelColor: Int = context.getColor(R.color.design_default_color_primary_dark)
    private var spacing: Int = 1
    private var unitWidth: Int = 20
    private var mPaint: Paint? = null
    private var mRectHeight: Int = 0
    private var mRectWidth: Int = 0

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attr: AttributeSet) : super(context, attr) {
        init()
    }

    constructor(context: Context, attr: AttributeSet, defStyleAttr: Int) : super(
        context,
        attr,
        defStyleAttr
    ) {
        init()
    }

    private fun init() {
        mPaint = Paint().apply {
            isAntiAlias = true
        }
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        initSize()
    }

    private fun initSize() {
        mRectHeight = height
        mRectWidth = width / totalLine
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(measureWidth(widthMeasureSpec), measureHeight(heightMeasureSpec))
    }

    private fun measureHeight(heightMeasureSpec: Int): Int {
        var height: Int
        val specMode = MeasureSpec.getMode(heightMeasureSpec)
        val specSize = MeasureSpec.getSize(heightMeasureSpec)

        if (specMode == MeasureSpec.EXACTLY) {
            height = specSize
        } else {
            height = 50
            if (specMode == MeasureSpec.AT_MOST) {
                height = height.coerceAtMost(specSize)
            }
        }
        mRectHeight = height
        return height
    }

    private fun measureWidth(widthMeasureSpec: Int): Int {
        var width: Int
        val specMode = MeasureSpec.getMode(widthMeasureSpec)
        val specSize = MeasureSpec.getSize(widthMeasureSpec)
        if (specMode == MeasureSpec.EXACTLY) {
            width = specSize
        } else {
            width = 80
            if (specMode == MeasureSpec.AT_MOST) {
                width = width.coerceAtMost(specSize)
            }
        }
        return width
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        mPaint?.apply {
            strokeWidth = unitWidth.toFloat()
            strokeCap = Paint.Cap.SQUARE
            strokeJoin = Paint.Join.ROUND
            style = Paint.Style.STROKE
            for (i in 0 until totalLine) {
                if (i == enabledLine) {
                    color = levelColor
                    style = Paint.Style.FILL_AND_STROKE
                } else {
                    color = primaryColor
                    style = Paint.Style.FILL_AND_STROKE
                }
                val x = (mRectWidth * (i + 0.5) + spacing).toFloat()
                canvas?.drawLine(
                    x,
                    (mRectHeight.toDouble() * (totalLine - i).toDouble() * 0.1).toFloat(),
                    x,
                    (height * 0.8).toFloat(), this
                )
            }
        }
    }

    fun setCurrentLine(pos: Int){
        enabledLine = pos
        invalidate()
    }
}