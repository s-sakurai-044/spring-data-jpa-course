CREATE TABLE IF NOT EXISTS test_user(
    id INT AUTO_INCREMENT COMMENT 'ユーザーの一意の識別子',
    name VARCHAR(50) NOT NULL COMMENT 'ユーザーの名前',
    age INT UNSIGNED NOT NULL COMMENT 'ユーザーの年齢',
    gender CHAR(1) NOT NULL COMMENT '性別。ISO 5218に従い、1文字のコード（0: 不明, 1: 男性, 2: 女性, 9: 適用不能）で保存'
);