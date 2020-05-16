package br.com.ericmoraess;

import java.util.Iterator;
import java.util.Set;

import br.com.ericmoraess.dao.HospitalDAO;
import br.com.ericmoraess.dao.HospitalDAOImp;
import br.com.ericmoraess.entidade.Hospital;

public class AplicacaoDAO {
	public static void main(String[] args) {
		HospitalDAO hospitalDAO = new HospitalDAOImp();
		
		Set retorno = hospitalDAO.getAllHospitals();
		Iterator<Hospital> itr = retorno.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next().getRazao_social());
			System.out.println(itr.next().getCnpj());
		}	
	}
}
