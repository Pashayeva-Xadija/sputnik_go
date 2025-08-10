package com.sputnikgo.dto.user;

import com.sputnikgo.enums.Language;
import lombok.Data;
@Data
public class UserProfileDto {
        private Long id;
        private String fullName;
        private String phone;
        private String email;
        private String avatarUrl;
        private Language language;
}
