package pl.cthouse.www.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.cthouse.www.demo.model.users.customer.LoyaltyEvent;

import java.util.List;
import java.util.Optional;

public interface LoyaltyEventService {

    Optional<LoyaltyEvent> getById(Long id);

    Optional<Page<LoyaltyEvent>> getAllLoyaltyEvents(Pageable pageable);

    List<LoyaltyEvent> getAllLoyaltyEventsList();

}
