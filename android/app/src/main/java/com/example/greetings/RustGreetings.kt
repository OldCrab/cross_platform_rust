package com.example.greetings

class RustGreetings {
    init {
        System.loadLibrary("cargo")
    }

    fun sayHello(to: String): String {
        return greeting(to)
    }

    companion object {
        private external fun greeting(pattern: String): String
    }

    external fun greeting(to: String): String
}
