
import kotlin.test.Test
import kotlin.test.assertTrue

class ValidatorTest {

    @Test
    fun testEmptyString() {
        assertTrue(validate("") == "no input")
    }

    @Test
    fun testSyntaxError() {
        assertTrue(validate("Invalid Syntax String") == "syntax error")
    }

    @Test
    fun testNumbersButNoSpaces() {
        assertTrue(validate("1+1=2") == "syntax error")
    }

    @Test
    fun correctFormatButNotNumbers() {
        assertTrue(validate("s + 1 = b") == "syntax error")
    }

    @Test
    fun correctFormatAndNumbersWrongResult() {
        assertTrue(validate("1 + 1 = 3") == "invalid")
    }

    @Test
    fun correctFormatAndResult() {
        assertTrue(validate("1 + 1 = 2") == "valid")
    }
}