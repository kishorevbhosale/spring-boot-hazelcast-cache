package com.hazelcast.cache.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
@JsonDeserialize(builder = FormOptionDTO.FormOptionDTOBuilder.class)
public class FormOptionDTO {

    private final String value;
    private final String label;

    public FormOptionDTO(String value, String label) {
        this.value = value;
        this.label = label;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class FormOptionDTOBuilder {
    }
}
