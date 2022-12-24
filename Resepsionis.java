public class Resepsionis extends Pelanggan{
    //untuk resepsionis
    String nama1;
    int id;
    int no_hp1;
    String lokasi;


    @Override
    public void check_member(){
        System.out.println("Membership tipe biasa");
        System.out.println("Membership tipe premium");
        System.out.println("Membership tipe VIP");
    }

    public String getNama1() {
        return nama1;
    }

    public void setNama1(String nama1) {
        this.nama1 = nama1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getNo_hp1() {
        return no_hp1;
    }

    public void setNo_hp1(int no_hp) {
        this.no_hp1 = no_hp;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}
