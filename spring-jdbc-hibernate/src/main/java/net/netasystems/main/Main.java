package net.netasystems.main;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.netasystems.dao.AreaDAO;
import net.netasystems.dao.CatTipoFabricaDAO;
import net.netasystems.persistence.entities.Area;
import net.netasystems.persistence.entities.CatTipoFabrica;



/**
 *Clase controlados CRUD sprig/hibernate
 * @author Neta Systems / Jose de Jesus Leyton Hernandez
 *
 * @version
 * 10/09/2018
 */
public class Main {

	/**
	 * Metodo
	 * <p></p>
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		//tabla CatTipoFAbrica
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CatTipoFabricaDAO daoF = ctx.getBean(CatTipoFabricaDAO.class);
		//System.out.println(daoF.findAll());
		List<CatTipoFabrica> listaFabrica = daoF.findAll();
		System.out.println("Lista de cattipofabrica obtenida");
		if (listaFabrica == null || listaFabrica.isEmpty()) {
			System.out.println("No hay areas!");
		} else {
			listaFabrica.forEach(f -> System.out.println(f));
		}
		
		
		CatTipoFabrica nuevoElemento =new CatTipoFabrica();
		nuevoElemento.setIdCatTipoFabrica(new BigDecimal(105));
		nuevoElemento.setIdUsuario(new BigDecimal(1));
		nuevoElemento.setNombre("PRUEBA HIBERNATE 2");
		nuevoElemento.setStatus(new Character('A'));
		nuevoElemento.setFechaModificacion(new Date(System.currentTimeMillis()));
		daoF.insert(nuevoElemento);
		
		CatTipoFabrica cambioElemento =new CatTipoFabrica();
		cambioElemento.setIdCatTipoFabrica(new BigDecimal(100));
		cambioElemento.setIdUsuario(new BigDecimal(1));
		cambioElemento.setNombre("PRUEBA");
		cambioElemento.setStatus(new Character('A'));
		cambioElemento.setFechaModificacion(new Date(System.currentTimeMillis()));
		daoF.updateNombre(cambioElemento);
		
		CatTipoFabrica eliminaElemento =new CatTipoFabrica();
		eliminaElemento.setIdCatTipoFabrica(new BigDecimal(102));
		daoF.delete(eliminaElemento);
		
		
		//tabla Area
		System.out.println("###################################");
		AreaDAO gdao = ctx.getBean(AreaDAO.class);
		List<Area> listaAreas = gdao.finAll();
		System.out.println("Lista de areas obtenida");
		if (listaAreas == null || listaAreas.isEmpty()) {
			System.out.println("No hay areas!");
		} else {
			listaAreas.forEach(c -> System.out.println(c));
		}
		
		Area garei = new Area();
		garei.setEstatus(new Character('E'));
		garei.setFechamodificacion(new Date(System.currentTimeMillis()));
		garei.setIdarea(new BigDecimal(9));
		garei.setIdusuario(new BigDecimal(1));
		garei.setNombre("SPRING_H");
		gdao.insert(garei);
		
		Area gareu = new Area();
		gareu.setEstatus(new Character('E'));
		gareu.setFechamodificacion(new Date(System.currentTimeMillis()));
		gareu.setIdarea(new BigDecimal(8));
		gareu.setIdusuario(new BigDecimal(1));
		gareu.setNombre("SPRING_E");
		gdao.updateNombre(gareu);
		
		Area area10 = new Area();
		area10.setIdarea(new BigDecimal(6));
		gdao.delete(area10);
		
		Area area8 = gdao
				.findById(new BigDecimal(8));
		System.out.println(area8);
		

	}

}
