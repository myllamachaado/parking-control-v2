package com.api.parkingcontrol.dto.login.role;

import com.api.parkingcontrol.enums.RoleName;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegRoleDTO {

    @NotBlank
    private String roleId;

}
