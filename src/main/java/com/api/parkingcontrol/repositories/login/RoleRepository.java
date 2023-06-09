package com.api.parkingcontrol.repositories.login;

import com.api.parkingcontrol.models.login.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<RoleModel, String> {

}
