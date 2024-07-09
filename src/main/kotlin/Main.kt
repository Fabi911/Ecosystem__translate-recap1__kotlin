
    fun main() {
        val password = "Tomatensalat1#"
        println("Hello World!")
        if (isValidLength(password) && containsDigit(password) && containsUpperAndLowerCase(password) && !isWeakPassword(password) && containsSpecialCharacter(password)) {
            println("Valid password")
        }
    }

    fun isValidLength(password: String): Boolean {
        return password.length >= 8
    }

    fun containsDigit(password: String): Boolean {
        for (c in password) {
            if (c.isDigit()) {
                return true
            }
        }
        return false
    }

    fun containsUpperAndLowerCase(password: String): Boolean {
        var hasUpper = false
        var hasLower = false

        for (c in password) {
            if (c.isUpperCase()) {
                hasUpper = true
            }
            if (c.isLowerCase()) {
                hasLower = true
            }
            if (hasUpper && hasLower) {
                return true
            }
        }
        return false
    }

    fun isWeakPassword(password: String): Boolean {
        val weakPasswords = setOf("password", "Password1", "Password2", "Aa3456789")
        return weakPasswords.contains(password)
    }

    fun containsSpecialCharacter(password: String): Boolean {
        val specialCharacters = "!§$%&/()=?`#'*[]|{}≠¿¡“¶¢<>'^°"
        for (c in password) {
            if (specialCharacters.contains(c)) {
                return true
            }
        }
        return false
    }
