package com.api.parkingcontrol.controllers.login;

import com.api.parkingcontrol.dto.login.user.RegUserDTO;
import com.api.parkingcontrol.dto.login.user.UserDTO;
import com.api.parkingcontrol.dto.login.user.UserMapper;
import com.api.parkingcontrol.dto.parkingSpot.ParkingSpotMapper;
import com.api.parkingcontrol.models.login.UserModel;
import com.api.parkingcontrol.services.login.UserService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge=3600)
@RequestMapping("v2/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("")
    public ResponseEntity<UserDTO> saveUser(@RequestBody @Valid RegUserDTO regUserDTO){
        UserModel userModel = userService.save(UserMapper.fromDTO(regUserDTO));
        return ResponseEntity.ok(UserMapper.fromEntity(userModel));
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("")
    public ResponseEntity<Page<UserDTO>> getAllUsers(Pageable pageable){
        return ResponseEntity.ok(userService.findAll(pageable).map(UserMapper::fromEntity));
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable(value = "id") String id){
        return ResponseEntity.ok(UserMapper.fromEntity(userService.getById(id)));
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> editUser(@RequestBody @Valid RegUserDTO regUserDTO,
                                            @PathVariable(value = "id") String id){
        return ResponseEntity.ok(UserMapper.fromEntity(userService.update(
                UserMapper.fromDTO(regUserDTO), id)));
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable @Valid String id){
        userService.delete(id);
    }


}
