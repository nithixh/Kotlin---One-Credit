// Student class
class Student(
    var name: String,
    var rollNo: Int
) {

    // Function with default arguments
    fun analyzeMarks(
        mark1: Int = 0,
        mark2: Int = 0,
        mark3: Int = 0
    ) {
        val total = mark1 + mark2 + mark3
        val average = total / 3.0

        // Grade calculation
        val grade = when {
            average >= 90 -> "A"
            average >= 75 -> "B"
            average >= 60 -> "C"
            average >= 50 -> "D"
            else -> "Fail"
        }

        // Output
        println("Student Name : $name")
        println("Roll No      : $rollNo")
        println("Total Marks  : $total")
        println("Average      : $average")
        println("Grade        : $grade")
    }
}

fun main() {
    // Creating object
    val student1 = Student("Nithish", 101)

    // Calling function using NAMED arguments
    student1.analyzeMarks(
        mark1 = 85,
        mark2 = 78,
        mark3 = 90
    )
}
