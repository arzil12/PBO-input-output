public abstract class Pembayaran implements Listmember {

    String color;

    @Override
    public void DaftarMembership() {
        System.out.println("===============Tipe Membership===============");
        System.out.println("|   1. Member bulanan biasa, 300000/bulan   |");
        System.out.println("|   2. Member bulanan vip, 700000/bulan     |");
        System.out.println("|   3. Member bulanan vvip, 1000000/bulan      |");
    }

    void setColor(String color){
        this.color = color;
    }

    String getColor(){
        return this.color;
    }

    abstract double getMoney();

    }


