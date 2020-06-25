package mnozhestva

// Найти Элементы множества, не встречающиеся во 2 множестве

fun main() {
    val set1 = mutableSetOf<Int>()
    val set2 = mutableSetOf<Int>()

    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()

    for (item: Int in 0..num1-1) {
        set1.add(readLine()!!.toInt())
    }
    for (item: Int in 0..num2-1) {
        set2.add(readLine()!!.toInt())
    }

    print(set1 - set1.intersect(set2))
}