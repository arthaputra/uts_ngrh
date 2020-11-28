package utsv1.oop;

public class Manajer {
    double tunjanganLemburPerJam;
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

    public void setTunjanganLemburPerJam(double tunjanganLemburPerJam) {
        this.tunjanganLemburPerJam = tunjanganLemburPerJam;
    }
    double gajiBersih(){
        return gaji + tunjanganLemburPerJam*overtime;
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }
}
