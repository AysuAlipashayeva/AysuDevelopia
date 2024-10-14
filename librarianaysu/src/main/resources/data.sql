insert into books
(name, page_count, author, publish_date) values 
('Java 23','300','James','2024-09-17'),
('CSS','200','Wium Lie','1996-12-17'),
('Spring boot 3','400','Rod Johnson','2022-11-24'), 
('HTML','350','Tim Berners-Lee','1999-12-17'), 
('Spring Boot 101', '450', 'John Doe', '2023-05-12'), 
('Hibernate Advanced', '320', 'Anna Smith', '2022-08-22'), 
('Microservices Architecture', '500', 'Michael Brown', '2021-12-05'), 
('Kotlin for Beginners', '280', 'Sophia Lee', '2020-06-18'), 
('Effective Java', '350', 'Joshua Bloch', '2023-02-15'), 
('Clean Code', '450', 'Robert C. Martin', '2021-11-20'), 
('Design Patterns', '400', 'Erich Gamma', '2023-03-01'), 
('Refactoring', '550', 'Martin Fowler', '2022-10-30'), 
('Introduction to Algorithms', '1200', 'Thomas H. Cormen', '2021-09-10'), 
('Docker for Developers', '350', 'Emily Davis', '2024-01-12'), 
('The Pragmatic Programmer', '320', 'Andy Hunt', '2020-04-07'); 

insert into users
(username, password, email, role) values
('john_admin', 'secureAdminPass1!', 'john.admin@library.com', 'ADMIN'),
('susan_librarian', 'librarianPass2024$', 'susan.librarian@library.com', 'LIBRARIAN'),
('mike_doe', 'mikeDoePass123!', 'mike.doe@example.com', 'MEMBER'), 
('jane_smith', 'janeSmithPass456$', 'jane.smith@example.com', 'MEMBER'), 
('alex_johnson', 'alexJohnson789!', 'alex.johnson@example.com', 'MEMBER'), 
('emily_davis', 'emilyDavis987!', 'emily.davis@example.com', 'MEMBER'), 
('robert_brown', 'robertBrown321!', 'robert.brown@example.com', 'MEMBER'), 
('lisa_miller', 'lisaMiller654!', 'lisa.miller@example.com', 'MEMBER'), 
('daniel_wilson', 'danielWilson852!', 'daniel.wilson@example.com', 'MEMBER'), 
('sophia_taylor', 'sophiaTaylor963!', 'sophia.taylor@example.com', 'MEMBER');

insert into orders (order_date, user_id) values
(CURDATE(), 3),
(DATE_SUB(CURDATE(), INTERVAL 1 DAY), 4),
(DATE_SUB(CURDATE(), INTERVAL 2 DAY), 5), 
(DATE_SUB(CURDATE(), INTERVAL 3 DAY), 6), 
(DATE_SUB(CURDATE(), INTERVAL 4 DAY), 7), 
(DATE_SUB(CURDATE(), INTERVAL 5 DAY), 8),
(DATE_SUB(CURDATE(), INTERVAL 6 DAY), 9),
(DATE_SUB(CURDATE(), INTERVAL 7 DAY), 10);

insert into order_details (quantity, order_id, book_id) values
(1, 1, 1),
(1, 1, 3),
(1, 2, 5),
(1, 2, 7),
(1, 2, 9),
(1, 3, 11),
(1, 3, 12),
(1, 4, 10),
(1, 5, 4),
(1, 6, 8),
(1, 6, 15),
(1, 7, 14),
(1, 8, 13);
