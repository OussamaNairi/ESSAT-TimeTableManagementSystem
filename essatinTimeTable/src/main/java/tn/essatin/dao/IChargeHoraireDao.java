package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.ChargeHoraire;

public interface IChargeHoraireDao {
	public List<ChargeHoraire> getAllChargeHoraires();
	public ChargeHoraire getChargeHoraire(int id);
	public void addChargeHoraire(ChargeHoraire c);
	public void updateChargeHoraire(ChargeHoraire c);
	public void deleteChargeHoraire(int id);

}
