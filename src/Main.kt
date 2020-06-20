fun main() {
    //showChannel("","","","","","","")





}




fun showChannel(
    channelId: String,
    channelName: String,
    category: String,
    LOGO: String,
    FULL_HD: String,
    HD: String,
    SD: String

) {
    val group = channelId
    println("################# $channelName #################")
    if (FULL_HD.isNotEmpty()) {
        println("FULL_HD:")
        println(generateFULLHD(channelId, channelName, group, category, LOGO, FULL_HD))
        println()

    }
    if (HD.isNotEmpty()) {
        println("HD:")
        println(generateHD(channelId, channelName, group, category, LOGO, HD))
        println()
    }
    if (SD.isNotEmpty()) {
        println("SD:")
        println(generateSD(channelId, channelName, group, category, LOGO, SD))
        println()
    }
    println("################# - FIM $channelName - #################")
    println()
}

fun generateFULLHD(
    channelId: String,
    channelName: String,
    group: String,
    category: String,
    logo: String,
    url: String
): String {
    return "\"${channelId.plus("_FULL_HD")}\", \"${channelName.plus(" FULL HD")}\", \"$category\",\"$group\",\"$logo\",\"FULL_HD\",\"$url\" "
}

//\
fun generateHD(
    channelId: String,
    channelName: String,
    group: String,
    category: String,
    logo: String,
    url: String
): String {
    return "\"${channelId.plus("_HD")}\", \"${channelName.plus(" HD")}\", \"$category\",\"$group\",\"$logo\",\"HD\",\"$url\" "
}

fun generateSD(
    channelId: String,
    channelName: String,
    group: String,
    category: String,
    logo: String,
    url: String
): String {
    return "\"${channelId.plus("_SD")}\", \"${channelName.plus(" SD")}\", \"$category\",\"$group\",\"$logo\",\"SD\",\"$url\" "
}

data class Channel(val nomeDoCanal: String, val logo: String)