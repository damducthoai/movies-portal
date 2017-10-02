drop database if exists movies_portal;
create database movies_portal;

use movies_portal;

drop table if exists users;

create table users(
	user_id bigint(20) AUTO_INCREMENT,
    user_email varchar(100),
    user_pass varchar(255),
    user_name varchar(250),
    user_registed datetime,
    user_status int(1),
    user_action_key varchar(255),
    user_url varchar(250),
    primary key (user_id)
);
insert into users(user_email, user_pass, user_name,user_registed, user_status, user_action_key) 
		values ("admin","admin","admin",now(),1,"123@abc");

insert into users(user_email, user_pass, user_name,user_registed, user_status, user_action_key) 
		values ("user","user","user",now(),1,"123@abc");
        
drop table if exists authorities;

create table authorities(
	user_id bigint(20) ,
    authority varchar(255),
    primary key (user_id, authority)
);

insert into authorities(user_id, authority) values (1,"ADMIN");
insert into authorities(user_id, authority) values (1,"USER");
insert into authorities(user_id, authority) values (2,"USER");

drop table if exists url_meta;
create table url_meta(
    url_data varchar(255),
    url_type int(1), -- 1: post, 2: actor
    media_id bigint(20), -- add 
    primary key (url_data, url_type)
);

drop table if exists posts;
create table posts(
	post_id bigint(20) AUTO_INCREMENT,
    post_author bigint(20),
    post_date datetime,
    post_date_gmt datetime,
    post_content TEXT,
	post_title TEXT,
    post_except TEXT,
    post_status int(11),
    post_password varchar(255),
    comment_status int(11),
    post_modified datetime,
    post_modified_gmt datetime,
    post_modified_by bigint(20),
    comment_count bigint(20),
    post_type int(11), -- 0: bai dang binh thuong, 1: phim ngan, 2: phim nhieu tap
    post_url varchar(250),
    num_of_part bigint(20),
    primary key (post_id)
);

drop table if exists rating;
create table rating(
	rate_id bigint(20),
    rate_size int(11),
    post_id bigint(20),
    user_id bigint(20),
    client_name varchar(255),
    client_email varchar(255),
    client_ip varchar(255),
    primary key(rate_id),
    foreign key (post_id) references posts(post_id),
    foreign key (user_id) references users(user_id)
);

drop table if exists complains;
create table conpains(
	complain_id bigint(20),
    complain_content text,
    complain_type int(11),
    compaint_reference_id bigint(20),
    primary key (complain_id)
);

drop table if exists categories;
create table categories(
	category_id bigint(20) auto_increment,
    category_parent bigint(20), -- default: 0
    category_name varchar(250),
    primary key (category_id)
);

create table categories_meta(
	post_id bigint(20),
    category_id bigint(20),
    primary key (post_id, category_id)
);

drop table if exists tags;
create table tags (
	tag_id bigint(20),
    tag_name varchar(255),
    primary key (tag_id)
);

drop table if exists tags_meta;
create table tags_meta(
	tag_id bigint(20),
    refences_id bigint(20),
    meta_type int(11), -- 1: photo, 2: video, 3: subtitle, 4: post, 5: actor, 6: trailer
    primary key (tag_id, meta_type),
    foreign key (tag_id) references tags(tag_id)
);

drop table if exists files; -- storage information about binary media file
create table files(
    file_id          bigint(20) auto_increment,
    file_title       varchar(255),
    file_type        int(11), -- :1 photo, 2: video, 3: subtitle, 4: attatch file
    file_description text,
    file_name        varchar(255),
    created_by       bigint(20),
    modified_by      bigint(20),
    thumnail_id      bigint(20),
    file_status      int(1),
    file_url         VARCHAR(255),
    primary key (file_id),
    foreign key (thumnail_id) references files(file_id)
);
insert into files(file_title,file_type) values ("abc",1);

drop table if exists actors;
create table actors(
	actor_id bigint(20) auto_increment,
    actor_name varchar(250),
    actor_day_of_birth datetime,
    actor_photo_id bigint(20),
    actor_nickname varchar(250),
    actor_address varchar(250),
    actor_others TEXT,
    primary key (actor_id),
    foreign key (actor_photo_id)references files(file_id)
);

drop table if exists trailers;
create table trailers(
    post_id bigint(20),
    file_video_id bigint(20),
    primary key (post_id, file_video_id),
    foreign key (file_video_id)references files(file_id)
);


drop table if exists post_video_meta;
create table  post_video_meta(
	post_id bigint(20),
    file_video_id bigint(20),
    part_num bigint(20),
    video_quality int(11),
    primary key (post_id, file_video_id, part_num),
    foreign key (post_id) references posts(post_id),
    foreign key (file_video_id) references files(file_id)
);

drop table if exists video_subtitle_meta;
create table video_subtitle_meta(
	file_video_id bigint(20),
    file_subtitle_id bigint(20),
    foreign key (file_video_id) references files(file_id),
    foreign key (file_subtitle_id) references files(file_id),
    primary key (file_video_id, file_subtitle_id)
);

create table post_actor_meta(
	post_id bigint(20),
    actor_id bigint(20),
    foreign key (post_id) references posts(post_id),
    foreign key (actor_id) references actors(actor_id),
    primary key (post_id, actor_id)
);
