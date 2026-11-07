public class Main {
    public static void main(String[] args) {
        Raja rajaBaik = new Raja("RJ-01", "Raja Baik");
        Ratu ratuBaik = new Ratu("RT-01", "Ratu Baik");
        Raja rajaJahat = new Raja("RJ-02", "Raja Jahat", 90, 40);
        Ratu ratuJahat = new Ratu("RT-02", "Ratu Jahat", 80, 50);

        rajaBaik.tampilkanInfo();
        ratuBaik.tampilkanInfo();
        rajaJahat.tampilkanInfo();
        ratuJahat.tampilkanInfo();
        System.out.println("HP Maksimum: " + Karakter.HP_MAKSIMUM);

        Penyerang p1 = rajaJahat;
        Penyerang p2 = ratuJahat;
        p1.serang(rajaBaik);
        p2.serang(ratuBaik);
        ratuBaik.serang(ratuJahat);

        Penyembuh penyembuh = ratuBaik;
        penyembuh.sembuhkan(rajaBaik);

        rajaBaik.gunakanSkill();
        rajaBaik.gunakanSkill();
        rajaBaik.gunakanSkill();
        ratuJahat.gunakanSkill();
        ratuJahat.gunakanSkill();

        System.out.println("Raja Jahat hidup? " + rajaJahat.isHidup());
    }
}
