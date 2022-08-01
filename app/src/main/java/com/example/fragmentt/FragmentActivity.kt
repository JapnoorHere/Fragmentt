package com.example.fragmentt

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentt.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {

    lateinit var binding : ActivityFragmentBinding
    lateinit var fragmentInterface: FragmentInterface
    var i=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnColor.setOnClickListener{
            AlertDialog.Builder(this).apply{
                setCancelable(false)
                setTitle("Change Color")
                setMessage("Which Color you want : ")
                setPositiveButton("Red"){_,_->
                fragmentInterface.FragmentRed()
                }
                setNegativeButton("Blue"){_,_,->
                    fragmentInterface.FragmentBlue()
                }
                setNeutralButton("Yellow"){_,_->
                    fragmentInterface.FragmentYellow()
                }
            }.show()

        }

        }
    fun counter(): Int {
        var j=i++
        return j
    }
}