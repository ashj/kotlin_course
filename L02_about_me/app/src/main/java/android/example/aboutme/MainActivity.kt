package android.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import android.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.doneButton.setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {
        /*
        binding.nicknameView.text = binding.nicknameEdit.text
        binding.invalidateAll() // refresh UI
        binding.nicknameEdit.visibility = View.GONE
        binding.doneButton.visibility = View.GONE
        binding.nicknameView.visibility = View.VISIBLE
        */

        binding.apply {
            nicknameView.text = binding.nicknameEdit.text
            invalidateAll() // refresh UI
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameView.visibility = View.VISIBLE
        }

        //hides the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
