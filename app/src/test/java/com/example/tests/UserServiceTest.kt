package com.example.tests

import com.User
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.kotlin.whenever

class UserServiceTest {
    private val userRepository: UserRepository = mock()
    private val userService = UserService(userRepository)

    @Test
    fun `getUserName returns correct user name`() {
        // Configuração do mock para retornar um User quando o método getUserById for chamado
        val mockUser = User("1", "Michelli Tatiane")
        whenever(userRepository.getUserById("1")).thenReturn(mockUser)

        // Executando o método a ser testado
        val result = userService.getUserName("1")

        // Verificando se o resultado é o esperado
        assertEquals("Michelli Tatiane", result)
    }

    @Test
    fun `getUserName returns unknown user when user is not found`() {
        // Configuração do mock para retornar null quando o método getUserById for chamado
        whenever(userRepository.getUserById("2")).thenReturn(null)

        // Executando o método a ser testado
        val result = userService.getUserName("2")

        // Verificando se o resultado é o esperado
        assertEquals("Unknown User", result)
    }
}