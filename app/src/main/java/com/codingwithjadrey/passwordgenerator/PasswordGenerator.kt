package com.codingwithjadrey.passwordgenerator

class PasswordGenerator {
    private val lowerCase = "abcdefghijklmnopqrstuvwxyz"
    private val upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    private val number = "012345678"
    private val symbols = "!#$%&/()@_+=?"
    private val characters = lowerCase + upperCase + number + symbols

    /**
     * If you would like, you can rather specific the characters variable singly like this
     * val characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ012345678!#$%&/()@_+=?"
     */

    /**
     * Create the generate password function with a parameter of Int(and pass it to a String)
     * which will be specified when
     * your are calling the generatePassword() in your activity
     */
    fun generatePassword(length: Int): String {
        val stringBuilder = StringBuilder(length)
        for (character in 0 until length) {
            val randomCharacter =
                (characters.indices).random()  // random() is an inbuilt kotlin function
            stringBuilder.append(characters[randomCharacter])
        }
        stringBuilder.insert((0 until length).random(), "")
        return stringBuilder.toString()
    }

}