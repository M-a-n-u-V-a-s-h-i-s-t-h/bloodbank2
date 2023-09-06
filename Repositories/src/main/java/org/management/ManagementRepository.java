package org.management;
import org.management.Entity.ManagementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface ManagementRepository extends JpaRepository<ManagementEntity, Integer>
{
    Optional<ManagementEntity> findByName(String username);
}
