import kotlin.js.JsExport
import kotlin.js.JsName

private const val INVALID_RESPONSE = "invalid"
private const val NO_INPUT_RESPONSE = "no input"
private const val SYNTAX_ERROR_RESPONSE = "syntax error"
private const val VALID_RESPONSE = "valid"

private const val CORRECT_NUMBER_OF_ELEMENTS = 5
private const val EQUALS_SIGN_INDEX = 3
private const val PLUS_SIGN_INDEX = 1

@JsExport()
@JsName("validateEquation")
fun validate(equationString: String): String {

    if (equationString.isEmpty()){
        return NO_INPUT_RESPONSE;
    }

    val equationStringSplit = equationString.split(' ')
    if(!symbolsInTheRightPlace(equationStringSplit)){
        return SYNTAX_ERROR_RESPONSE
    }

    try {
        operandsAreNumberical(equationStringSplit)
    } catch (numberFormException: NumberFormatException) {
        return SYNTAX_ERROR_RESPONSE
    }

    return if(equationStringSplit[0].toInt() + equationStringSplit[2].toInt() == equationStringSplit[4].toInt()){
        VALID_RESPONSE
    } else {
        INVALID_RESPONSE
    }

    return SYNTAX_ERROR_RESPONSE
}

fun operandsAreNumberical(equationStringSplit: List<String>) {
    arrayOf(equationStringSplit[0], equationStringSplit[2], equationStringSplit[4]).forEach {
        it.toInt()
    }
}

fun symbolsInTheRightPlace(equationElements: List<String>): Boolean {
    if(equationElements.size == CORRECT_NUMBER_OF_ELEMENTS){
        if(equationElements[PLUS_SIGN_INDEX] == "+" &&
            equationElements[EQUALS_SIGN_INDEX] == "="){
            return true;
        }
    }
    return false;
}
