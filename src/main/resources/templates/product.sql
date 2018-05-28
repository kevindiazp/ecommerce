/*
 Navicat Premium Data Transfer

 Source Server         : ecommerce
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : ecommerce

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 24/05/2018 09:11:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `iDProduct` int(5) UNSIGNED ZEROFILL NOT NULL,
  `prod_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `prod_desc` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` integer(10) NOT NULL,
  `prod_image` varchar (25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `prod_brand` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category_id_category` int(5) NOT NULL,
  PRIMARY KEY (`iDProduct`) USING BTREE,
  INDEX `ID_category`(`category_id_category`) USING BTREE,
  CONSTRAINT `ID_category` FOREIGN KEY (`category_id_category`) REFERENCES `category` (`ID_category`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (10060, 'Bola Futsal', 'Ukuran : 4, Terbuat dari bahan berkualitas dan kuat, Telah memenuhi standar internasional, Ideal digunakan untuk latihan maupun pertandingan resmi', 206000, 'bolafutsal.jpg', 'Mitre', 10);

INSERT INTO `product` VALUES (10061, 'Jersey', 'Material: 100% Polyester, NFL shield at collar, Screen print name, numbers and logos, Satin twill woven jock tag, Officially licensed, Brand: Nike', 1500000, 'jersey.jpg', 'Nike', 10);

INSERT INTO `product` VALUES (10062, 'Baseball Bat', 'Brand: Easton Sports, Barrel Diameter: 2-5/8\", Material: Exact Composite, Construction: One-Piece, Swing Weight: Balanced, Series: Ghost X Hyperlite, Certification(s): USA', 5000000, 'baseballbat.jpg', 'Easton Sport', 10);

INSERT INTO `product` VALUES (10063, 'Bola Basket', 'Ukuran 6, Construction Laminated, Cover Material Synthetic Leather, Bladder Butyl\r\n', 200000, 'bolabasket.jpg', 'Molten', 10);

INSERT INTO `product` VALUES (10064, 'Raket Badminton', 'TYPE : WILSON X-TECH, bahan : full carbone , flex : medium , shaft : 6,5-7,5 mm, weight : 87gr, lenght : 675 mm , high tension : 28lbs', 245000, 'raketbadminton.jpg', 'Wilson', 10);

INSERT INTO `product` VALUES (10065, 'Raket Tenis', 'Wilson Ultra XP 110S, Headsize 100\" 265 Gram, String Pattern 18 x 16, Grip 4 1/4', 2300000, 'rakettenis.jpg', 'Wilson', 10);

INSERT INTO `product` VALUES (10066, 'Stick Golf', 'Gold plated Head Clubs, Graphite Flex Shaft, Original Honma Beres Grip', 36000000, 'stikgolf.jpg', 'Honma', 10);

INSERT INTO `product` VALUES (10067, 'Sepatu Futsal', 'merk : NIKE, gender : PRIA, ukuran : ALL SIZE 39-44, warna : SESUAI GAMBAR+INCLUDE BOX', 170000, 'sepatufutsal.jpg', 'Nike', 10);

INSERT INTO `product` VALUES (10068, 'Sepatu Basket', 'Didesain sporty, Neat stitching, Rubber outsole yang nyaman digunakan, Material : Leather', 2300000, 'sepatubasket.jpg', 'Air Jordan', 10);

INSERT INTO `product` VALUES (10069, 'Bola Voli', 'Berat 260 hingga 280 gram, Tekanan standar sekitar 294,3 hingga 318,82 mbar atau hPa, Bahan : kulit, rubber, Size : 5, made in thailand', 108000, 'bolavoli.jpg', 'Mikasa', 10);

INSERT INTO `product` VALUES (10070, 'Sepatu Running', 'Running shoes berdesain sporty, 6 eyelets, neat stitching, dan outsole sehingga nyaman saat dipakai, Ideal digunakan untuk berolahraga setiap hari, Material : Mesh upper', 400000, 'sepaturunning.jpg', 'Reebok', 10);

INSERT INTO `product` VALUES (30041, 'Playstation 3', '+ Sudah dimodifikasi sedemikian rupa\r\n  + Dapat memainkan game-game dari harddisk external\r\n  + Dengan kemudahan yang diberikan, Anda akan bisa memainkan semua game-game seru yang ingin Anda mainkan\r\n  + Harddisk 120 GB Ready Full Game\r\n', 1700000, 'ps3.jpg', 'Sony', 30);

INSERT INTO `product` VALUES (30042, 'Playstation 3 Slim', '+ Desain super slim +Kapasitas 320GB full game + bisa bermain secara online', 2650000, 'ps3slim.jpg', 'Sony', 30);

INSERT INTO `product` VALUES (30043, 'Playstation 4', '+ Prosesor : AMD berbasis set instruksi x86-64 + Memori : RAM 8 GB GDDR5 + Kapasitas penyimpanannya : 500 GB + Fitur : Blue-ray disc drive yang lebih cepat, chip custom khusus untuk pemrosesan audio, video & tugas latar belakang', 3600000, 'ps4.jpg', 'Sony', 30);

INSERT INTO `product` VALUES (30044, 'Playstation 4 Slim', '+ Main Processor : Single-chip custom processor + CPU : x86-64 AMD \'Jaguar\' 8 cores + GPU : 1.84 TFLOPS, AMD next-generation Radeon based graphics engine + Memory : GDDR5 8 GB', 4800000, 'ps4slim.jpg', 'Sony', 30);

INSERT INTO `product` VALUES (30045, 'Playstation 4 Pro', '+ Dibekali hardware yang lebih bertenaga + Memiliki kapasitas harddisk standar sebesar 1 TB', 6500000, 'ps4pro.jpg', 'Sony', 30);

INSERT INTO `product` VALUES (30046, 'Xbox 360 Slim', '+ Dilengkapi teknologi Kinect yang mampu memainkan permainan dengan gerakan tubuh melalui sensor visual khusus + Isi Paket : Microsoft Xbox360 Slim (4 GB), joystick, adaptor, kabel HDMI, dan kinect', 3350000, 'xbox360slim.jpg', 'Microsoft', 30);

INSERT INTO `product` VALUES (30047, 'Joystick PS3', '+ Tipe koneksi : Wireless + Pressure Sensitive Buttons + Bluetooth Technology + Motion sensing + Buit-in Lithium-ion rechargeable battery', 1100000, 'joystickps3.jpg', 'Sony', 30);

INSERT INTO `product` VALUES (30048, 'Switch Blue-Red', '+ Mengusung tema hybrid + Dirancang dapat beradaptasi dengan segala model ruangan dan lingkungan', 4900000, 'switchbr.jpg', 'Nintendo', 30);

INSERT INTO `product` VALUES (30049, 'Switch Mario Odyssey Bundle', '+ Kapasitas penyimpanan 32GB + Grafik : Up to 1080p (1920 x 1080) + Ukuran : 23.9 x 10.2 x 1.4 cm + Prosesor : Custom Nvidia Tegra + Bundle dengan Mario Odyssey', 540000, 'switchmo.jpg', 'Nintendo', 30);

INSERT INTO `product` VALUES (30050, 'Resident Evil 7', '+ Genre: Action + Publisher: Capcom + Developer: Capcom + Region 2 English + Kompatibel dengan PS VR', 400000, 're7.jpg', 'Capcom', 30);

INSERT INTO `product` VALUES (30051, 'Resident Evil 7 : Gold Edition', '+ Sony PS4 Resident Evil 7 Gold Edition + Genre : Survival horror + Publisher : Capcom + Developer : Capcom + Reg 3 + Included: Not A Hero and End of Zoe DL', 525000, 're7gold.jpg', 'Capcom', 30);

INSERT INTO `product` VALUES (30052, 'PES 2018', '+ Platform : PlayStation 4 + Genre : Sports + Publisher : Konami + Developer : PES Productions', 475000, 'pes2018.jpg', 'Konami', 30);

INSERT INTO `product` VALUES (30053, 'PES 2018 : Legendary', '+ SONY PS4 PES 2018 Pro Evolution Soccer 2018 Legendary Edition DVD Game + Genre : Sports + Publisher : Konami + Developer : PES Productions + Type : DVD Game', 875000, 'pes18le.jpg', 'Konami', 30);

INSERT INTO `product` VALUES (30054, 'Assasins Creed : Origins', '+ SONY PS4 Assassin\'s Creed Origins DVD Game + Genre : Action + Publisher : Ubisoft + Developer : Ubisoft Montreal + Region : 3 Asia / English', 700000, 'acorigins.jpg', 'Ubisoft', 30);

INSERT INTO `product` VALUES (30055, 'Assasins Creed : Ezio Collection', '+ Genre: Historic Action Adventure + Publisher: Ubisoft + Developer: Ubisoft + Region 2 English', 360000, 'acezio.jpg', 'Ubisoft', 30);

INSERT INTO `product` VALUES (30056, 'Assasins Creed : Syndicate', '+ Assassins Creed Syndicate + Sony PlayStation 4 + Genre : Action Adventure + Publisher : Ubisoft + Developer : Ubisoft Quebec City', 300000, 'acsyndicate.jpg', 'Ubisoft', 30);

INSERT INTO `product` VALUES (30057, 'Assasins Creed : Unity', '+ Digital download berupa sofware + Tidak ada CD atau DVD yang akan dikirimkan, Anda akan langsung download gamenya dari PSN + Kualitas original seperti CD dan DVD + Genre : Action Adventure + Size : 38.2 GB', 280000, 'acunity.jpg', 'Ubisoft', 30);

INSERT INTO `product` VALUES (30058, 'GTA 5', '+ PlayStation 4 + Genre : Third-Person Action + Publisher : Rockstar + Games Developer : Rockstar North', 550000, 'gta5.jpg', 'Rockstar', 30);

INSERT INTO `product` VALUES (30059, 'Call Of Duty : Black Ops 3', '+ PlayStation 4 + M for Mature :Blood and Gore, Drug Reference, Intense Violence, Strong Language, Online Interactions Not Rated by the ESRB + Genre : First-Person Shooter + Publisher : Activision + Developer : Treyarch + Region', 365000, 'codbo3.jpg', 'Activision', 30);

INSERT INTO `product` VALUES (50093, 'Jaket Hoodie', 'bahan Tebal & halus serta berbulu pada bagian dalamnya,,sehingga nyaman untuk di pakai', 200000, 'jakethoodie.jpg', 'Nike', 50);

INSERT INTO `product` VALUES (50094, 'Jaket Parasut', 'bahan parasute & ada puring didalamnya\r\n\r\n- Size M\r\n- Size L\r\n- Size XL', 300000, 'jaketparasut.jpg', 'Adidas', 50);

INSERT INTO `product` VALUES (50095, 'Polo Shirt', 'Short-sleeved polo shirt in cotton jersey with a collar, button placket and slits in the sides.', 180000, 'poloshirt.jpg', 'H&M', 50);

INSERT INTO `product` VALUES (50096, 'T-shirt', 'Men`s basic short sleeve T-shirt with a round neckline and all-over skulls and polka dots print.\r\nFree shipping (to stores)', 230000, 'tshirt.jpg', 'Pull & Bear', 50);

INSERT INTO `product` VALUES (50097, 'Printed T-Shirt', 'T-shirt in printed cotton jersey.', 270000, 'printedtshirt.jpg', 'H&M', 50);

INSERT INTO `product` VALUES (50098, 'Skinny Jeans', 'Skinny fit jeans. Featuring two side pockets, two back pockets, one coin pocket and belt loops. Fastening with zip fly and top button.', 350000, 'skinnyjeans.jpg', 'Zara', 50);

INSERT INTO `product` VALUES (50099, 'Linen Skirt', 'Care for fiber: Sustainably grown European linen. Sustainably grown European linen is farmed using a natural irrigation system and no genetically modified seeds or defoliants. This process helps to conserve water, protect biodiversity and care for the land.\r\n', 320000, 'linenskirt.jpg', 'Zara', 50);

INSERT INTO `product` VALUES (50100, 'Striped tiered skirt', 'Tiered skirt in a striped cotton weave with smocking at the waist. Unlined.', 250000, 'stripedskirt.jpg', 'H&M', 50);

INSERT INTO `product` VALUES (50101, 'Baseball Cap', 'Tahan lama,  desain menarik, terbuat dari bahan berkualitas', 90000, 'baseballcap.jpg', 'Miniso', 50);

INSERT INTO `product` VALUES (50102, 'Jerami Hat', 'Terbuat dari bahan berkualitas sehingga tahan lama', 100000, 'strawhat.jpg', 'Miniso', 50);

INSERT INTO `product` VALUES (50103, 'Sepatu Vantofel', 'slip on shoes, desain casual, outsole yang nyaman, dan terbuat dari bahan berkualitas', 175000, 'sepatuvantovel.jpg', 'Yongki Komaladi', 50);

INSERT INTO `product` VALUES (50104, 'Wedges', 'nyaman digunakan, pas di kaki, tahan lama, dan terbuat dari bahan berkualitas', 125000, 'wedges.jpg', 'Yongki Komaladi', 50);

INSERT INTO `product` VALUES (50105, 'Kacamata Kalibre', 'Stylish, cocok digunakan untuk aktivitas sehari-hari', 85000, 'kacamatakalibre.jpg', 'Kalibre', 50);

INSERT INTO `product` VALUES (50106, 'Dasi Hugo', 'bahan 100% silk, aksesoris branded', 175000, 'dasihugo.jpg', 'Hugo Boss', 50);

INSERT INTO `product` VALUES (50107, 'Dasi Hugo 31', 'formal tie, bahan 100% silk', 200000, 'dasihugo31.jpg', 'Hugo Boss', 50);

INSERT INTO `product` VALUES (50108, 'Kaos Kaki Adidas', 'bahan cotton, gender pria dan wanita style casual', 150000, 'kaoskakiadidas.jpg', 'Adidas', 50);

INSERT INTO `product` VALUES (50109, 'Kaos Kaki Dri-Fit', 'bahan cotton, nyaman digunakan untuk aktivitas di mana saja', 250000, 'kaoskakidryfit.jpg', 'Nike', 50);

INSERT INTO `product` VALUES (50110, 'Hardwike', 'tas 3 in 1 bisa digunakan untuk aktivitas sehari-hari, terdapat raincoat, zipper lock', 600000, 'hardwike.jpg', 'Kalibre', 50);

INSERT INTO `product` VALUES (50111, 'Predator Echo', 'terdapat tempat botol kanan dan kiri, hydration compartment, tempat khusus kacamata, raincoat', 750000, 'predatorecho.jpg', 'Kalibre', 50);

INSERT INTO `product` VALUES (50112, 'Motivica', '2 kompartment utama dengan zipper, bagian dalam 1 kompartment dengan zipper', 300000, 'motivica.jpg', 'Kalibre', 50);

INSERT INTO `product` VALUES (70071, 'Keripik Pedas', 'keripik singkong pedas yang terbuat dari singkong dengan bumbu pedas asli', 5000, 'keripikpedas.jpg', 'Christine Hakim', 70);

INSERT INTO `product` VALUES (70072, 'Keripik Pisang', 'Keripik pisang khas kota Bandung, terbuat dari pisang berkualitas sehingga menghasilkan rasa yang enak dan bermutu, harga bersahabat dan pas banget untuk nongkrong dan touring', 20000, 'keripikipisang.jpg', 'Zanana', 70);

INSERT INTO `product` VALUES (70073, 'Toblerone', 'Coklat yang terdiri dari 3 varian rasa yaitu coklat, milk, dan dark coklat', 20000, 'toblerone.jpg', 'Toblerone', 70);

INSERT INTO `product` VALUES (70074, 'Coklat Silverqueen', 'coklat dari silverqueen berisi kacang mete rasa coklat hitam yang sangat bermanfaat bagi kesehatan.', 7500, 'silverqueen.jpg', 'Silverqueen', 70);

INSERT INTO `product` VALUES (70075, 'Quaker Oatmeal', 'Quaker oatmeal (oat) yang terdiri dari kandungan gandum alami dan haver,\r\n memiliki serat dan nutrisi yang baik untuk kesehatan.\r\nmudah dimasak dengan proses (quick cook)', 25000, 'quakeroatmeal.jpg', 'Quaker', 70);

INSERT INTO `product` VALUES (70076, 'Tango', 'Wafer jenis long yang wafer yang memiliki 3 varian rasa yaitu coklat, vanila, dan keju', 5000, 'tango.jpg', 'Tango', 70);

INSERT INTO `product` VALUES (70077, 'Richeese Nabati', 'Wafer Nabati dari Richeese dengan balutan keju yang lezat tiada tara', 3000, 'richeesenabati.jpg', 'Nabati', 70);

INSERT INTO `product` VALUES (70078, 'Selamat', 'Wafer dengan ukuran panjang dengan krim coklat yang berlapis tebal', 4000, 'selamat.jpg', 'Selamat', 70);

INSERT INTO `product` VALUES (70079, 'Koko Crunch', 'sereal koko krunch yang terbuat dari gandum pilihan serta mengandung vitamin dan kalsium yang berguna bagi pertumbuhan masa muda', 16000, 'kokocrunch.jpg', 'Koko Crunch', 70);

INSERT INTO `product` VALUES (70080, 'Fruitloops', 'sereal fruitloops  warna warni yang terbuat dari gandum pilihan dan mengandung vitamin.', 10000, 'fruitloops.jpg', 'Fruitloops', 70);

INSERT INTO `product` VALUES (70081, 'Nescafe', 'Kopi nescafe yang dibentuk dalam kemasan berisi bubuk kopi. Mudah diseduh dan cocok untuk anak mahasiswa maupun pecinta kopi.', 8500, 'nescafe.jpg', 'Nescafe', 70);

INSERT INTO `product` VALUES (70082, 'Luwak White Coffee', 'Luwak white coffee. Kopi putih premium yang berasal dari kotoran luwak dan diekstrak menjadi kopi yang enak dan berkualitas.', 13000, 'luwakwhitecoffe.jpg', 'Luwak White Coffee', 70);

INSERT INTO `product` VALUES (70083, 'Sariwangi', 'Teh wangi melati yang mudah diseduh dengan rasa teh yang mantap dan berkualitas.', 7000, 'sariwangi.jpg', 'Sariwangi', 70);

INSERT INTO `product` VALUES (70084, 'Semngih', 'Teh herbal tradisional yang dihasilkan secara alami dan harum, dan tentu saja nikmat saat diminum.', 5000, 'semngih.jpg', 'Semngih', 70);

INSERT INTO `product` VALUES (70085, 'Coca-Cola', 'Minuman berkarbonasi yang sangat segar dinikmati bersama keluarga maupun teman - teman. Terdiri dari air dan kadar soda yang tinggi.', 5000, 'cocacola.jpg', 'Coca-Cola', 70);

INSERT INTO `product` VALUES (70086, 'Root Beer', 'Minuman beer bersoda rasa yang natural, mengandung alkohol sebesar 0%.', 8000, 'rootbeer.jpg', 'Root Beer', 70);

INSERT INTO `product` VALUES (70087, 'Pepsi Blue', 'inuman berkarbonasi dengan sensasi soda yang segar. Cocok diminum dengan teman - teman maupun keluarga.', 7500, 'pepsiblue.jpg', 'Pepsi', 70);

INSERT INTO `product` VALUES (70088, 'E+', 'Air mineral mengandung alkali ion - ion yang dapat menyegarkan tubuh.', 7000, 'eplus.jpg', 'E+', 70);

INSERT INTO `product` VALUES (70089, 'Nestle', 'Air Minum dalam kemasan berasal dari mata air pegunungan.', 6000, 'nestle.jpg', 'Nestle', 70);

INSERT INTO `product` VALUES (70090, 'Chupa Cups', 'Permen Lolipop yang terdiri dari berbagai rasa seperti coklat, melon, dan strawberry', 2500, 'chupachups.jpg', 'Chupa Cups', 70);

INSERT INTO `product` VALUES (70091, 'Xylitol', 'Permen Karet rasa mint dengan Xylitol yang membuat nafas menjadi segar dan bebas gula', 8000, 'xylitol.jpg', 'Xylitol', 70);

INSERT INTO `product` VALUES (70092, 'Tolak Angin', 'Permen tolak angin dengan ramuan herbal, mengandung peppermint dan ekstrak madu\r\nyang dapat membuat sensasi kesegaran di tenggorokan.', 3000, 'tolakangin.jpg', 'Tolak Angin', 70);

INSERT INTO `product` VALUES (90001, 'Iphone 6S 64GB', 'Released 2015, September\r\n143g, 7.1mm thickness\r\niOS 9, up to iOS 10.3.3\r\n16/32/64/128GB storage, no card slot\r\n4.7?\r\n750x1334 pixels\r\n12MP\r\n2160p\r\n2GB RAM\r\nApple A9\r\n1715mAh\r\nLi-Ion', 5000000, 'iphone6s.jpg', 'Apple', 90);

INSERT INTO `product` VALUES (90002, 'Iphone SE 32GB', 'Released 2016, March\r\n113g, 7.6mm thickness\r\niOS 9.3.2, up to iOS 10.3.3\r\n16/32/64/128GB storage, no card slot\r\n4.0?\r\n640x1136 pixels\r\n12MP\r\n2160p\r\n2GB RAM\r\nApple A9\r\n1624mAh\r\nLi-Po', 4500000, 'iphonese.png', 'Apple', 90);

INSERT INTO `product` VALUES (90003, 'Sony Xperia M4 Aqua', 'Released 2015, June\r\n136g, 7.3mm thickness\r\nAndroid 5.0.1, up to 6.0.1\r\n8GB storage, microSD card slot', 3500000, 'sonyxperiam4.jpg', 'Sony', 90);

INSERT INTO `product` VALUES (90004, 'Sony Xperia Z5 Premium', 'Released 2015, November\r\n180g, 7.8mm thickness\r\nAndroid 5.1.1, up to 7.0\r\n32GB storage, microSD card slot\r\n5.5?\r\n2160x3840 pixels\r\n23MP\r\n2160p\r\n3GB RAM\r\nSnapdragon 810\r\n3430mAh\r\nLi-Ion', 5500000, 'sonyxperiaz5.jpeg', 'Sony', 90);

INSERT INTO `product` VALUES (90005, 'Samsung S9', 'Released 2018, March\r\n163g, 8.5mm thickness\r\nAndroid 8.0\r\n64/128GB storage, microSD card slot', 900000, 'samsungs9.png', 'Samsung', 90);

INSERT INTO `product` VALUES (90006, 'Samsung S8', 'Released 2017, April\r\n155g, 8mm thickness\r\nAndroid 7.0\r\n64GB storage, microSD card slot\r\n5.8?\r\n1440x2960 pixels\r\n12MP\r\n2160p\r\n4GB RAM\r\n3000mAh\r\nLi-Ion', 7500000, 'samsungs8.jpg', 'Samsung', 90);

INSERT INTO `product` VALUES (90007, 'Kirei 1 Pintu', 'Direct Cooling System, Low Watt & Low Volt, Tempered Glass Tray', 400000, 'kirei1.jpg', 'Sharp', 90);

INSERT INTO `product` VALUES (90008, 'Belleza 2 Pintu', 'Kulkas 2 Pintu, Kapasitas : 220 Liter, Power Input : 140Watt, Dilengkapi Fitur Twist & Ice, Tempered Glass Door and Rack', 600000, 'belleza2.jpg', 'Polytron', 90);

INSERT INTO `product` VALUES (90009, 'Inverter 2 Pintu', 'Kapasitas 225L / 209L, Dimensi 555 x 1520 x 585mm, Rate Input 70W, Finishing, Dark Graphite Steel', 5000000, 'inverter1.jpg', 'Samsung', 90);

INSERT INTO `product` VALUES (90010, 'Side By Side', 'Kapasitas 687L / 626L, Dimensi 912 x 1790 x 738mm, Rate Input 170W, Finishing, Platinum Silver', 700000, 'sidebyside.jpg', 'LG', 90);

INSERT INTO `product` VALUES (90011, 'ROG GL553 VD', 'Processor Intel Core i7-7700HQ (Intel Core i7), Graphics adapterNVIDIA GeForce GTX 1050 (Notebook) - 4096 MB, Core: 1354 MHz, Memory: 7000 MHz, NVIDIA GeForce GTX 1050 21.21.13.7654, Optimus, Memory16384 MB, DDR4-2400, Display15.6 inch 16:9, 1920 x 1080 pixel 141 PPI, No, BOE HF NV156FHM-N43, IPS, glossy: no, MainboardIntel HM175, StorageHGST Travelstar 7K1000 HTS721010A9E630, 1000 GB , 7200 rpm, 1 TB HDD, 7200 RPM, Weight2.5 kg ( = 88.19 oz / 5.51 pounds)', 14000000, 'rog.jpg', 'Asus', 90);

INSERT INTO `product` VALUES (90012, 'Predator 17X', 'Intel Core i7-6700HQ Processor 2.6GHz (Up to 3.5GHz) 17.3 Full HD IPS Screen, NVIDIA GeForce GTX 980M with 8GB GDDR5 VRAM 32GB, DDR4 Memory 512GB PCIe SSD, 1TB Hard Drive, 6X Blu-Ray, Windows 10 Home, Up to 7-hours Battery Life', 17000000, 'predator.png', 'Acer', 90);

INSERT INTO `product` VALUES (90013, 'MSI GL62', 'Laptop gaming dengan layar 15.6\" yang memiliki prosesor Core i7, penyimpanan memori yang cepat, memori pendukung DDR4-2400 terbaru yang akan membuat performa game lebih cepat', 12000000, 'msi.jpg', 'MSI', 90);

INSERT INTO `product` VALUES (90014, 'Alienware 17 R4', 'Prosessor : Intel Core i7-6700HQ 2.6-3.5GHz\r\n- RAM : 16GB DDR4\r\n- Storage : 1TB HDD + 128GB SSD\r\n- Graphic : Nvidia GTX1070 8GB\r\n- Layar : 17.3 Inch Full HD\r\n- OS : Windows 10 Original\r\n- NO DVD-RW', 2000000, 'alienware17r4.jpg', 'Dell', 90);

INSERT INTO `product` VALUES (90015, 'Macbook Pro 13-inch', '2.5GHz dual-core Intel Core i5\r\nTurbo Boost up to 3.1GHz\r\n4GB 1600MHz memory\r\n500GB 5400-rpm hard drive\r\nIntel HD Graphics 4000', 25000000, 'mbpro13.jpg', 'Apple', 90);

INSERT INTO `product` VALUES (90016, 'Flip 3', 'JBL Flip 3 adalah generasi baru dalam seri award-winning Flip; yaitu speaker Bluetooth komprehensif portabel yang memberikan power ekstra, suara stereo room-filling dapat dibawa kemana-mana.', 1500000, 'flip3.jpg', 'JBL', 90);

INSERT INTO `product` VALUES (90017, 'Clip 2', 'Anti air dengan sertifikasi IPX7\r\n+ Carabiner yang kokoh untuk menggantung speaker\r\n+ Ada fitur untuk menjawab panggilan telepon\r\n+ Kualitas suara mantap di kelasnya\r\n+ Baterai tergolong awet', 1000000, 'clip2.jpg', 'JBL', 90);

INSERT INTO `product` VALUES (90018, 'Onyx Studio 2', 'Brand : Herman Kardon\r\nPremium Harman Kardon Design\r\nBluetooth Connectivity\r\nRechargeable Battery (up to 5 hours play time)\r\nDeep Bass (Dual Passive Radiators)\r\nGaransi 1 Tahun', 3500000, 'onyxstudio2.jpg', 'Harman Kardon', 90);

INSERT INTO `product` VALUES (90019, 'HD 202', 'Ukuran	8 x 3 x 9.4 inches\r\nBobot 	130 gram\r\nTeknologi Headphones	Dinamik\r\nSound Output	LPDDR 4 GB\r\nMemori internal	Stereo\r\nFrekuensi 	18 Hz\r\nSensitivitas	3.000 mAh\r\nDimensi	115 dB\r\n Tipe Konektor, mini phone Stereo 3.5 mm', 500000, 'hd202.jpg', 'Sennheiser', 90);

INSERT INTO `product` VALUES (90020, 'M50x', 'Pro Monitoring HeadphoneClosed-back dynamicDetachable Cable15 - 28000 Hz38 ohms', 1500000, 'm50x.jpg', 'Audio Technica', 90);

INSERT INTO `product` VALUES (90021, 'Stanmore', 'Absolute min/max: 90-264V-\r\n\r\nBass and treble tone control: Yes\r\n\r\nBluetooth: Standard V4.0 + EDR APTX Codec\r\n\r\nClass D amplifier: 2X20W+1X40W\r\n\r\nCrossover frequency: 2500Hz\r\n\r\n3/4\" dome tweeters: 2x\r\n\r\nFrequency response: 45- 22.000Hz +-3dB\r\n\r\nInput 1 - 3,55 mm: 1x\r\n\r\nInput 2 - RCA: 1x\r\n\r\nInput 3 - Optical: 1x\r\n\r\nMains frequency: 50-60HZ\r\n\r\nMains input voltage: 100-240V-/200W\r\n\r\nPower saver mode: 0,43W\r\n\r\nStandard mode: 8,7W\r\n\r\n5 1/4 woofers: 1x\r\n\r\nWeight: 5,1 kg\r\n\r\nSize: 350 X 185 X 185MM', 500000, 'stanmore.jpg', 'Marshall', 90);

INSERT INTO `product` VALUES (90022, 'HD 201', 'Audio\r\nFrequency	\r\n21 Hz - 18 kHz\r\nSensitivity	\r\n108 dB\r\nImpedance	\r\n24 ohms\r\nFeatures\r\nPlug Type	\r\n3.5 mm jack\r\nBluetooth	\r\nNo\r\nMicrophone	\r\nYes', 750000, 'hd201.jpg', 'Sennheiser', 90);

INSERT INTO `product` VALUES (90023, 'QC 35', 'Headphone Noise-cancellation Bluetooth and NFC pairing Up to 20 Hours Premium Quality\r\nHeadphone Noise-cancellation Bluetooth and NFC pairing Up to 20 Hours Premium Quality', 4000000, 'qc35.png', 'Bose', 90);

INSERT INTO `product` VALUES (90024, 'G502', 'Gaming Mouse200-12.000 dpiUSB', 700000, 'g502.png', 'Logitech', 90);

INSERT INTO `product` VALUES (90025, 'M185', '2.4 GHz wireless technology MouseNano-receiverUSB', 150000, 'm185.png', 'Logitech', 90);

INSERT INTO `product` VALUES (90026, 'Magic Mouse', 'Berat	1.0000\r\nCompatibility	iMac, Mac Mini, MacBook, MacBook Air, MacBook Pro, MacPro\r\nBrand	Apple\r\nPackage Length	Tidak\r\nPackage Width	Tidak', 100000, 'magicmouse.jpg', 'Apple', 90);

INSERT INTO `product` VALUES (90027, 'Deathadder', 'Gaming Mouse 10.000 DPI Ergonomic right-handed design Lighting effects 16.8 million customizable color options', 600000, 'deathadder.jpeg', 'Razer', 90);

INSERT INTO `product` VALUES (90028, 'G7', '2400 DPI | MACRO MOUSE | GOLD PLATED USB | 4 COLORS LED\r\n\r\n7 Led Warna\r\nUSB Lapis Emas\r\nKabel Nilon\r\n7D Mouse\r\n2400 Dpi', 100000, 'g7.png', 'Rexus', 90);

INSERT INTO `product` VALUES (90029, 'Data Traveler G4 16GB', 'USB 3.0\r\nKapasitas 32GB\r\nUkuran(LxWxH) 55mm x 21mm x 10.1mm\r\nTempratur operasi 0C to 60C\r\nOS support Windows 10, Windows 8.1, Windows 8, Windows 7 (SP1), Windows Vista (SP2), Mac OS X v.10.8.x+, Linux v.2.6.x+, Chrome OS', 150000, 'datatravellerg4.jpg', 'Kingston', 90);

INSERT INTO `product` VALUES (90030, 'Jetdrive GO500 64Gb', 'Dual connector: Lightning + USB 3.1\r\nDidukung dengan Ultra transfer speed hingga 130MB/s\r\nMendukung berbagai format file\r\nDesain metalik berkualitas tinggi\r\nDesain konector yang panjang memudahkan untuk plug-in\r\nFlash drive dibuat untuk iPhone, iPad dan iPod', 1000000, 'jetdrivego500.jpg', 'Transcend', 90);

INSERT INTO `product` VALUES (90031, 'Passport 1TB', 'USB 3.0 1TB Windows/Mac', 700000, 'passport1tb.jpg', 'WD', 90);

INSERT INTO `product` VALUES (90032, 'Cloud 2TB', '2TBCloud System Network Storage1x Gigabit Ethernet1x USB 3.0Tower Case', 4000000, 'cloud2.jpg', 'WD', 90);

INSERT INTO `product` VALUES (90033, 'Backup Plus Slim 3TB', 'Kapasitas 3TB Port USB 3.0 2.5 Inch Bay', 2500000, 'backupplusslim3.jpg', 'Seagate', 90);

INSERT INTO `product` VALUES (90034, '960 EVO SSD M.2 250GB', 'NVMe read/write performance\r\nV-nand SSD ideal for high-performance PCs\r\nCompact M.2 form Factor perfect for mobile or desktop computing\r\nSamsung magician software delivers SSD management and automatic firmware updates\r\nMount hardware is not included', 2000000, '960EVO.jpg', 'Samsung', 90);

INSERT INTO `product` VALUES (90035, 'MP500 SSD M.2 256GB', '256GBSolid State2.5 inch3000MB/s Read2400MB/s Write', 2500000, 'mp500.jpg', 'Corsair', 90);

INSERT INTO `product` VALUES (90036, 'C100SI', 'In Ear Headphone20-20kHzUniversal Remote & Mic Button1.2 Meter CableSupport iOS & Android', 150000, 'c100si.jpeg', 'JBL', 90);

INSERT INTO `product` VALUES (90037, 'Sonic Fuel', 'Sonic Fuel Earphones Dynamic 15 - 22000 Hz 16 ohms 100 dB/mW', 500000, 'sonicfuel.jpg', 'Audio Technica', 90);

INSERT INTO `product` VALUES (90038, 'K120', 'Standard KeyboardSpill-resistantUSB', 75000, 'k120.jpeg', 'Logitech', 90);

INSERT INTO `product` VALUES (90039, 'MS745', 'HEADSET Bose Ms-745\r\nSPESIFIKASI :\r\nUKURAN SPEAKER : 17mm\r\nFREQUENSHz\r\nSENSITIVITY : 125dB\r\nPANJANG KABEL : 1.5m', 300000, 'ms745.jpg', 'Bose', 90);

INSERT INTO `product` VALUES (90040, 'Soundstick 3', 'Built-in Advanced HARMAN TrueStream Wireless sistem\r\n8pcs Mid Full Range (4pcs per channel) Crystal Clear Sound Quality\r\n6 inci Subwoofer yang menembak ke bawah, (bisa diatur)\r\nKabel input dapat diupgrade\r\nMasuk dalam koleksi Musium New York (MoMA)', 4500000, 'soundstick3.jpg', 'Harman Kardon', 90);


SET FOREIGN_KEY_CHECKS = 1;
