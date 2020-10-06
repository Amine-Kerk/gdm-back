package dev.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Nature {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nom;

	private boolean missionFacturee;

	private boolean versementPrime;

	private BigDecimal tjm;

	private BigDecimal pourcentagePrime;

	private BigDecimal plafond;

	private boolean plafondDepassable;

	@Column(nullable = false)
	private LocalDate debutValidite;

	private LocalDate finValidite;

	@OneToMany
	private List<Mission> missions;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the missionFacturee
	 */
	public boolean isMissionFacturee() {
		return missionFacturee;
	}

	/**
	 * @param missionFacturee the missionFacturee to set
	 */
	public void setMissionFacturee(boolean missionFacturee) {
		this.missionFacturee = missionFacturee;
	}

	/**
	 * @return the versementPrime
	 */
	public boolean isVersementPrime() {
		return versementPrime;
	}

	/**
	 * @param versementPrime the versementPrime to set
	 */
	public void setVersementPrime(boolean versementPrime) {
		this.versementPrime = versementPrime;
	}

	/**
	 * @return the tjm
	 */
	public BigDecimal getTjm() {
		return tjm;
	}

	/**
	 * @param tjm the tjm to set
	 */
	public void setTjm(BigDecimal tjm) {
		this.tjm = tjm;
	}

	/**
	 * @return the pourcentagePrime
	 */
	public BigDecimal getPourcentagePrime() {
		return pourcentagePrime;
	}

	/**
	 * @param pourcentagePrime the pourcentagePrime to set
	 */
	public void setPourcentagePrime(BigDecimal pourcentagePrime) {
		this.pourcentagePrime = pourcentagePrime;
	}

	/**
	 * @return the plafond
	 */
	public BigDecimal getPlafond() {
		return plafond;
	}

	/**
	 * @param plafond the plafond to set
	 */
	public void setPlafond(BigDecimal plafond) {
		this.plafond = plafond;
	}

	/**
	 * @return the plafondDepassable
	 */
	public boolean isPlafondDepassable() {
		return plafondDepassable;
	}

	/**
	 * @param plafondDepassable the plafondDepassable to set
	 */
	public void setPlafondDepassable(boolean plafondDepassable) {
		this.plafondDepassable = plafondDepassable;
	}

	/**
	 * @return the debutValidite
	 */
	public LocalDate getDebutValidite() {
		return debutValidite;
	}

	/**
	 * @param debutValidite the debutValidite to set
	 */
	public void setDebutValidite(LocalDate debutValidite) {
		this.debutValidite = debutValidite;
	}

	/**
	 * @return the finValidite
	 */
	public LocalDate getFinValidite() {
		return finValidite;
	}

	/**
	 * @param finValidite the finValidite to set
	 */
	public void setFinValidite(LocalDate finValidite) {
		this.finValidite = finValidite;
	}

	/**
	 * @return the missions
	 */
	public List<Mission> getMissions() {
		return missions;
	}

	/**
	 * @param missions the missions to set
	 */
	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}

}
