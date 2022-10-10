package com.codingwithjadrey.passwordgenerator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codingwithjadrey.passwordgenerator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * We set the clickListener on the generate password button and set the generated password
         * textView with the string created by the generatePassword() function and passing in
         * a string length of 10
         */
        binding.generatePasswordBtn.setOnClickListener {
            binding.generatedPasswordTv.text = PasswordGenerator().generatePassword(10)
        }
    }
}