package com.asivquark.essentials

import java.util.Random

object Section03NullableTypes {
    
    const val THE_BEST_PHRASE: String = "Coding and keep calm."
    const val USE_THIS_VALUE_TO_DEFAULT_PHRASE: String = "This is a default phrase"
    const val USE_THIS_VALUE_TO_DEFAULT_LENGTH: Int = 0

    // Return the random phrase or default phrase when is null.
    // Use elvis operator [?:] to check nullability
    fun task1(): Any {
        val maybeNullPhrase = randomPhrase()

        return maybeNullPhrase ?: USE_THIS_VALUE_TO_DEFAULT_PHRASE
    }
    
    // Return the random phrase length or default phrase length when is null.
    // Use operator "safe calls" [?.] and elvis operator [?:] to check nullability
    fun task2(): Any {
        val maybeNullPhrase = randomPhrase()

        return maybeNullPhrase?.length ?: USE_THIS_VALUE_TO_DEFAULT_LENGTH
    }

    // Return the random phrase in lowercase or default phrase lowercase when is null.
    // Use operator "safe calls" [?.] and elvis operator [?:] to check nullability
    fun task3(): Any {
        val maybeNullPhrase = randomPhrase()

        return maybeNullPhrase?.lowercase() ?: USE_THIS_VALUE_TO_DEFAULT_PHRASE.lowercase()
    }

    private fun randomPhrase(): String? {
        return if (Random().nextBoolean()) {
            null
        } else {
            THE_BEST_PHRASE
        }
    }
}