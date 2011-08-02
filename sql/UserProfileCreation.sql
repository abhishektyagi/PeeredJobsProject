create table userprofile(
username varchar(26) PRIMARY KEY REFERENCES user(username) ON DELETE CASCADE,
firstname varchar(26),
lastname varchar(26),
sex char(2),
birthday char(15),
city varchar(26),
state varchar(26),
country varchar(26),
email varchar(50),
organization varchar(50),
designation varchar(50),
role varchar(26)
)