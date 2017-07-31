package Application.service;

import Application.model.Domain.User;
import Application.model.UserDto;
import Application.repository.UserRepository;
import Application.service.Converter.UserConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserConverter converter;

    @Autowired
    public UserServiceImpl(UserRepository repository, UserConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public List<UserDto> findAll() {

        List<User> userList = repository.findAll();

        return userList.stream().map(user -> converter.toApiModel(user, UserDto.class)).collect(Collectors.toList());

    }

    @Override
    public <T> Optional<UserDto> findOne(String userName) {

        User user = repository.findFirstByUsername(userName);
        if (user == null) {
            return Optional.empty();
        }

        return Optional.of(converter.toApiModel(user, UserDto.class));
    }


}
