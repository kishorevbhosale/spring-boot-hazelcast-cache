package com.hazelcast.cache.controller;

import com.hazelcast.cache.dto.KeyValueListDTO;
import com.hazelcast.cache.dto.KeyValueListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/key-value/api")
@RequiredArgsConstructor
public class KeyValueListController {
    private final KeyValueListMapper keyValueListMapper;

    @GetMapping(value = "/key-value-lists")
    public List<KeyValueListDTO> findAllKeyValues() {
        return keyValueListMapper.getValues();
    }
}