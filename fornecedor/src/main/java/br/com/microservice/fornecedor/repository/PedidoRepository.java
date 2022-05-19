package br.com.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
