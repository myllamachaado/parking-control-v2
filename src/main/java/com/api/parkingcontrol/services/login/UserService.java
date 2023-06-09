package com.api.parkingcontrol.services.login;

import com.api.parkingcontrol.models.login.UserModel;
import com.api.parkingcontrol.repositories.login.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public Optional<UserModel> findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Transactional
    public UserModel save(UserModel user){
        return userRepository.save(user);
    }

    public Page<UserModel> findAll(Pageable page){
        return userRepository.findAll(page);
    }

    public UserModel getById(String id){
        return userRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Usuário não encontrado."));
    }

    @Transactional
    public UserModel update(UserModel user, String id){
        UserModel registro = this.getById(id);
        user.setUserId(registro.getUserId());
        return userRepository.save(user);
    }

    @Transactional
    public void delete(String id){
        UserModel registro = this.getById(id);
        userRepository.deleteById(id);
    }

}
