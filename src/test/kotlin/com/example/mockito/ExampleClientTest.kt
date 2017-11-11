package com.example.mockito

import assertk.assert
import assertk.assertions.isEqualTo
import com.nhaarman.mockito_kotlin.whenever
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock

@ExtendWith(MockitoExtension::class)
class ExampleClientTest {

    @Mock
    private lateinit var service: ExampleService

    @InjectMocks
    private lateinit var client: ExampleClient

    @Test
    fun getMessage() {
        whenever(service.getNames()).thenReturn(listOf("A", "B", "C"))
        assert(client.getMessage()).isEqualTo("A, B, C")
    }
}