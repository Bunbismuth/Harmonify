package com.harmonify.backspring.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;

@Entity
@Data
@Table(name = "musicas")
public class Musica {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_musica")
  private Long id;

  @Column(length = 20, nullable = false)
  private String nome;

  @Column(length = 20, nullable = false)
  private String artista;

  @Column(length = 20, nullable = false)
  private String genero;

  @Column(nullable = false)
  private int duracaoSegundos;

  @Column(name = "data_de_lancamento", nullable = false)
  private Date lancamento;

  private String foto;
}
