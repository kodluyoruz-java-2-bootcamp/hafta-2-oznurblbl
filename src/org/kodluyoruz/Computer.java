package org.kodluyoruz;

/**
 * Bu sınıf bir bilgisayarı temsil eder.
 * Bilgisayarın beş adet donamımı vardır:
 *      - Anakart
 *      - CPU
 *      - RAM
 *      - SSD
 *      - Ekran kartı
 *
 * TODO Bu alanların getter ve setter metotlarını oluşturun.
 */
public class Computer
{

    /**
     * anakart
     */
    private Hardware motherboard;

    /**
     * işlemci
     */
    private Hardware cpu;

    /**
     * RAM
     */
    private Hardware ram;

    /**
     * SSD
     * İsteğe bağlı: Her bilgisayarda SSD olmayabilir
     */
    private Hardware ssd;

    /**
     * ekran kartı
     * İsteğe bağlı: Her bilgisayarda ekran kartı olmayabilir
     */
    private Hardware gpu;



    public double getTotalPrice()
    {
        // Bu metot bilgisayarın donanımlarına bakarak toplam fiyatını hesaplar.
        // TODO metodu doldurun

        return getMotherboard().getPrice()+
                getCpu().getPrice()+
                getRam().getPrice()+
                getGpu().getPrice()+
                getSsd().getPrice();
    }

    public int getTotalPower()
    {
        // Bu metot bilgisayarın donanımlarına bakarak toplamda ne kadar güç tüketeceğini hesaplar.
        // TODO metodu doldurun
        return getMotherboard().getPower()+
                getCpu().getPower()+
                getRam().getPower()+
                getGpu().getPower()+
                getSsd().getPower()
                ;
    }

    public Hardware getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Hardware motherboard) {
        this.motherboard = motherboard;
    }

    public Hardware getCpu() {
        return cpu;
    }

    public void setCpu(Hardware cpu) {
        this.cpu = cpu;
    }

    public Hardware getRam() {
        return ram;
    }

    public void setRam(Hardware ram) {
        this.ram = ram;
    }

    public Hardware getSsd() {
        return ssd;
    }

    public void setSsd(Hardware ssd) {
        this.ssd = ssd;
    }

    public Hardware getGpu() {
        return gpu;
    }

    public void setGpu(Hardware gpu) {
        this.gpu = gpu;
    }
}
