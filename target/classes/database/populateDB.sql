INSERT INTO users (firstname, lastname, username, password, email) VALUES
    ('Георгий','Никифоров', 'georgiy', '1','geprgiy@gmail.com'),
    ('Сергей','Данилов', 'sergey', '2','sergey@gmail.com'),
    ('Максим','Никульшин', 'maksim', '3','maksim@gmail.com'),
    ('Дмитрий','Афанасьев', 'dimas', '4','dimas@gmail.com'),
    ('Михаил','Басик', 'mihail', '5','mihail@gmail.com');

INSERT INTO bills (username,iban, card_number, card_name, card_validity, balance, is_auto_block, is_manual_block) VALUES
    ('georgiy','BY82614566138422471228953251', '4511 6063 7123 4160', 'Карта 1', '03/25', 567.12, false, false),
    ('sergey',  'BY35879383132484449126321512', '4409 0374 4585 9649', 'Карта 1', '12/21', 237.32, false, false),
    ('maksim', 'BY95614566132978916442958996', '4287 3581 2802 3429', 'Карта 1', '01/25', 23.20, false, false),
    ('dimas', 'BY86879383133978783578788135', '4942 7392 6843 9979', 'Карта 1', '07/25', 94.21, false, false),
    ('mihail', 'BY06134113218856234431793672', '4062 2497 5672 0462', 'Карта 1', '06/22', 21.24, false, false);

-- INSERT INTO transactions (username, name_of_transaction, check_number, price, description, card_number ) VALUES
--     ('georgiy','чаек', '0000000001', 10.99, 'greenfield spring melody', '4511 6063 7123 4160'),
--     ('sergey',  'кофеек', '0000000002', 21.99, 'я не разбираюсь в кофе', '4409 0374 4585 9649'),
--     ('sergey', 'ноутбук acer с rtx 3050', '0000000003', 2625, 'для Forza Horizon 5', '4287 3581 2802 3429'),
--     ('sergey', 'fisting', '0000000004', 300, ' - ', '4942 7392 6843 9979'),
--     ('mihail', 'новая жопа', '0000000005', 999.99, ' - ', '4062 2497 5672 0462');

INSERT INTO components (name_of_component, price, description) VALUES
    ('PowerColor AXRX 550 2GBD5-HLEV2', 259.00, ' - '),
    ('AFOX GeForce GT 220 1GB', 109.00, ' - '),
    ('Palit RTX 3060 Dual 12GB', 2599.00, 'палит ваш дом спалит'),
    ('Sapphire R7 240 4GB GDDR3', 259.00, ' - '),
    ('Palit RTX 3070Ti GameRock 8GB GDDR6X', 4599.00,' - '),
    ('AMD Ryzen 5 5600X Multipack', 1118.97, ' - '),
    ('AMD Ryzen 7 5800X Box', 1321.73, ' - '),
    ('Intel Core i5-9400F Box', 598.07, ' - '),
    ('Intel Pentium Gold G6605 BOX', 383.75, ' - '),
    ('AMD Ryzen 3 1300X ', 338.61,' - '),
    ('RAM DDR4 Crucial', 109.00, ' - '),
    ('SSD Samsung 870 Evo 500Gb', 229.00, ' - '),
    ('Seagate BarraCuda 2TB', 155.00, ' - '),
    ('RAM DDR4 Kingston', 255.99, ' - '),
    ('SSD диск SSD Samsung 970 Evo Plus 500GB', 259.00,' - '),
    ('Be quiet! SFX Power 2 Bronze Retail 300W', 209.95, ' - '),
    ('Gigabyte B450M S2H V2', 202.75, ' - '),
    ('Be quiet! Dark Power Pro 12 Titanium 750W', 792.69, ' - '),
    ('Deepcool DN650', 177.35, ' - '),
    (' AsRock A320M Pro4-F', 205.31,' - ');