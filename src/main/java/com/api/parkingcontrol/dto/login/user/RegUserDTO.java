package com.api.parkingcontrol.dto.login.user;

import com.api.parkingcontrol.dto.login.role.RegRoleDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegUserDTO {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotNull
    private List<RegRoleDTO> roles;

}
