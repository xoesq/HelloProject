package Application.service.Converter;

import Application.model.Domain.User;
import Application.model.UserDto;
import org.springframework.stereotype.Component;

/**
 * User converter
 */
@Component
public class UserConverter extends AbstractModelConverter<UserDto, User> {
}
