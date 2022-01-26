package com.example.musictribetask

import android.app.Activity
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast

fun Toast.showCustomToast(message: String, activity: Activity)
{
    val layout = activity.layoutInflater.inflate (
        R.layout.custom_toast,
        activity.findViewById(R.id.custom_toast_layout)
    )

    // set the text of the TextView of the message
    val textView = layout.findViewById<TextView>(R.id.custom_toast_message)
    textView.text = message

    // use the application extension function
    this.apply {
        setGravity(Gravity.LEFT, 0, 40)
        duration = Toast.LENGTH_LONG
        view = layout
        show()
    }
}
