package skeleton

import java.time.Instant

/**
 * Representation of a User
 * @property username The user's username
 * @property name The user's name
 * @property email The user's email address
 * @property registered The user's registration time
 */
data class User(
    val username: String,
    val name: String,
    val email: String,
    val registered: Instant
)