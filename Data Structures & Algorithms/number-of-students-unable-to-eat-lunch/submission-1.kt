class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {

        val remaining = intArrayOf(0, 0)

        var count =  students.size

        for(student in students) {

            remaining[student]++
        }

        for (sandwich in sandwiches) {
            
            if(remaining[sandwich] > 0) {

                remaining[sandwich]--
                count--
            } else {
                break
            }
        }


        return count
    }
}
