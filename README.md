# Foriba Bulut e-Defter API Java Test Projesi

Bu proje Foriba Bulut e-Defter API web servis metodlarının nasıl kullanılması gerektiği ile ilgili örnek olması için oluşturulmuştur. Proje yalnızca 
test sisteminde çalışmakta ve web servislere bağlantı ayarları da projede bulunmaktadır.

 **e-Defter Ürünü İçin:**

- Defter kaynak dosyasının sisteme yüklenmesi
- Yüklenen defterlerin statülerinin sorgulanması


işlemleri yapılmaktadır.

Web servis erişim güvenliği basic authentication ile sağlanmaktadır. Web servisleri kullanacak istemcilerin Foriba Bulut e-Defter Portal test sistemi
kullanıcı adı ve şifresine sahip olmaları gerekmektedir. Bu kullanıcı adı ve şifre ile web service doğrulaması gerçekleştirilebilir.


# Kurulum

Bu proje Eclipse geliştirme ortamında Java yazılım dili standartları ile oluşturulmuştur.

foriba-eledger-cloud-client-app projesinin test edilmesi:

- İndirilen proje File -> Open Project from File System.. üzerinden açılır.
- save methodu için örnek ziplenmiş defter verisi input klasörü altında bulunmaktadır.
- Foriba Bulut e-Defter Portal test sistemi kullanıcı adı ve şifresi, proje içerisindeki username ve password alanlarına girilmelidir.
- Application.java içerisinde bulunan main methodu ile birlikte gerekli bilgiler girilerek save ve status WS methodları test edilebilir.



# Lisans
  
Foriba Bulut API Java Test Projesi, **Foriba R&D** ekibi tarafından API kullanımını anlatmak için hazırlanmıştır, izinsiz olarak ticari uygulamalarda kullanılması yasaktır.  
