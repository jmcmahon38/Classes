// class used to add new employees to the HR db
class Employee constructor(
    val empNum: Int = 1,
    var empFirstName: String,
    var empLastName: String,
    var empShift: Int? = 1){

    // initialize and give user entry validation
    init {

        println("adding new employee $empLastName $empFirstName")
    }

    // allow user to call values on an Employee object
    fun printValues() {
        println("Number: $empNum\n" +
                "First Name: $empFirstName\n" +
                "Last Name: $empLastName\n" +
                "Shift: $empShift")
    }

}

