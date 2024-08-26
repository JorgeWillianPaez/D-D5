package personagem

import org.example.classes.Barbaro
import org.example.personagem.Personagem
import org.example.racas.Anao
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PersonagemTest {

    @Test
    fun `Deve criar um personagem com raça e classe`() {
        val raca = Anao()
        val classe = Barbaro()

        val personagem = Personagem(raca, classe)

        assertEquals("Anão", personagem.raca.nome)
        assertEquals("Bárbaro", personagem.classe.nome)
    }

    @Test
    fun `Deve criar um personagem com 10 de vida`() {
        val raca = Anao()
        val classe = Barbaro()

        val personagem = Personagem(raca, classe)

        assertEquals(10, personagem.vida)
    }

    @Test
    fun `Deve criar um Anão com máximo de vida na criação`() {
        val raca = Anao()
        val classe = Barbaro()

        val personagem = Personagem(raca, classe)

        personagem.constituicao.nivelAtual = 17
        personagem.calcularVidaInicial()

        assertEquals(13, personagem.vida)
    }
}