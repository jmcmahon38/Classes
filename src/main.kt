fun main() {
// testing creating new objects from Employee class
    val employee1 = Employee(
        1, "James","McJameson", 1
    )

    val employee2 = Employee(
        2, "Garth","McGartherstein", 3
    )

    val employee3 = Employee(
        3, "Unga","McGungalo", 2
    )
    // checking method functionality
    println("*****")
    employee1.printValues()
    println("*****")
    employee2.printValues()
    println("*****")
    employee3.printValues()

}

// notes

//    val person1 = contacts(
//        1, "Justin", "McMahon",
//        "justin@gmail.com", "1568946532",
//        "8974569876", "8795648521"
//    )
//    val person2 = contacts(
//        1, "James", "Killroy",
//        "james@gmail.com", "8546987546",
//        "8974569876", "7569863215"
//    )
//    person1.printAll()
//    println("\n")
//    person2.printAll()
