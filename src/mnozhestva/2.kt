package mnozhestva

// даны 2 множества, определить типы общих элемнтов

fun main() {
    val set1 = setOf<Any>("50", 6, 0.73, true, arrayListOf(1, 2))
    val set2 = setOf<Any>(6, true, arrayListOf(1, 2), 0.43, "Привет")

    val list = set1.intersect(set2).toList()

    for (i in list) {
        val newI = i.javaClass.toString()
        if (newI.contains("class java.lang.")) {
            print(newI.replace("class java.lang.", "") + "\n")
        }
        if (newI.contains("class java.util.")){
            print(newI.replace("class java.util.", "") + "\n")
        }
    }
}