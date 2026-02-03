# 🏰 Java Macera Oyunu (Adventure Game)

Bu proje, Java ile geliştirilmiş, metin tabanlı (console-based) bir macera oyunudur. **Nesne Yönelimli Programlama (OOP)** prensipleri kullanılarak tasarlanan bu oyunda, oyuncular farklı mekanlarda gezinir, canavarlarla savaşır, ganimet toplar ve hayatta kalmaya çalışır.

## 🎯 Proje Hakkında

Oyuncu, oyuna belirli bir karakter seçerek başlar. Her karakterin (Samuray, Okçu, Şövalye vb.) kendine has hasar, sağlık ve para değerleri vardır. Amaç, haritadaki güvenli bölgeleri ve savaş alanlarını stratejik bir şekilde kullanarak karakteri güçlendirmek ve oyunu başarıyla tamamlamaktır.

## 🚀 Özellikler

* **Karakter Seçimi:** Farklı yeteneklere sahip karakter sınıfları.
* **Mekan Mekanizmesi:**
 **Güvenli Ev (Safe House):** Canınızın yenilendiği güvenli bölge.
  * **Mağaza (Tool Store):** Silah ve zırh satın alabileceğiniz yer.
  * **Savaş Alanları (Battle Locations):** Mağara, Orman, Nehir gibi düşmanların olduğu bölgeler.
* **Savaş Sistemi:** Sıra tabanlı saldırı sistemi. Oyuncu ve canavar (Ayı, Zombi, Vampir vb.) sırayla birbirine saldırır.
* **Envanter Yönetimi:** Silah, zırh ve kazanılan ödüllerin takibi.
* **Rastgelelik (RNG):** Karşınıza çıkacak canavar sayısı ve savaşta kimin önce vuracağı gibi durumlar rastgele belirlenir.

## 🛠 Kullanılan Teknolojiler ve Yapılar

* **Dil:** Java (JDK 8+)
* **IDE:** IntelliJ IDEA
* **Prensipler:**
    * **Inheritance (Kalıtım):** `Location`, `BattleLoc`, `NormalLoc` gibi sınıflar arasındaki hiyerarşi.
    * **Polymorphism (Çok Biçimlilik):** Farklı düşman ve lokasyon türlerinin ortak metotları farklı şekillerde kullanması.
    * **Encapsulation (Kapsülleme):** `private` değişkenler ve `getter/setter` metotları ile veri güvenliği.
    * **Abstraction (Soyutlama):** `Location` ve `Obstacle` gibi soyut sınıflar üzerinden oyun iskeletinin kurulması.

## 📂 Sınıf Yapısı (Class Diagram Özeti)

* **Main & Game:** Oyunun başlatıldığı ve ana döngünün döndüğü sınıflar.
* **Player:** Oyuncunun özelliklerini ve envanterini tutar.
* **Location (Abstract):** Tüm mekanların atasıdır.
    * **NormalLoc:** Savaş olmayan yerler (Güvenli Ev, Mağaza).
    * **BattleLoc:** Savaşın döndüğü yerler (Mağara, Orman vb.).
* **Obstacle:** Canavarların (Ayı, Zombi vb.) türetildiği sınıf.
* **Inventory:** Oyuncunun eşyalarını tutan sınıf.

## 💻 Kurulum ve Çalıştırma

1.  Bu projeyi bilgisayarınıza klonlayın:
    ```bash
    git clone https://github.com/zehradagasann/AdventureGamee/tree/master
    ```
2.  Projeyi **IntelliJ IDEA** (veya tercih ettiğiniz bir Java IDE'si) ile açın.
3.  `Main.java` dosyasını bulun ve çalıştırın (Run).
4.  Konsol ekranındaki yönergeleri takip ederek oyunu oynayın.

## 📸 Ekran Görüntüleri

<img width="972" height="620" alt="image" src="https://github.com/user-attachments/assets/645b4281-e0b7-4c6b-945d-f2779a981e83" />
<img width="836" height="513" alt="image" src="https://github.com/user-attachments/assets/882530fb-c387-4a7a-a15b-c83c985ba15a" />
<img width="596" height="312" alt="image" src="https://github.com/user-attachments/assets/4e4f0001-6523-4f2b-97af-7db1328977ed" />
<img width="819" height="220" alt="image" src="https://github.com/user-attachments/assets/83f15747-74d3-4d7c-a152-e8cca58aea04" />






---
**Geliştirici:** [Zehra Dağaşan]
