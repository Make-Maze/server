package com.tutorial.jwtsecurity.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name = "map")
@Entity
public class Map {

    @Id
    @Column(name = "map_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "LONGTEXT")
    private String content;

    private String mapName;

    private String mapCode;

    private String userName;

    private String img;

    @Builder
    public Map(String content, String mapName, String mapCode, String userName, String img) {
        this.img = img;
        this.mapCode = mapCode;
        this.userName = userName;
        this.content = content;
        this.mapName = mapName;
    }

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
