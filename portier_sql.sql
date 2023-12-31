create database if not exists portier_db;
use portier_db;

create table if not exists title_with_description
(
    Id          int primary key auto_increment,
    Title       varchar(255),
    Description text
);

insert into title_with_description (Title, Description)
values (
#         index
        'Digital Product Designer.',
        'I am Portier, experienced Digital Product Designer based on Florida. I am here to help you build your amazing product.'),

       ('What people say about me',
        'These steps are: Deep Observation (The Passive Mode), Skills Acquisition (The Practice Mode), and Experimentation (The Active Mode).'),

       ('I’ve worked with more than 200 companies & startups around the world',
        'Empathy plays an enormous role in learning and knowledge.'),

       ('50%',
        'One repays a teacher badly if one remains only a pupil.'),

       ('90%',
        'One repays a teacher badly if one remains only a pupil.'),

       ('How about we make something awesome together?',
        'If we keep practicing, we gain fluency; basic skills are mastered, allowing us to take on newer and more exciting challenges'),

#      Portfolio

       ('I love <span>what I do</span> and I make sure I do great.',
        'I am Portier, experienced Digital Product Designer based on Florida. I
          am here to help you build your amazing product.'),

#     about

       ('I am Portier UI-UX Designer based in Florida.',
        'Become who you are by learning who you are.'),

       ('What makes me who I am.',
        '“If you work on yourself first, as Faraday did, developing a solid work ethic and organizational skills, eventually the right teacher will appear in your life.'),


       ('50+',
        'The game you want to play is different: to instead find a niche in
            the ecology that you can dominate.'),

       ('90%',
        'The game you want to play is different: to instead find a niche in
            the ecology that you can dominate.'),

       ('12k',
        'The game you want to play is different: to instead find a niche in
            the ecology that you can dominate.'),

       ('Companies I have worked with.',
        'This means that you move toward challenges that will toughen and
        improve you, where you will get the most objective feedback on your
        performance and progress.
        You do not choose apprenticeships that seem easy and comfortable'),


       ('Find tips about the best design practices',
        'Everything in nature has a structure, a way that the parts relate to one another, which is generally fluid and not so easy to conceptualize.'),

       ('Latest articles',
        'Repeated failure will toughen your spirit and show you with absolute clarity how things must be done.');


create table if not exists skill
(
    id          int primary key auto_increment,
    title       varchar(255),
    description text
);

insert into skill (title, description)
values ('UI-UX Designer', 'The time that leads to mastery is dependent on the intensity of our focus.'),
       ('Product Design', 'The time that leads to mastery is dependent on the intensity of our focus.'),
       ('Writing', 'The time that leads to mastery is dependent on the intensity of our focus.');

create table if not exists work_card
(
    id   int primary key auto_increment,
    name varchar(255),
    url  varchar(255),
    url2 varchar(255),
    url3 varchar(255)

);

insert into work_card (name, url, url2, url3)
values ('workCard1', 'images/dist/img Home Portfolio/Work Card.webp',
        'images/dist/img Home Portfolio/Work Card (3).webp',
        'images/dist/img Home Portfolio/Work Card (6).webp'),

       ('workCard2', 'images/dist/img Home Portfolio/Work Card (1).webp',
        'images/dist/img Home Portfolio/Work Card (4).webp',
        'images/dist/img Home Portfolio/Work Card (7).webp'),

       ('workCard3', 'images/dist/img Home Portfolio/Work Card(2).webp',
        'images/dist/img Home Portfolio/Work Card (5).webp',
        'images/dist/img Home Portfolio/Work Card (8).webp');

create table if not exists article
(
    id          int primary key auto_increment,
    title       varchar(255),
    description text,
    url  varchar(255),
    url2 varchar(255)
);

insert into article (title, description, url, url2)
values ('I build products for companies & startups.',
        'Everything in nature has a structure, a way that the parts relate to one another, which is generally fluid and not so easy to conceptualize.',
        'images/dist/img Home Portfolio/Rectangle 4.webp',
        'images/dist/img Home Portfolio/Rectangle 4 (2).webp'),

       ('My main goal is too keep my customers satisfied.',
        'Even with skills that are primarily mental, such as computer programming or speaking a foreign language. it remains the case that we learn best through practice and repetition—the natural learning process.',
        'images/dist/img Home Portfolio/Rectangle 4 (1).webp',
        'images/dist/img Home Portfolio/Rectangle 4 (3).webp'),

       ('Free fonts alternatives: The ultimate guide',
        'You must engrave deeply in your mind and never forget: your emotional commitment to what you are doing will be translated into your work.',
        'images/dist/img Blog About me/Rectangle 1 (3).webp',
        'images/dist/img Blog About me/Rectangle 1 (11).webp'),

       ('How to design an app from stratch',
        'You must engrave deeply in your mind and never forget: your
              emotional commitment to what you are doing will be translated into
              your work.',
        'images/dist/img Blog About me/Rectangle 1.webp',
        'images/dist/img Blog About me/Rectangle 1 (7).webp'),

       ('100 things a UI-UX Designer should know',
        'You must engrave deeply in your mind and never forget: your
              emotional commitment to what you are doing will be translated into
              your work.',
        'images/dist/img Blog About me/Rectangle 1 (1).webp',
        'images/dist/img Blog About me/Rectangle 1 (8).webp'),

       ('4 rules for intuitive UX',
        'You must engrave deeply in your mind and never forget: your
              emotional commitment to what you are doing will be translated into
              your work.',
        'images/dist/img Blog About me/Rectangle 1 (2).webp',
        'images/dist/img Blog About me/Rectangle 1 (9).webp');

create table if not exists feedback
(
    id       int primary key auto_increment,
    text     text,
    author   varchar(255),
    position varchar(255),
    url      varchar(255)
);

insert into feedback (text, author, position, url)
values ('“In fact, whenever you must learn a new skill or alter your career path later in life, you reconnect with that youthful, adventurous part of yourself.”',
        'Domingo Menenses',
        'Cobrand - CEO',
        'images/dist/img Home Portfolio/Ellipse 2 (1).webp'),

       ('“In fact, whenever you must learn a new skill or alter your career path later in life, you reconnect with that youthful, adventurous part of yourself.”',
        'Karla Benivez',
        'Tinnie - CO-Founder',
        'images/dist/img Home Portfolio/Avatar.webp'),

       ('“In fact, whenever you must learn a new skill or alter your career path later in life, you reconnect with that youthful, adventurous part of yourself.”',
        'Mark Clark',
        'Airbnb - Lead Designer',
        'images/dist/img Home Portfolio/Avatar (1).webp');

create table if not exists quality
(
    id       int primary key auto_increment,
    title    varchar(255),
    description text
);

insert into quality (title, description)
values ('Passionate',
        'As Pasteur himself commented, “Chance favors only the prepared
              mind.'),

       ('Discipline',
        'As Pasteur himself commented, “Chance favors only the prepared
              mind.'),

       ('Curious',
        'As Pasteur himself commented, “Chance favors only the prepared
              mind.'),

       ('Creative',
        'As Pasteur himself commented, “Chance favors only the prepared
              mind.'),

       ('Team Work',
        'As Pasteur himself commented, “Chance favors only the prepared
              mind.'),

       ('Compassionate',
        'As Pasteur himself commented, “Chance favors only the prepared
              mind.');

create table if not exists experience
(
    id       int primary key auto_increment,
    name    varchar(255),
    description text
);


insert into experience (name, description)
values ('Modulz',
        'Lead Designer'),
       ('Stitches',
        'UI Designer'),
       ('Vercel',
        'Frontend developer'),
       ('Framer',
        'UX Designer'),
       ('Figma',
        'Lead Developer');







