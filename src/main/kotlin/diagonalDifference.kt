/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {

    val n = arr.size
    var sumX = 0
    var sumY = 0

    for (i in 0 until n) {
        for (j in 0 until n) {

            if (i == j) {
                sumX += arr[i][j];
            }

            if (i + j == n - 1) {
                sumY += arr[i][j];
            }
        }
    }
    return if (sumX > sumY) sumX - sumY else sumY - sumX
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n) { Array<Int>(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
