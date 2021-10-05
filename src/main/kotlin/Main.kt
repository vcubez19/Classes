fun main() {

    // Filling out constructor for each employee
    val employeeOne = Employee("Vincent", "111-111-1111", 1)
    val employeeTwo = Employee("Billy", "111-111-2222", 2)
    val employeeThree = Employee("Joe", "111-111-3333", 3)


    // Using get all() method to display all info
    employeeOne.getAll()
    println("\n")
    employeeTwo.getAll()
    println("\n")
    employeeThree.getAll()

}

