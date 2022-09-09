package io.mbk.lesson7

import android.app.AlertDialog
import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.addFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
}

fun Context.showToast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}


fun Fragment.showToast(msg: String) {
    Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
}

fun showDialog() {

}

fun Context.  alert(msg1 :String, msg2 :String) {
    val alertDialog = AlertDialog.Builder(this)
    alertDialog.setTitle(msg1)
    alertDialog.setMessage(msg2)

}