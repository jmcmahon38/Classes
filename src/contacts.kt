class contacts constructor(var contactID: Int = 999,
                           firstName: String,
                           var lastName: String,
                           var emailAddress: String,
                           var phoneHome: String,
                           var phoneWork: String,
                           var phoneCell: String,
                           ){
    var firstName: String = firstName
        get() = field
        set(value) {
            field = value

    }
    init{
        println("New contact added: $firstName $lastName")
    }

    fun printAll() {
        println(contactID.toString() + "\n" + firstName + " " + lastName +
                "\nEmail: " + emailAddress + "\nHome Phone: " + phoneHome +
                "\nWork Phone: " + phoneWork + "\nCell Phone: " + phoneCell)
    }

}