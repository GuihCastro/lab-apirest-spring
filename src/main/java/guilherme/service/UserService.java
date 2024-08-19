package guilherme.service;

import guilherme.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
