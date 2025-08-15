package com.sputnikgo.dto.contact;

import com.sputnikgo.enums.ContactCategory;
import com.sputnikgo.enums.Language;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateTrustedContactRequest {
    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Pattern(regexp = "^\\+?[0-9]{7,15}$")
    private String phone;

    @NotNull
    private ContactCategory category;

    @NotNull
    private Language language;
}