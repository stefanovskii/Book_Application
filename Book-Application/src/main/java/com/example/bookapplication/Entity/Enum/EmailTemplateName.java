package com.example.bookapplication.Entity.Enum;

import lombok.Getter;

@Getter
public enum EmailTemplateName {
    ACTIVATE_ACCOUNT("activate_account");
    private String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
