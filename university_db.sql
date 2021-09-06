CREATE TABLE sinh_vien(
masv int auto_increment primary key,
tensv varchar(50),
gioi_tinh boolean,
ngay_sinh date,
ma_lop int
);

CREATE TABLE lop(
ma_lop int primary key auto_increment,
ten_lop varchar(50),
ma_nganh int
);

ALTER TABLE sinh_vien
ADD foreign key(ma_lop) references lop(ma_lop);

CREATE TABLE nganh(
ma_nganh int primary key auto_increment,
ten_nganh varchar(50),
ma_khoa int
);

ALTER TABLE lop
ADD foreign key(ma_nganh) references nganh(ma_nganh);

CREATE TABLE khoa(
ma_khoa int primary key auto_increment,
ten_khoa varchar(50)
);

ALTER TABLE nganh
ADD foreign key(ma_khoa) references khoa(ma_khoa);

CREATE TABLE giang_vien(
ma_gv int primary key auto_increment,
ten_gv varchar(50),
gioi_tinh boolean,
nam_sinh int,
ma_chucvu int,
ma_bangcap int
);

CREATE TABLE gv_nganh(
ma_gv int,
ma_nganh int
);

ALTER TABLE gv_nganh
ADD primary key(ma_gv, ma_nganh);

ALTER TABLE gv_nganh
ADD foreign key(ma_gv) references giang_vien(ma_gv);

ALTER TABLE gv_nganh
ADD foreign key(ma_nganh) references nganh(ma_nganh);

CREATE TABLE chuc_vu(
ma_chucvu int auto_increment primary key,
chuc_vu varchar(50)
);

ALTER TABLE giang_vien
ADD foreign key(ma_chucvu) references chuc_vu(ma_chucvu);

CREATE TABLE bang_cap(
ma_bang int auto_increment primary key,
bang_cap varchar(50)
);

ALTER TABLE giang_vien
ADD foreign key(ma_bangcap) references bang_cap(ma_bang);

CREATE TABLE diem(
ma_sv int,
ma_monhoc int,
diem int
);

ALTER TABLE diem
ADD primary key(ma_sv, ma_monhoc) ;

CREATE TABLE mon_hoc(
ma_monhoc int auto_increment primary key,
ten_monhoc varchar(50)
);

ALTER TABLE diem
ADD foreign key(ma_sv) references sinh_vien(masv);

ALTER TABLE diem
ADD foreign key(ma_monhoc) references mon_hoc(ma_monhoc);