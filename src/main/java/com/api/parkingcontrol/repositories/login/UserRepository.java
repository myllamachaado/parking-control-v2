package com.api.parkingcontrol.repositories.login;

import com.api.parkingcontrol.models.login.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

    Optional<UserModel> findByUsername(String username);

}
