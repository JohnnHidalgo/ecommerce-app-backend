package com.project.biasbackend.dto;

import com.project.biasbackend.domain.Persona;

public class PersonaDto {
    private String nicknameUser;
    private int password;

    public PersonaDto(Persona persona) {
        this.nicknameUser = persona.getNicknameUser();
        this.password = persona.getPassword();
    }

    public String getNicknameUser() {
        return nicknameUser;
    }

    public void setNicknameUser(String nicknameUser) {
        this.nicknameUser = nicknameUser;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
