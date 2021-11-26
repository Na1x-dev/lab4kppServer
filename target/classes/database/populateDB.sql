INSERT INTO users (firstname, lastname, username, password, email) VALUES
    ('Георгий','Никифоров', 'georgiy', '1','georgiy@gmail.com'),
    ('Сергей','Данилов', 'sergey', '2','sergey@gmail.com'),
    ('Максим','Никульшин', 'maksim', '3','maksim@gmail.com'),
    ('Дмитрий','Афанасьев', 'dimas', '4','dimas@gmail.com'),
    ('Михаил','Басик', 'mihail', '5','mihail@gmail.com');

INSERT INTO bills (username,iban, card_number, card_name, card_validity, balance) VALUES
    ('georgiy','BY82614566138422471228953251', '4511 6063 7123 4160', 'Карта 1', '03/25', 567.12),
    ('sergey',  'BY35879383132484449126321512', '4409 0374 4585 9649', 'Карта 1', '12/21', 237.32),
    ('maksim', 'BY95614566132978916442958996', '4287 3581 2802 3429', 'Карта 1', '01/25', 23.20),
    ('dimas', 'BY86879383133978783578788135', '4942 7392 6843 9979', 'Карта 1', '07/25', 94.21),
    ('mihail', 'BY06134113218856234431793672', '4062 2497 5672 0462', 'Карта 1', '06/22', 21.24);

INSERT INTO transactions (username, name_of_transaction, check_number, price, description, card_number ) VALUES
    ('georgiy','чаек', '0000000001', 10.99, 'greenfield spring melody', '4511 6063 7123 4160'),
    ('sergey',  'кофеек', '0000000002', 21.99, 'я не разбираюсь в кофе', '4409 0374 4585 9649'),
    ('maksim', 'ноутбук acer с rtx 3050', '0000000003', 2625, 'для Forza Horizon 5', '4287 3581 2802 3429'),
    ('dimas', 'fisting', '0000000004', 300, ' - ', '4942 7392 6843 9979'),
    ('mihail', 'новая жопа', '0000000005', 999.99, ' - ', '4062 2497 5672 0462');