fun main() {
    val timeInSeconds = 82000
    val finish = agoToText(timeInSeconds)
    println("Был(-а) в сети $finish")
}

fun agoMinutes(timeInSecond: Int): String{
    val transformToMinutes = timeInSecond / 60;
    val resultMinutes: String
    if (transformToMinutes == 1 || transformToMinutes % 10 == 1 && transformToMinutes != 11) {
        resultMinutes = "$transformToMinutes минуту назад"
    }
    else if (transformToMinutes in 2..4 || transformToMinutes % 10 in 2..4 && transformToMinutes > 20) {
        resultMinutes= "$transformToMinutes минуты назад"
    }
    else {
        resultMinutes = "$transformToMinutes минут назад"
    }
    return resultMinutes
}

fun agoClock(timeInSecond: Int): String{
    val transformToClock = timeInSecond / 3600
    val resultClock: String
    if (transformToClock == 1 || transformToClock % 10 == 1 && transformToClock != 11) {
        resultClock = "$transformToClock час назад"
    }
    else if (transformToClock in 2..4 || transformToClock % 10 in 2..4 && transformToClock > 20) {
        resultClock= "$transformToClock часа назад"
    }
    else {
        resultClock = "$transformToClock часов назад"
    }
    return resultClock
}

fun agoToText(timeInSecond: Int): String{
    val result = when (timeInSecond){
        in 0..60 -> "только что"
        in 61..60 * 60 -> agoMinutes(timeInSecond)
        in 60 * 60 + 1..24 * 60 * 60 -> agoClock(timeInSecond)
        in 24 * 60 * 60 + 1..2 * 24 * 60 * 60 -> "вчера"
        in 2 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60 -> "позавчера"
        else -> "давно"
    }
    return result;
}