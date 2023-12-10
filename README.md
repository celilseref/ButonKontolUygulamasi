# ButonKontolUygulamasi
# Buton Kontol Uygulamasi

 ## Projenin Amacı
Bu proje, Java dilinde kullanıcı arayüzü (GUI) tasarımı için temel bir örnek sunar. Özellikle, özelleştirilmiş butonlar aracılığıyla bir kullanıcı arayüzü oluşturur. Bu butonlar, GraphQL şemalarına bağlı olarak durumlarını değiştirme yeteneğine sahiptir. Bu örnek proje, basit bir grafik arayüz tasarımı ve olay işleme mekanizması sunarak, Java'da GUI uygulamalarını geliştirmek için temel bir anlayış sağlar.

## Kullanılma Nedeni
Bu proje, Java dilinde GUI programlama becerilerini öğrenmek ve geliştirmek isteyen geliştiricilere yöneliktir. Aynı zamanda, temel GUI bileşenleri üzerinde nasıl özelleştirmeler yapılacağını ve olayları nasıl ele alınacağını anlamak isteyenler için uygundur. Proje, özellikle Swing veya JavaFX gibi GUI kütüphaneleri kullanılarak temel grafik arayüz tasarımı ve olay işleme kavramlarını uygulamak için bir başlangıç noktası sunar.
## Uygulamanın Özellikleri 
- Her buton, özel olarak oluşturulmuş `ButonOlustur` sınıfından türetilir.
- Her buton, GraphQL şemasını saklayabilme özelliğine sahiptir.
- Butonlar, basıldığında GraphQL şemasında bir mutation çalıştırma yeteneğine sahiptir.
- Butonlar, aktif ve pasif durumlarını göstermek için farklı renk ve simgeleri kullanır.
- Bir butona tıklandığında, diğer butonların durumları güncellenir; önceki butonlar pasif hale gelir, sadece tıklanan buton aktif olur.
- Eğer ekranda örneğin 1. Butona basıldıktansonra  2.  Ve  daha  sonraki  herhangi  bir sıradaki basılmamış butona basıldığında onlarda aktif renk ve aktif simge gösterecektir. Ancak 1. Butona tekrar basılırsa önceden basılmış butonlar(varsa) pasif hale gelecektir ve sadece tekrar basılan buton aktif olacaktır.
## Nasıl Kullanılır?
- Projeyi yerel bilgisayarınıza klonlayın, bir Java IDE'sinde açın ve `ButonOlustur` sınıfını inceleyerek, main metoduyla ilgili örnekleri çalıştırarak projeyi anlamaya başlayabilirsiniz.
## Kullanım Alanları
  Bu tür bir proje, aşağıdaki kullanım alanlarına uygun olabilir:
- GUI programlamaya yeni başlayan geliştiricilerin eğitimi ve öğrenimi için örnek bir proje.
- Temel GUI becerilerini geliştirmek isteyen geliştiricilerin pratik yapması için bir temel proje.
- Java dilindeki GUI kütüphaneleri ile çalışmak isteyenlerin başlangıç noktası.
- Özelleştirilmiş butonlar gibi özel grafik bileşenlerinin nasıl oluşturulacağını ve kullanılacağını anlamak isteyenler için bir referans.
- Bu proje, kullanıcı arayüzü tasarımı ve olay işleme konularında temel bir anlayış kazanmak isteyen Java geliştiricileri için faydalı olabilir.

## GraphQL Nedir?
GraphQL, API'ler için açık kaynaklı bir veri sorgulama ve işleme dili ve bu sorgularını ve mutastonlarını yerine getirmek için yazılmış uygulamalardır.
Facebook tarafından geliştirilmiştir ve 2015 yılında ilk kez açık kaynak olarak duyurulmuştur. GraphQL, istemcinin ihtiyaç duyduğu veriyi belirleyebilmesine ve yalnızca bu veriyi alabilmesine olanak tanıyan esnek bir yapı sunar.

## GraphQL Avantajları:
- Esnek ve Özelleştirilebilir:İstemciler, ihtiyaçlarına göre özelleştirilebilen esnek sorgular yapabilir.
- Tek Bir Endpoint:GraphQL'de tek bir endpoint bulunur, bu da istemcilerin farklı veri ihtiyaçlarını tek bir yerden karşılamasına olanak tanır.
- İhtiyaca Göre Veri Alımı:İstemci, yalnızca ihtiyacı olan verileri alabilir, aşırı veri transferini önler.
- İlişkisel Veri Yönetimi:GraphQL, ilişkisel veritabanları ve modelleri ile etkileşimi kolaylaştırır.
- Canlı Sorgular (Subscriptions):GraphQL, canlı sorgular aracılığıyla gerçek zamanlı veri güncellemelerini destekler.
## GraphQL Dezavantajları:
- Öğrenme Eğrisi:GraphQL, yeni geliştiriciler için öğrenmesi zaman alabilir, özellikle REST'ten farklı bir yaklaşım sunar.
- Güvenlik:Kullanıcıların kendi sorgularını oluşturmasına olanak tanıdığı için güvenlik sorunlarına yol açabilir.
- Karmaşıklık ve Performans:Çok karmaşık sorgular yazmak ve performansı yönetmek zor olabilir.
- İşlemeyi Desteklemeyen Bazı Araçlar:GraphQL'i desteklemeyen bazı araçlar ve kütüphaneler olabilir.
- REST ile Uyum Sorunları:Sistemler arasında geçiş sürecini yönetmek, özellikle REST tabanlı sistemlerle uyum sağlamak bazen zor olabilir.


## Uygulama Çalıştırılması ve Süreci:
1- Butonların Basılmamış Hali:
![ss2](https://github.com/ayseguldal/ButonKontolUygulamasi/assets/118614193/ba36d860-465a-4b6f-b544-fc4da59290f3)
2- Herhangi Bir Buton Aktif Olduğundaki Durum:
![ss1](https://github.com/ayseguldal/ButonKontolUygulamasi/assets/118614193/b37c2d22-f8bb-44f3-ab75-fc32d0c31882)
3- Tüm butonların pasif olduğu durum:
![ss3](https://github.com/ayseguldal/ButonKontolUygulamasi/assets/118614193/a5ae7714-14bc-4ab0-ae98-09bf3f7e62be)
3- Her Aktifleştirilen Butonun GraphQL Adresi:
![ss4](https://github.com/ayseguldal/ButonKontolUygulamasi/assets/118614193/ec4540b1-a210-4419-ba39-c1701937cf86)


 
