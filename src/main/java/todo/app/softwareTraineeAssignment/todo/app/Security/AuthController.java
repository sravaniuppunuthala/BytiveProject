package todo.app.softwareTraineeAssignment.todo.app.Security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/auth")
    public class AuthController {

        @Autowired
        private JwtTokenProvider jwtTokenProvider;

        // Generate and return the JWT token
        @PostMapping("/login")
        public String login(@RequestParam String username, @RequestParam String password) {
            // Here, you would add authentication logic (e.g., check username and password)
            return jwtTokenProvider.createToken(username);
        }
    }


