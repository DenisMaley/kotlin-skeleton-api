package skeleton

import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Representation of a User to create
 * @property username The user's username
 * @property name The user's name
 * @property email The user's email address
 */
data class NewUser @JsonCreator constructor(
    val username: String,
    val name: String,
    val email: String
)