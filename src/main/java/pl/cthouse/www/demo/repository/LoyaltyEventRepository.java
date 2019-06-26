package pl.cthouse.www.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.cthouse.www.demo.model.LoyaltyEvent;

@Repository
public interface LoyaltyEventRepository extends JpaRepository<LoyaltyEvent, Long> {

}
