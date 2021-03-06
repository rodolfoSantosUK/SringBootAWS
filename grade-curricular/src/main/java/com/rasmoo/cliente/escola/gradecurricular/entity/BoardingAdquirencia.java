package com.rasmoo.cliente.escola.gradecurricular.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "BOARDING_ADQUIRENCIA")
public class BoardingAdquirencia {

    @Id
    private Long id;

    @OneToOne
    private Usuario usuario;

    private String codCliente;

    private LocalDate dtAbrangencia;

    private String bodyJson;

    private Integer idRede;

}
