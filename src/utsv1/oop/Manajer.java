package utsv1.oop;

public class Manajer {
    double tunjanganLemburPerJam;
    double overtime;
    String nama;
    double gaji;

    public Manajer(String Nama, double Gaji, double tunjangan) {
        tunjanganLemburPerJam = tunjangan;
        nama = Nama;
        gaji = Gaji;
    }

    public double getTunjanganLemburPerJam() {
        return tunjanganLemburPerJam;
    }

    public void setTunjanganLemburPerJam(double tunjangan) {
        this.tunjanganLemburPerJam = tunjangan;
    }
    double gajiBersih(){
        return gaji + getTunjanganLemburPerJam();
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }
}
