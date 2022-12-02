import java.io.File

fun main() {
    val file = File("input-day1")
    val lines = file.readText().split("\n")

    val totals = mutableListOf<Int>()
    var currentTotal = 0
    lines.forEach {
        if (it == "") {
            totals.add(currentTotal)
            currentTotal = 0;
            return@forEach
        }
        currentTotal += it.toInt()
    }
    totals.add(currentTotal)
    println("Size: " + totals.size)

    val sortedTotals = totals.sortedDescending()
    println("Most Calories: " + sortedTotals[0])
    println("Top 3: " + (sortedTotals[0] + sortedTotals[1] + sortedTotals[2]))
}