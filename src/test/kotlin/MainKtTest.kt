import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MainKtTest {

    @Test
    fun isValidLengthTest_when8_thenReturnTrue() {
        // given
        val password = "password"
        // when
        val actual = isValidLength(password)
        // then
        assertTrue(actual)
    }

    @Test
    fun isValidLengthTest_when4_thenReturnFalse() {
        // given
        val password = "word"
        // when
        val actual = isValidLength(password)
        // then
        assertFalse(actual)
    }

    @Test
    fun containsDigitTest_whenHasNumber_thenReturnTrue() {
        // given
        val password = "password1"
        // when
        val actual = containsDigit(password)
        // then
        assertTrue(actual)
    }

    @Test
    fun containsDigitTest_whenHasNoNumber_thenReturnFalse() {
        // given
        val password = "password"
        // when
        val actual = containsDigit(password)
        // then
        assertFalse(actual)
    }

    @Test
    fun containsUpperAndLowerCaseTest_whenHasUpperAndLower_thenReturnTrue() {
        // given
        val password = "Password"
        // when
        val actual = containsUpperAndLowerCase(password)
        // then
        assertTrue(actual)
    }

    @Test
    fun containsUpperAndLowerCaseTest_whenHasUpper_thenReturnFalse() {
        // given
        val password = "PASSWORD"
        // when
        val actual = containsUpperAndLowerCase(password)
        // then
        assertFalse(actual)
    }

    @Test
    fun containsUpperAndLowerCaseTest_whenHasLower_thenReturnFalse() {
        // given
        val password = "password"
        // when
        val actual = containsUpperAndLowerCase(password)
        // then
        assertFalse(actual)
    }

    @Test
    fun isWeakPasswordTest_whenPasswordIsWeak_thenReturnTrue() {
        // given
        val password = "Password1"
        // when
        val actual = isWeakPassword(password)
        // then
        assertTrue(actual)
    }

    @Test
    fun containsSpecialCharacterTest_whenPasswordHasSpecialChar_thenReturnTrue() {
        // given
        val password = "Password1!"
        // when
        val actual = containsSpecialCharacter(password)
        // then
        assertTrue(actual)
    }
}
