package application;


public class Produit {

    private String nom;
    private double prix;
    private int qte;
    private String pays;
    private String date;
    private String remarque;

    public Produit() {
    }

    public Produit(String nom, double prix, int qte, String pays, String date, String remarque) {
	this.nom = nom;
	this.prix = prix;
	this.qte = qte;
	this.pays = pays;
	this.date = date;
	this.remarque = remarque;
    }

    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public double getPrix() {
        return prix;
    }


    public void setPrix(double prix) {
        this.prix = prix;
    }


    public int getQte() {
        return qte;
    }


    public void setQte(int qte) {
        this.qte = qte;
    }


    public String getPays() {
        return pays;
    }


    public void setPays(String pays) {
        this.pays = pays;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getRemarque() {
        return remarque;
    }


    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }


    @Override
    public String toString() {
	return "Produit [nom=" + nom + ", prix=" + prix + ", qte=" + qte + ", pays=" + pays + ", date=" + date
		+ ", remarque=" + remarque + "]";
    }
    
    
    

}