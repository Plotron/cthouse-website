package pl.cthouse.www.demo.service;

import pl.cthouse.www.demo.model.LoyaltyPointsSum;
import pl.cthouse.www.demo.repository.LoyaltyPointsSumRepository;

import java.util.List;
import java.util.Optional;

public interface LoyaltyPointsSumService {

    Optional<LoyaltyPointsSum> getLoyaltyPointsSum(Long id);

    List<LoyaltyPointsSum> getAllLoyaltyPointsSumsList();
}
