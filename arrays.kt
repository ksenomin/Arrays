fun main(){

    print("Введите количество строк: ")
    val lines = readln()
    print("Введите количество столбцов: ")
    val column = readln()
    var count: Int = 0
    var number: Array<Int>

    var numberss: Array <String>
    var chislo: Int
    var a: Int
    var b: Int
    var c: Int
    val arrTwoDimens = Array(lines.toInt()){
        Array(column.toInt()){
            (100 .. 999).random()
        }
    }
    for(i in 0 .. lines.toInt()-1){
        for(j in 0 .. column.toInt()-1){
            print(arrTwoDimens[i][j].toString() + "\t\t")
        }
        println()
    }
    val anyNumbers = mutableSetOf<Char>() // Используем Set для хранения уникальных значений

    for (i in 0 until lines.toInt()) {
        for (j in 0 until column.toInt()) {
            val chislo = arrTwoDimens[i][j]
            val a = chislo / 100
            val b = chislo / 10 % 10
            val c = chislo % 10

            // Добавляем цифры в Set
            anyNumbers.add(a.toString()[0])
            anyNumbers.add(b.toString()[0])
            anyNumbers.add(c.toString()[0])
        }
    }
    println("Количество уникальных цифр: ${anyNumbers.size}")
}

