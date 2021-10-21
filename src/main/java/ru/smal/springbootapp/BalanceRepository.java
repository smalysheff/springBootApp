package ru.smal.springbootapp;

import lombok.val;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BalanceRepository {

    private final Map<Long, BigDecimal> storage = new HashMap<>(Map.of(1L, BigDecimal.valueOf(100)));

    public BigDecimal getBalanceForId(Long accountId) {
        return storage.get(accountId);
    }

//    public BigDecimal save(Long to, BigDecimal amount) {
//
//    }

    public void save(Long id, BigDecimal amount) {
        storage.put(id, amount);
    }
}
