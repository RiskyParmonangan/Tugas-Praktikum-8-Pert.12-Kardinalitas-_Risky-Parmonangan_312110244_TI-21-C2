public class Main{
    public static void main(String[] args){
        Customer RiskyRingo = new Customer();
        RiskyRingo.nama = "Risky PSR";
        RiskyRingo.alamat = "Aster";
        
        Order Pesawat = new Order();
        
        Pesawat.date = 2023;
        Pesawat.status = "Pesawat Tempur";
        
        Payment Pesawat_Tempur = new Payment();
        
        Pesawat_Tempur.jumlah = 5;
    }  
}