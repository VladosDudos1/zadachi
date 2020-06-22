package massives

//Напишите программу, которая переставляет элементы массива в обратном порядке без использования дополнительного массива. Программа должна считать массив, поменять порядок его элементов, затем вывести результат

fun main() {
    val list = arrayListOf<Int>()
    val num = readLine()!!.toInt()

    for (item: Int in 0..num-1) {
        list.add(readLine()!!.toInt())
    }

    list.reverse()

    print(list)
}