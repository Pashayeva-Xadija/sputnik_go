package com.sputnikgo.dto.payment;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class DeleteCardRequest {
    @NotNull
    @Positive
    private Long cardId;
}