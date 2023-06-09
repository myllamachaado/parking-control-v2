package com.api.parkingcontrol.controllers.login;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge=3600)
@RequestMapping("v2/roles")
@AllArgsConstructor
public class RoleController {
}
