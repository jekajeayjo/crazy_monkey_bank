package md.monkeyBank.service.impl;

import md.monkeyBank.entity.UserEntity;
import md.monkeyBank.repository.UserRepository;
import md.monkeyBank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<UserEntity> finById(Integer id) {

        return userRepository.findById(id);
    }
}
