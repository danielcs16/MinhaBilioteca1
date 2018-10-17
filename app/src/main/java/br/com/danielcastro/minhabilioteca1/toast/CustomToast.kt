package br.com.danielcastro.minhabilioteca1.toast

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import br.com.danielcastro.minhabilioteca1.R

class CustomToast(val context: Context, val inflater: LayoutInflater) {

    fun showToast(text: String) {
        val customToastroot = inflater.inflate(R.layout.custom_toast, null)
        val customtoast = Toast(context)

        val textView = customToastroot.findViewById<TextView>(R.id.textView1)
        textView.text = text

        customtoast.view = customToastroot
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customtoast.duration = Toast.LENGTH_LONG

        customtoast.show()
    }

    fun sucessoToast(text: String) {
        val customToastroot = inflater.inflate(R.layout.custom_toast, null)
        val customtoast = Toast(context)

        val textView = customToastroot.findViewById<TextView>(R.id.textView1)
        textView.text = text
        textView.setTextColor(Color.rgb(155,155,155))

        customtoast.view.setBackgroundColor(Color.GREEN)
        customtoast.view = customToastroot
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customtoast.duration = Toast.LENGTH_LONG

        customtoast.show()
    }

    fun erroToast(text: String) {
        val customToastroot = inflater.inflate(R.layout.custom_toast, null)
        val customtoast = Toast(context)

        val textView = customToastroot.findViewById<TextView>(R.id.textView1)
        textView.text = text
        textView.setTextColor(Color.rgb(155,155,155))

        customtoast.view.setBackgroundColor(Color.red(200))
        customtoast.view = customToastroot
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customtoast.duration = Toast.LENGTH_LONG

        customtoast.show()
    }

    fun alertaToast(text: String) {
        val customToastroot = inflater.inflate(R.layout.custom_toast, null)
        val customtoast = Toast(context)

        val textView = customToastroot.findViewById<TextView>(R.id.textView1)
        textView.text = text
        textView.setTextColor(Color.rgb(155,155,155))

        customtoast.view.setBackgroundColor(Color.YELLOW)
        customtoast.view = customToastroot
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customtoast.duration = Toast.LENGTH_LONG

        customtoast.show()
    }

}