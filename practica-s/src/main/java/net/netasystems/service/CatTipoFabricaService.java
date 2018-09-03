package net.netasystems.service;

import java.sql.SQLException;
import java.util.List;

import net.netasystems.dao.CatTipoFabricaDAO;
import net.netasystems.domain.CatTipoFabrica;

/**
 * @author Jesus Leyton
 *
 */
public class CatTipoFabricaService {
	private CatTipoFabricaDAO dao;
	
	/**
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public CatTipoFabricaService() throws ClassNotFoundException, SQLException {
		dao = new CatTipoFabricaDAO();
	}
	
	/**
	 * @throws SQLException
	 */
	public void close() throws SQLException {
		dao.destroy();
	}
	
	/**
	 * @return
	 * @throws SQLException
	 */
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		return dao.getAllRecords();
}

}
