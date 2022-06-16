package com.hazelcast.cache.constant;

import com.hazelcast.cache.dto.KeyValueListDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class KeyValueList {
    private final List<? extends FormOption> formOptions;
    private final String enumCode;
    private final String enumDescription;

    public KeyValueListDTO toDTO() {
        return KeyValueListDTO.builder()
                .code(enumCode)
                .description(enumDescription)
                .formOptionList(formOptions.stream()
                        .map(FormOption::toDTO)
                        .collect(Collectors.toList()))
                .build();
    }
}
