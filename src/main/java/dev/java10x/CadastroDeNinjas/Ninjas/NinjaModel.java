package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String nome;
     @Column(unique = true)
     private String email;
     private int idade;
     //@ManyToOne um ninja tem uma unica missão
     @ManyToOne
     @JoinColumn(name = "missoees_id") //Foreing Key oou chave estrangeira
     private MissoesModel missoes;

}
