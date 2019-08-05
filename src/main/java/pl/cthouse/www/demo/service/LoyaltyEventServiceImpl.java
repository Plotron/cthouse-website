package pl.cthouse.www.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.cthouse.www.demo.model.users.customer.LoyaltyEvent;
import pl.cthouse.www.demo.repository.LoyaltyEventRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LoyaltyEventServiceImpl implements LoyaltyEventService {

    @Autowired
    private LoyaltyEventRepository loyaltyEventRepository;

    @Override
    public Optional getById(Long id) {
        return Optional.ofNullable(loyaltyEventRepository.findById(id));
    }

    @Override
    public Optional<Page<LoyaltyEvent>> getAllLoyaltyEvents(Pageable pageable) {
        return Optional.empty();
    }

    @Override
    public List<LoyaltyEvent> getAllLoyaltyEventsList() {
        return loyaltyEventRepository.findAll();
    }

}
