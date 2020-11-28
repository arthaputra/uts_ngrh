package utsv1.oop;

public class Pegawai {
    public String nama;
    public double gaji;
public Pegawai(String Nama, double Gaji) {
    nama = Nama;
    gaji = Gaji;
}

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    double gajiBersih() {
        return gaji;
    }
}
