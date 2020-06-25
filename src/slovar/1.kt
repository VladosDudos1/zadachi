package slovar

// Есть два списка разной длины. В первом содержатся ключи, а во втором значения. Напишите функцию, которая создаёт из этих ключей и значений словарь. Если ключу не хватило значения, в словаре должно быть значение None Значения, которым не хватило ключей, нужно игнорировать.

fun main() {
    val listK = arrayListOf<String>()
    val listI = arrayListOf<String>()
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()

    val dictionary = mutableMapOf<String, String>()


    for (item: Int in 0..num1-1) {
        listK.add(readLine().toString())
    }

    for (item: Int in 0..num2-1) {
        listI.add(readLine().toString())
    }
    if (listK.size > listI.size) {
        for (i in 0..listK.size-1) {
            if (listI.lastIndex < i){
                dictionary.put(listK[i], "None")
            } else dictionary.put(listK[i], listI[i])
        }
    }

    if (listK.size < listI.size) {
        for (i in 0..listK.size-1) {
            if (listK.lastIndex >= i){
                dictionary.put(listK[i], listI[i])
            }
        }
    }



    print(dictionary)
}
