package com.netasystem.recetario.main;

import java.util.ArrayList;
import java.util.List;

import com.netasystem.recetario.contenido.Recetario;
import com.netasystem.recetario.contenido.Recetas;

public class MasterChef {

	public static void main(String[] args) {
		
		
		List<String> ingre = new ArrayList<String>();
		ingre.add("ingrediente 1");
		ingre.add("ingrediente 2");
		ingre.add("ingrediente 3");
		ingre.add("ingrediente 4");
		
		List<String> ingre2 = new ArrayList<String>();
		ingre2.add("ingrediente 1");
		ingre2.add("ingrediente 2");
		ingre2.add("ingrediente 3");
		ingre2.add("ingrediente 4");
		
		List<Recetas> recetas = new ArrayList<>();
		
		Recetas r1 = new Recetas ("jesus","pan",ingre,"asi se hace");
		Recetas r2 = new Recetas ("jesus","pan casero",ingre2,"asi se hace");
		
		
		
		
		recetas.add(r1);
		recetas.add(r2);
		
		
		for(Object o : recetas) {
			
			System.out.println(o);
		}
		
		
		
		

	}

}
