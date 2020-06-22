package massives

// Дан массив, состоящий из целых чисел. Напишите программу, которая определяет, есть ли в массиве пара соседних элементов с одинаковыми знаками.

fun main() {

    val list = arrayListOf<Int>()
    val num = readLine()!!.toInt()
    var requestInt = 0

    for (item: Int in 0..num-1) {
        list.add(readLine()!!.toInt())
    }

    for (i: Int in 0..num-1) {
        if (i != num-1 && num !=1){
            if ((list[i] > 0 && list[i+1] > 0) || ((list[i] < 0 && list[i+1] < 0))){
                requestInt = 1
            }
        }
    }

    if (requestInt == 1) {
        print("YES")
    } else print("NO")
}