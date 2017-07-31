package Application.service;


import Application.model.UserDto;

import java.util.List;
import java.util.Optional;

/**
 * Created by xisco.balaguer on 11/07/2017.
 */
public interface UserService {

    /**
     * Para listar todos
     **/
    List<UserDto> findAll();

    /** Para user por filtro **/
//    List<UserDto> findAll(UserFilterDto filter);

    /**
     * Para encontrar un usuario pro su userName
     **/
    <T> Optional<UserDto> findOne(String userName);
}