public class Pelanggan {

    String nama2;
    int id2;
    int no_hp;
    String alamat1;
    int no_ruang;

    protected void check_member(){
        System.out.println("Membership tipe");
    }
    public void harga(){
        System.out.println("Harga tiap membership");
    }


    public String getNama2() {
        return nama2;
    }

    public void setNama2(String nama2) {
        this.nama2 = nama2;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }



    public int getNo_ruang() {
        return no_ruang;
    }

    public void setNo_ruang(int no_ruang) {
        this.no_ruang = no_ruang;
    }
}
