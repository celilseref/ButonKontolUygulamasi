import javax.swing.*;
import java.awt.*;

public class ButonOlustur {
    private final Color pasifRenk = Color.RED; // Pasi butonların rengi tanımlandı.
    public JButton butonOlustur() {
        JButton buton = new JButton();
        buton.setBackground(pasifRenk);//Oluşturulan butonların hepsi ilk baş pasiftir.
//GraphQL Şeması örneği verildi.
        buton.putClientProperty("GraphQLSemaAdresi", "https://example.com/graphql");
        buton.putClientProperty("AktifSembol", "A"); // Buton aktif edildiğinde A harfi gözükür.
        // Buton pasif edildiğinde P harfi gözükür
        buton.putClientProperty("PasifSembol", "P");

        return buton; // Oluşturulan buton döndürülür.


    }
}