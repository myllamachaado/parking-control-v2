package com.api.parkingcontrol.dto.login.user;

import com.api.parkingcontrol.dto.login.role.RoleDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {

    private String userId;
    private String username;
    private List<RoleDTO> roles;

}
