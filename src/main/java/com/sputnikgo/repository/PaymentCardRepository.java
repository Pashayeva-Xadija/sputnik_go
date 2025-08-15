package com.sputnikgo.repository;

import com.sputnikgo.model.payment.PaymentCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PaymentCardRepository extends JpaRepository<PaymentCard, Long> {
    List<PaymentCard> findAllByUserId(Long userId);
    boolean existsByToken(String token);
    Optional<PaymentCard> findByUserIdAndIsDefaultTrue(Long userId);
    @Modifying
    @Query("update PaymentCard pc set pc.isDefault = false where pc.user.id = :userId")
    void clearDefaultForUser(@Param("userId") Long userId);

}
