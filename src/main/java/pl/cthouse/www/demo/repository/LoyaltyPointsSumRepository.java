package pl.cthouse.www.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.cthouse.www.demo.model.LoyaltyPointsSum;


@Repository
public interface LoyaltyPointsSumRepository extends JpaRepository<LoyaltyPointsSum, Long> {

    LoyaltyPointsSum findLoyaltyPointsSumById(Long id);
}
