package slovar

import kotlin.math.max

//Найдите в словаре самый длинный элемент (не уточняется, найти )

fun main() {
    val listK = arrayListOf<String>()
    val listI = arrayListOf<String>()
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()

    val dictionary = mutableMapOf<String, String>()


    for (item: Int in 0..num1 - 1) {
        listK.add(readLine().toString())
    }

    for (item: Int in 0..num2 - 1) {
        listI.add(readLine().toString())
    }
    if (listK.size > listI.size) {
        for (i in 0..listK.size - 1) {
            if (listI.lastIndex < i) {
                dictionary.put(listK[i], "None")
            } else dictionary.put(listK[i], listI[i])
        }
    }

    if (listK.size < listI.size) {
        for (i in 0..listK.size - 1) {
            if (listK.lastIndex >= i) {
                dictionary.put(listK[i], listI[i])
            }
        }
    }
    if (listK.size == listI.size) {
        for (i in 0..listK.size - 1) {
            dictionary.put(listK[i], listI[i])
        }
    }

    val newList = mutableListOf<Int>()
    val checkList = mutableListOf<String>()

    for (i in dictionary){
        newList.add(i.value.length)
        checkList.add(i.value)
    }

    print(newList.max().toString() + "\n")
    print(checkList[newList.indexOf(newList.max())])
}