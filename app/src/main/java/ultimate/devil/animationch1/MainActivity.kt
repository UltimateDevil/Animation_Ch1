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
        val d1: Drawable = imageView2.drawable
        val d2: Drawable = imageView3.drawable
        val d3: Drawable = imageView4.drawable

        if (d is Animatable && d1 is Animatable && d2 is Animatable && d3 is Animatable) {
            (d as Animatable).start()
            (d2 as Animatable).start()
            (d1 as Animatable).start()
            (d3 as Animatable).start()
        }

    }
}
