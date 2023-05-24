package org.serratec.sales_manager_grupo5.repository;

import org.serratec.sales_manager_grupo5.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

}
