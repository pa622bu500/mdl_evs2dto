package org.pabuff.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class QueryCredDto {

        private final String username;
        @JsonProperty("user_id")
        private final String userId;

//        private String password;
}
