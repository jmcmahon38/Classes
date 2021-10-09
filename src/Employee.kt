// class used to add new employees to the HR db
class Employee (
                val empNum: Int,
                empFirstName: String,
                empLastName: String,
                empShift: Int?) {
    var empFirstName: String = empFirstName
        get() = field
        set(value){
            field  = value
        }
    var empLastName: String = empLastName
        get() = field
        set(value){
            field  = value
            }

    //why do I have issues setting/getting an Int?
    var empShift: Int? = empShift
        get() = field
        set(value){
            field  = value
        }


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


