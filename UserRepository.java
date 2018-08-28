package com.pineapple.core.repositories;

import com.pineapple.core.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
