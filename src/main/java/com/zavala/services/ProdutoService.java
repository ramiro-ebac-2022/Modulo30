package com.zavala.services;

import com.zavala.dao.IProdutoDAO;
import com.zavala.domain.Produto;
import com.zavala.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}