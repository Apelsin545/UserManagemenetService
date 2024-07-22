package ru.eventplanner.usermanagementservice.user;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        user.setCreationDate(LocalDate.now() );
        return userService.save(user);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Long userId) {
        var user = userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }

    @PutMapping
    public User updateUser(@PathParam("userId") Long userId, @PathParam("newName") String newName) {
        return userService.updateNameById(userId, newName);
    }
}
