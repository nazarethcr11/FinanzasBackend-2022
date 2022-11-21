package com.example.finanzasbackend.app.resources.user;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UserResource {
    private Long id;
    private String names;
    private String username;
    private String password;
}
