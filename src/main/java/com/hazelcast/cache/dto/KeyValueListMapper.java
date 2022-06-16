package com.hazelcast.cache.dto;

import com.hazelcast.cache.constant.KeyValueList;
import com.hazelcast.cache.constant.enums.Number;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
public class KeyValueListMapper {

    private static final List<KeyValueList> KEY_VALUE_LISTS = List.of(
            Number.asKeyValueList()
    );

    @Cacheable(value = "key-val")
    public List<KeyValueListDTO> getValues() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Getting list from enum object");
        return KEY_VALUE_LISTS.stream()
                .map(KeyValueList::toDTO)
                .collect(Collectors.toList());
    }
}