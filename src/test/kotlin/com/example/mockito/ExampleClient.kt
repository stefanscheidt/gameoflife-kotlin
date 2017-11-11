package com.example.mockito

class ExampleClient(private val service: ExampleService) {

    fun getMessage() = service.getNames().joinToString()

}