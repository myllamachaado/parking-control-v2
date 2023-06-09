package com.api.parkingcontrol.models.login;

import com.api.parkingcontrol.enums.RoleName;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_ROLE")
public class RoleModel implements GrantedAuthority, Serializable {

    private static final long serialVersionUID = 1L;

    public RoleModel(String roleId) {
        this.roleId = roleId;
    }

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(unique = true)
    private String roleId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleName roleName;


    @Override
    public String getAuthority() {
        return this.roleName.toString();
    }

}
