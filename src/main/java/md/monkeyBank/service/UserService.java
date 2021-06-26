package md.monkeyBank.service;

import md.monkeyBank.entity.UserEntity;

import java.util.Optional;

public interface UserService {
    Optional<UserEntity> finById (Integer id);
}
