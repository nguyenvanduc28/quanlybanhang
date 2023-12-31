package com.sapo.salemanagement.dto.auth;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NonNull;

@Getter
public class VerifyTokenRequest {

    @NotNull
    private String token;
}
