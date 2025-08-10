package com.sputnikgo.dto.contact;


import com.sputnikgo.enums.ContactCategory;
import lombok.Data;

@Data
public class TrustedContactDto {
    private Long id;
    private String name;
    private String phone;
    private ContactCategory category;
}
