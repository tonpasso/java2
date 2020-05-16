package br.com.ericmoraess.dao;

import java.util.Set;
import br.com.ericmoraess.entidade.Hospital;

public interface HospitalDAO {
	Set<Hospital> getAllHospitals();
	boolean insertHospital();
	boolean updateHospital();
	boolean deleteHospital();
}
