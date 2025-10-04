package com.mydream.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // إنشاء واجهة التطبيق برمجياً
        val textView = TextView(this).apply {
            text = "🎉 مرحباً! هذا حلمي يتحقق!"
            textSize = 24f
            setPadding(50, 100, 50, 50)
        }
        
        val button = Button(this).apply {
            text = "اضغطني لأرى المعجزة 🚀"
            setOnClickListener {
                Toast.makeText(context, "🎊 أحلامي تتحقق!", Toast.LENGTH_SHORT).show()
                textView.text = "🔥 لقد صنعت تطبيقي الأول بنجاح!"
            }
        }
        
        // استخدام LinearLayout بسيط
        val layout = androidx.appcompat.widget.LinearLayoutCompat(this).apply {
            orientation = androidx.appcompat.widget.LinearLayoutCompat.VERTICAL
            gravity = android.view.Gravity.CENTER
            addView(textView)
            addView(button)
        }
        
        setContentView(layout)
    }
}
