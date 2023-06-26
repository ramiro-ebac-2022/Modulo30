package com.zavala.dao;

import com.zavala.dao.generic.IGenericDAO;
import com.zavala.domain.Venda;
import com.zavala.exceptions.DAOException;
import com.zavala.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}