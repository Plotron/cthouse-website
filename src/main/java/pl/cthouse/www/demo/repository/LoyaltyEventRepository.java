package pl.cthouse.www.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.cthouse.www.demo.model.LoyaltyEvent;

public interface LoyaltyEventRepository extends JpaRepository<LoyaltyEventRepository, Long> {

}
