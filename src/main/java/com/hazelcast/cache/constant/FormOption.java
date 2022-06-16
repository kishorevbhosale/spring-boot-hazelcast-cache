package com.hazelcast.cache.constant;

import com.hazelcast.cache.dto.FormOptionDTO;

public interface FormOption {
    String name();

    String getDescription();

    default FormOptionDTO toDTO() {
        return new FormOptionDTO(name(), getDescription());
    }
}
