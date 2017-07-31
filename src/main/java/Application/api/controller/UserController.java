package Application.api.controller;

import Application.model.UserDto;
import Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = UserController.BASE_USER_URL_MAPPING)
public class UserController {
    static final String BASE_USER_URL_MAPPING = "/api/users";
    static final String USER_ID_MAPPING = "/{userName: .+}";

    private final UserService userservice;

    @Autowired
    public UserController(UserService userservice) {

        this.userservice = userservice;
    }



    @GetMapping
    public List<UserDto> findAll() {
        return userservice.findAll();
    }

    @GetMapping(value = USER_ID_MAPPING)
    public Optional<UserDto> findOne(@PathVariable String userName) {
        return userservice.findOne(userName);
    }


}












