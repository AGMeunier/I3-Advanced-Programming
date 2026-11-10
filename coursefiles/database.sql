CREATE DATABASE IF NOT EXISTS st2apr_workshop
    DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_general_ci;
USE st2apr_workshop;
DROP TABLE IF EXISTS programmer;

CREATE TABLE programmer (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        last_name VARCHAR(100) NOT NULL,
        first_name VARCHAR(100) NOT NULL,
        address VARCHAR(255),
        expertise_language VARCHAR(100),
        favorite_book VARCHAR(150),
        salary DECIMAL(10,2)
);

INSERT INTO programmer
    (last_name, first_name, address, expertise_language, favorite_book, salary)
VALUES
    ('Nguyen', 'Thierry', '12 rue de la Paix, Paris',
     'Java', 'Clean Code', 45000.00),
    ('Fernandez', 'Lucia', '34 avenue des Lilas, Lyon',
     'Python', 'Fluent Python', 42000.00),
    ('O''Connor', 'Sean', '78 boulevard Victor Hugo, Marseille',
     'C++', 'Effective C++', 48000.00),
    ('Kowalski', 'Marek', '5 place Bellecour, Lyon',
     'C#', 'CLR via C#', 46000.00),
    ('Haddad', 'Amina', '22 rue Nationale, Lille',
     'JavaScript', 'You Don''t Know JS', 43000.00),
    ('Okafor', 'Chinedu', '19 rue des Freres Lumiere, Toulouse',
     'Go', 'The Go Programming Language', 47000.00),
    ('Tanaka', 'Yuki', '55 avenue Montaigne, Paris',
     'Ruby', 'Programming Ruby', 41000.00),
    ('Dubois', 'Claire', '8 rue de Bretagne, Nantes',
     'Kotlin', 'Kotlin in Action', 44000.00),
    ('Singh', 'Arjun', '66 rue Voltaire, Bordeaux',
     'Scala', 'Programming in Scala', 49000.00),
    ('Smith', 'Emily', '101 avenue Foch, Strasbourg',
     'PHP', 'Modern PHP', 40000.00);