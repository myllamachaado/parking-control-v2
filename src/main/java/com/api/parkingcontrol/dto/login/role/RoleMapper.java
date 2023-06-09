package com.api.parkingcontrol.dto.login.role;

import com.api.parkingcontrol.models.login.RoleModel;

import java.util.List;
import java.util.stream.Collectors;

public class RoleMapper {

    public static RoleModel fromDTO(RegRoleDTO dto){
        return new RoleModel(dto.getRoleId());
    }

    public static List<RoleModel> fromDTO(List<RegRoleDTO> dto){
        return dto.stream().map(RoleMapper::fromDTO)
                .collect(Collectors.toList());
    }

    public static List<RoleDTO> fromEntity(List<RoleModel> roleModel){
        return roleModel.stream().map(RoleMapper::fromEntity)
                .collect(Collectors.toList());
    }

    public static RoleDTO fromEntity(RoleModel roleModel){
        return new RoleDTO(roleModel.getRoleId(), roleModel.getRoleName());
    }

}
