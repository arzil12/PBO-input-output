public class Bayar extends Pembayaran {
    int bulan;
    int harga;


  //  public Bayar(double bulan, double harga) {
   //     this.bulan = bulan;
    //    this.harga = harga;

   // }

    @Override
    double getMoney(){
        return bulan*harga;
    };
    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getBayar() {
        return harga;
    }

    public void setBayar(int bayar) {
        this.harga = bayar;
    }
}

