package utsv1.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nama;
        double gaji;
        double tunjanganLemburPerJam;
        double overtime;
        Scanner input = new Scanner(System.in);
        System.out.println(".:PEGAWAI:.");
        System.out.println("---------------------------");
        System.out.print("Inputkan Nama Pegawai : ");
        nama = input.nextLine();
        System.out.print("Inputkan Nama Pegawai : ");
        gaji = input.nextInt();
        System.out.println("---------------------------");
        Pegawai pegawai = new Pegawai(nama, gaji);
        System.out.println("Nama Pegawai : " +pegawai.getNama());
        System.out.println("Gaji Bersih Pegawai : " +pegawai.gajiBersih());

        System.out.println(".:MANAJER:.");
        System.out.println("---------------------------");
        System.out.print("Inputkan Nama Manajer : ");
        nama = input.next();
        System.out.print("Inputkan Gaji Manajer : ");
        gaji = input.nextInt();
        System.out.print("Inputkan Tunjangan Lembur Per Jam : ");
        tunjanganLemburPerJam = input.nextInt();
        System.out.print("Inputkan Lama Overtime Dalam Jam : ");
        overtime = input.nextInt();
        System.out.println("---------------------------");
        Manajer manajer = new Manajer(nama, gaji, tunjanganLemburPerJam);
        System.out.println("Nama Manajer : " +manajer.getNama());
        System.out.println("Gaji Bersih Manajer : " +manajer.gajiBersih());

    }
}
