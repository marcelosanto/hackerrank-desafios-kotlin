/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val hour = "${s[0]}${s[1]}"
    val hourForm = formatHour(hour, s.contains("PM"))
    val removePmorAm = if (s.contains("PM")) s.replace("PM", "") else s.replace("AM", "")

    return removePmorAm.replace(hour, hourForm)
}

fun formatHour(str: String, pm: Boolean): String {
    if (pm) {
        return when (str) {
            "00" -> "12"
            "01" -> "13"
            "02" -> "14"
            "03" -> "15"
            "04" -> "16"
            "05" -> "17"
            "06" -> "18"
            "07" -> "19"
            "08" -> "20"
            "09" -> "21"
            "10" -> "22"
            "11" -> "23"
            else -> str
        }
    } else {
        return when (str) {
            "12" -> "00"
            "13" -> "01"
            "14" -> "02"
            "15" -> "03"
            "16" -> "04"
            "17" -> "05"
            "18" -> "06"
            "19" -> "07"
            "20" -> "08"
            "21" -> "09"
            "22" -> "10"
            "23" -> "11"
            else -> str
        }
    }
}

fun main(args: Array<String>) {
    val s = "06:40:03AM"

    val result = timeConversion(s)

    println(result)
}
