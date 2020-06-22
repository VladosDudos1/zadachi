package massives

//Напишите программу, которая циклически сдвигает элементы массива вправо (например, если элементы нумеруются, начиная с нуля, то 0-й элемент становится 1-м, 1-й становится 2-м, ..., последний становится 0-м, то есть массив {3, 5, 7, 9} превращается в массив {9, 3, 5, 7}).

fun main() {
    val list = arrayListOf<Int>()
    val num = readLine()!!.toInt()
    val newList = arrayListOf<Int>()

    for (item: Int in 0..num-1) {
        list.add(readLine()!!.toInt())
    }


    for (i in 0..num-1){
        if (i != num-1){
            newList.add(list[i])
        }
    }

    newList.reverse()
    newList.add(list[num-1])
    newList.reverse()
    print(newList)
}