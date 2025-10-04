package com.mydream.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this)
        textView.text = "🎉 تطبيقي يعمل!"
        textView.textSize = 24f
        
        setContentView(textView)
    }
}    }
}
