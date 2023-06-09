package com.api.parkingcontrol.dto.login.role;

import com.api.parkingcontrol.enums.RoleName;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoleDTO {

    private String roleId;
    private RoleName roleName;

}
