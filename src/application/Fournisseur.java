package application;

public class Fournisseur {

	private String nomF;
	private String adresseF;
	private int telF;
	private String emailF;
	
	public Fournisseur(String nomF, String adresseF, int telF, String emailF) {
		
		this.nomF = nomF;
		this.adresseF = adresseF;
		this.telF = telF;
		this.emailF = emailF;
	}

	

	public String getNomF() {
		return nomF;
	}



	public void setNomF(String nomF) {
		this.nomF = nomF;
	}



	public String getAdresseF() {
		return adresseF;
	}



	public void setAdresseF(String adresseF) {
		this.adresseF = adresseF;
	}



	public int getTelF() {
		return telF;
	}



	public void setTelF(int telephoneF) {
		this.telF = telephoneF;
	}



	public String getEmailF() {
		return emailF;
	}



	public void setEmailF(String emailF) {
		this.emailF = emailF;
	}



	@Override
	public String toString() {
		return "Fournisseur [nom=" + nomF + ", adresse=" + adresseF + ", tel=" + telF + ", email=" + emailF+"]";
		// TODO Auto-generated method stub
	}


	

	
	
	
}