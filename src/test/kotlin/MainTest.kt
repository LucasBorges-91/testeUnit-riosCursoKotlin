import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertTrue( countXO("xxoo"))
        Assertions.assertTrue( countXO("xXoO"))
        Assertions.assertTrue( countXO("XxoO"))
        //no assert all testamos todos os teste não pausando ao encontrar alguem erro
        Assertions.assertAll(
            {Assertions.assertTrue( countXO("xxoo"))},
            {Assertions.assertTrue( countXO("xoox"))},
            {Assertions.assertFalse( countXO("xXo"))},
            {Assertions.assertTrue( countXO("xxoo"))}
        )
    }

    @Test
    @Disabled
    //deixa o teste desabilitado
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        fail( "nao posso terminar sem esse teste ")
    }
}