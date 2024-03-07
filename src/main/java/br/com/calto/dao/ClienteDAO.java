
package br.com.calto.dao;

import br.com.calto.dao.generic.GenericDAO;
import br.com.calto.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
