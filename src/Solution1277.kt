class Solution1277 {
    fun countSquares(matrix: Array<IntArray>): Int {
        val row = matrix.size
        val col = matrix[0].size

        var totalCount = 0
        val maxSide = if (row > col) col else row

        for (i in 0 until maxSide) {
            for (r in 0 until row) {
                for (c in 0 until col) {
                    if (matrix[r][c] == 1) {
                        // start check square
                        var square = true
                        for (rChkr in r..r+i) {
                            for (cChkr in c..c+i) {
                                if (rChkr >= row || cChkr >= col) {
                                    square = false
                                    break
                                }
                                if (matrix[rChkr][cChkr] == 0) {
                                    square = false
                                    break
                                }
                            }
                            if (!square) {
                                break
                            }
                        }

                        if (square) {
                            totalCount++
                        }
                    }
                }
            }
        }

        return totalCount
    }
}