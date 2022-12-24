public class Membership extends Pelanggan {
        int tipe;


    @Override
    public void check_member(){
        System.out.println("Membership tipe biasa");
        System.out.println("Membership tipe premium");
        System.out.println("Membership tipe VIP");
    }
    @Override
    public void harga(){
        System.out.println("Harga membersip biasa 200000/bulan");
        System.out.println("Harga membersip biasa 600000/bulan");
        System.out.println("Harga membersip biasa 2000000/bulan");
    }

    public int getTipe() {
        return tipe;
    }

    public void setTipe(int tipe) {
        this.tipe = tipe;
    }
}
