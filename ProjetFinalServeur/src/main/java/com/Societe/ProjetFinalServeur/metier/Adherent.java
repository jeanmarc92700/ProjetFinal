package com.Societe.ProjetFinalServeur.metier;

import java.util.Date;

public class Adherent {

	private int id;
	private String nom;
	private String prenom;
	private String numTel;
	private Date dateIns;
	private String Ville;
	private int codePostal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public Date getDateIns() {
		return dateIns;
	}
	public void setDateIns(Date dateIns) {
		this.dateIns = dateIns;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	@Override
	public String toString() {
		return "Adherent [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", numTel=" + numTel + ", dateIns="
				+ dateIns + ", Ville=" + Ville + ", codePostal=" + codePostal + "]";
	}
	
	
}
