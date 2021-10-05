// Employee class


class Employee(private var empName: String, private var empNumber: String, private var empShift: Int ) {


    fun getAll() {
        println("Name: $empName\nNumber: $empNumber\nShift number: $empShift")
    }


}

