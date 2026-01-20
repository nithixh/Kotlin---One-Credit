fun renderProfile(
    name: String? = null,
    age: Int? = null,
    email: String? = null,
    phone: String? = null
) {
    println("----- User Profile -----")

    // Name handling
    val displayName = name?.uppercase() ?: "Not Provided"
    println("Name  : $displayName")

    // Age handling
    val displayAge = age?.let { "$it years old" } ?: "Not Provided"
    println("Age   : $displayAge")

    // Email handling
    println("Email : ${email ?: "Not Provided"}")

    // Phone handling
    println("Phone : ${phone ?: "Not Provided"}")

    println("------------------------")
}

fun main() {

    // Case 1: All details available
    renderProfile(
        name = "Nithish",
        age = 20,
        email = "nithish@example.com",
        phone = "9876543210"
    )

    // Case 2: Partial details
    renderProfile(
        name = "Arun",
        email = "arun@example.com"
    )

    // Case 3: No details
    renderProfile()
}
