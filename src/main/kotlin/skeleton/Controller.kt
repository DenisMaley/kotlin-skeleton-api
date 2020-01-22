package skeleton

import org.springframework.web.bind.annotation.*
import java.time.Instant

@RestController
class AppController {
    @RequestMapping("/status")
    fun status() = "ok"

    @RequestMapping("/user")
    fun getUser(): User {
        val user = User(
            username = "johndoe",
            name = "John Doe",
            email = "johndoe@example.com",
            registered = Instant.now()
        )
        return user
    }

    /**
     * @param user The details of the user to create
     */
    @RequestMapping(value = ["/user"], method = [RequestMethod.POST])
    fun createUser(@RequestBody user: NewUser): User {
        return User(
            username = user.username,
            name = user.name,
            email = user.email,
            registered = Instant.now()
        )
    }
}