package com.example.tests

import com.google.common.base.Verify.verify
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.kotlin.verify

class MockObjTest {
    @Test
    fun `test with relaxed mock`() {
        // Criando um mock relaxado
        val myService = mock<MyService>()

        // O método getGreeting será chamado, mas como não o mockamos especificamente,
        // ele retornará um valor padrão vazio ("") sem falhar.
        val result = myService.getGreeting()

        // Verificando a chamada
        verify { myService.getGreeting() }
    }
}

class MyService {
    fun getGreeting(): String {
        return "Hello, World!"
    }

}