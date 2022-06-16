package com.hazelcast.cache.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class KeyValueListDTO {
    private final String code;
    private final String description;
    private final List<FormOptionDTO> formOptionList;
}