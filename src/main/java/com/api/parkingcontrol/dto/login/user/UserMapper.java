package com.api.parkingcontrol.dto.login.user;

import com.api.parkingcontrol.dto.login.role.RoleMapper;
import com.api.parkingcontrol.models.login.UserModel;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserMapper {

    public static UserModel fromDTO(RegUserDTO dto){
        var pw = new BCryptPasswordEncoder().encode(dto.getPassword());
        return new UserModel(null, dto.getUsername(), pw, RoleMapper.fromDTO(dto.getRoles()));
    }

    public static UserDTO fromEntity(UserModel parkingSpotModel){
        return new UserDTO(parkingSpotModel.getUserId(), parkingSpotModel.getUsername(),
                RoleMapper.fromEntity(parkingSpotModel.getRoles()));
    }

}
