
package br.com.calto.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_PRODUTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto implements Persistente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
	@SequenceGenerator(name = "prod_seq", sequenceName = "sq_produto", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column(name = "codigo", nullable = false, length = 10, unique = true)
	private String codigo;

	@Column(name = "NOME", nullable = false, length = 50)
	private String nome;

	@Column(name = "DESCRICAO", nullable = false, length = 50)
	private String descricao;

	@Column(name = "valor", nullable = false)
	private BigDecimal valor;

}
