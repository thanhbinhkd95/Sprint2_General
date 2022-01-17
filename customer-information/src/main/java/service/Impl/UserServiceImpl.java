package service.Impl;

import Dto.BonusPointDto;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IUserRepository;
import service.IUserService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public Optional<User> findById(Long id) {
        return iUserRepository.findById(id);
    }

    @Override
    public void updateUser(User user) {
        iUserRepository.save(user);
    }

    @Override
    public List<BonusPointDto> getAll() {
        return iUserRepository.getAll();
    }

    @Override
    public List<BonusPointDto> getBonusPointsByTime(LocalDate startDate, LocalDate endDate) {
        return iUserRepository.getBonusPointsByTime(startDate, endDate);
    }
}
