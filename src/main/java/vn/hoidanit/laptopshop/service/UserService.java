package vn.hoidanit.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Lưu người dùng
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    // lấy người dùng
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    // lấy người dùng bằng id
    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    public User updateUser(User user) {
        return this.userRepository.save(user);
    }

    // delete
    public void deleteUserById(long id) {
        this.userRepository.deleteById(id);
    }
}
