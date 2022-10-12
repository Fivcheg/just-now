fun main() {
    val timeInSeconds = 10
    val finish = agoToText(timeInSeconds)
    println("Был(-а) в сети $finish")
}

fun agoToText(timeInSecond: Int): String{
    val result = when (timeInSecond){
        in 0..60 -> "только что"
        in 61..60*60 -> ""
        in 60*60+1..24*60*60 -> ""
        in 24*60*60+1..2*24*60*60 -> "вчера"
        in 2*24*60*60+1..3*24*60*60 -> "позавчера"
        else -> "давно"
    }
    return result;
}