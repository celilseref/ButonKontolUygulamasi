import javax.swing.*;
import java.awt.*;

public class PanelOlustur extends JFrame {
    /*Butonların yerleşeceği pencereyi oluşturmak için JFrame extends edildi.*/

    private JButton[][] butonlar; /*4x4 butonlar dizi şeklinde oluşturuldu*/
    private final ButonBasımı butonBasımıListener = new ButonBasımı();
    //Buton basımı sınıfını kullanmak için yapıldı.

    public PanelOlustur(){
        super("Buton Paneli");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame kapatıldı.
        setSize(400,400); //Pencerenin genişlik ve yükseklik değerleri girildi.
        setLayout(new GridLayout(4,4)); /*Butonun pencere içindeki konumu belirlendi.*/


        butonlar = new JButton[4][4];
        ButonOlustur butonOlusturucu = new ButonOlustur();//ButonOlustur sınıfına erişim için bir değişken tanımladım.


        for (int i=0 ; i<4 ; i++){ // Butonlar sırasıyla panele eklenir.
            for (int j=0 ; j<4 ; j++){
                butonlar[i][j] = butonOlusturucu.butonOlustur();
                butonlar[i][j].addActionListener(butonBasımıListener);
                add(butonlar[i][j]); // Buton elemanları kontrol edilmesi için diziye eklendi.
            }
        }

    }


}
