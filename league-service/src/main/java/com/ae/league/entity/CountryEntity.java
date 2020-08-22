package com.ae.league.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "countries")
@Data
@Builder @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class CountryEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_country")
    private Long id;

    private String code;

    private String name;

    @ToString.Exclude
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CityEntity> cities;

}
