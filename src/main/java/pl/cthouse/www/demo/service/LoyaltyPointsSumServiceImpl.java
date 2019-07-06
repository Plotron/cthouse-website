package pl.cthouse.www.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cthouse.www.demo.model.LoyaltyPointsSum;
import pl.cthouse.www.demo.repository.LoyaltyPointsSumRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LoyaltyPointsSumServiceImpl implements LoyaltyPointsSumService {

    @Autowired
    private LoyaltyPointsSumRepository loyaltyPointsSumRepository;

    @Override
    public Optional<LoyaltyPointsSum> getLoyaltyPointsSum(Long id) {
        return Optional.ofNullable(loyaltyPointsSumRepository.findLoyaltyPointsSumById(id));
    }

    @Override
    public List<LoyaltyPointsSum> getAllLoyaltyPointsSumsList() {
        return loyaltyPointsSumRepository.findAll();
    }
}
