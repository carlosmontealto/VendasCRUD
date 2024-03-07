
package br.com.calto.dao;

import br.com.calto.dao.generic.GenericDAO;
import br.com.calto.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}

}
