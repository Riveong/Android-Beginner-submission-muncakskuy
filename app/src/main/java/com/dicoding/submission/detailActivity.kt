package com.dicoding.submission

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class detailActivity : AppCompatActivity(), View.OnClickListener {

    companion object{

        const val EXTRA_MOUNT ="extra_mount"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val tvTitle:TextView = findViewById(R.id.title_det)
        val tvContent:TextView = findViewById(R.id.content_det)
        val ivPic:ImageView = findViewById(R.id.pic_det)
        val orderGuide:Button = findViewById(R.id.order_det)

        orderGuide.setOnClickListener(this)


        val mount = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra<Mount>(EXTRA_MOUNT, Mount::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<Mount>(EXTRA_MOUNT)
        }

        if (mount != null){

            tvTitle.text = mount.name.toString()
            tvContent.text = mount.desc.toString()
            ivPic.setImageResource(mount.photo)


        }



    }

    override fun onClick(V: View?) {
        when(V?.id){
            (R.id.order_det) -> {
                val phoneNumber = "510837805132750109159819235891235"
                val callIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))

                startActivity(callIntent)


            }


        }
    }
}