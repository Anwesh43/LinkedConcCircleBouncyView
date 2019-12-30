package com.anwesh.uiprojects.concbouncycircleview

/**
 * Created by anweshmishra on 30/12/19.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas
import android.graphics.RectF
import android.content.Context
import android.app.Activity

val nodes : Int = 5
val circles : Int = 3
val strokeFactor : Float = 90f
val sizeFactor : Float = 2f
val delay : Long = 20
val scGap : Float = 0.02f / circles
val foreColor : Int = Color.parseColor("#4CAF50")
val backColor : Int = Color.parseColor("#BDBDBD")
