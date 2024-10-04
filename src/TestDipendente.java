public class TestDipendente {
    public static void main(String[] args){
        Dipendente d1=new Dipendente("00309", 1000.00, 7.5);
        System.out.println("lo stipendio è: " + d1.getStipendio());
        System.out.println("lo stipendio con straordinari è: " + d1.paga(20));
        System.out.println("le info sono: " + d1.stampa());
    }
}
