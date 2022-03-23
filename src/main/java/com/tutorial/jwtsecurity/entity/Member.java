package com.tutorial.jwtsecurity.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name = "member")
@Entity
public class Member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String img;

    private String name;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Builder
    public Member(String email, String password, String img, String name, Authority authority) {
        this.email = email;
        this.password = password;
        this.authority = authority;
        this.img = img;
        this.name = name;
    }
}
