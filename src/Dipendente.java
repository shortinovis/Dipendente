public class Dipendente {
    private String matricola;
    private double stipendio;
    private double straordinario;

    public Dipendente(String matr, double stip, double stra){
        matricola=matr;
        stipendio=stip;
        straordinario=stra;
    }
    public  double getStipendio(){
        return stipendio;
    }
    public double paga(int ore){
        return stipendio+straordinario*ore;
    }
    public String stampa(){
        String stamp;
        stamp="numero matricola: " + matricola + " stipendio: " + stipendio +" straordianrio: " + straordinario;
        return stamp;
    }

}