package ultimate.devil.animationch1

import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { args ->
           startAnimate()
        }
    }

    private fun startAnimate() {
        val d: Drawable = imageView.drawable

        if (d is Animatable) {
            (d as Animatable).start()
        }

    }
}
