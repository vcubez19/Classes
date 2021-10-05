// Employee class


class Employee(private var empName: String, private var empNumber: String, private var empShift: Int ) {


    // Prints each property of the Employee class instance
    fun getAll() {
        println("Name: $empName\nNumber: $empNumber\nShift number: $empShift")
    }


}

