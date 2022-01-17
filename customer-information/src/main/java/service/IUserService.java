package service;

import Dto.BonusPointDto;
import model.User;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<User> findById(Long id);
    void updateUser(User user);
    List<BonusPointDto> getAll();
    List<BonusPointDto> getBonusPointsByTime(LocalDate startDate, LocalDate endDate);
}
