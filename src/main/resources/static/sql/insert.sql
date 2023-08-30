SET foreign_key_checks=1;

USE questdb;

INSERT INTO mst_user
(user_name, password, family_name, first_name, family_name_kana, first_name_kana, gender)
VALUES ('staff01@gmail.com', '202306', '山田', '太郎', 'やまだ', 'たろう', 0);

INSERT INTO mst_category (category_name,category_description)VALUES
('メイン','オムの木のメインメニューです'),
('サラダ','オムの木のサラダメニューです'),
('デザート','オムの木のデザートメニューです'),
('ドリンク','オムの木のドリンクメニューです');

INSERT INTO mst_product(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company)VALUES 
('オムライス','おむらいす','当店自慢のオムライスです',1,880,'/img/main/omurice.jpg','2023/01/05','オムの木'),
('ハヤシライス','はやしらいす','具だくさんのハヤシライスです',1,880,'/img/main/hayasirice.jpg','2023/01/15','オムの木'),
('チキンライス','ちきんらいす','国産チキンを使ったチキンライスです',1,750,'/img/main/chickenrice.jpg','2023/01/25','オムの木'),
('季節のサラダ','きせつのさらだ','旬の野菜を使ったサラダです',2,600,'/img/salad/kisetunosarada.jpg','2023/02/05','オムの木'),
('シーザーサラダ','しーざーさらだ','シザードレッシングのサラダです',2,500,'/img/salad/si-za-sarada.jpg','2023/02/15','オムの木'),
('チョレギサラダ','ちょれぎさらだ','チョレギドレッシングのサラダです',2,500,'/img/salad/tyoregisaradajpg.jpg','2023/02/25','オムの木'),
('アイス','あいす','口溶けのよい自慢のアイスです',3,350,'/img/sweets/ice.jpg','2023/03/05','オムの木'),
('かき氷','かきごおり','富士山の水を使用した自慢のかき氷です',3,300,'/img/sweets/kakigori.jpg','2023/03/15','富士山直送'),
('クレープ','くれーぷ','美味しいクレープです',3,400,'/img/sweets/kure-pu.jpg','2023/03/25','オムの木'),
('麦茶','むぎちゃ','あの夏の味を思い出せる一品です',4,200,'/img/drinks/mugitya.jpg','2023/04/05','伊藤園'),
('緑茶','りょくちゃ','体に染み渡るお味がします',4,200,'/img/drinks/ryokutya.jpg','2023/04/15','伊右衛門'),
('紅茶','こうちゃ','女性の方に人気の商品となっております',4,250,'/img/drinks/koutya.jpg','2023/04/25','シルバーニードルズ');