public class Main {
    public static void main(String[] args) {
        create database quanlyhocvien;
        use quanlyhocvien;
        create table class_tab (
                id int not null primary key auto_increment,
                ten varchar(40),
                ngongu varchar(30),
                mieuta varchar(255)
);
        create table Address  (
                id int not null primary key auto_increment,
                diachi varchar(40)
);
        create table Students  (
                id int not null primary key auto_increment,
                hovaten varchar(40),
                diachi_id varchar(40),
                tuoi int,
        soddt varchar(40),
                lop_id varchar(40)
);
        create table Course   (
                id int not null primary key auto_increment,
                ten varchar(40),
                mieuta varchar(255)
);
        create table Point  (
                id int not null primary key auto_increment,
                makhoahoc_id varchar(40),
                masinhvien_id varchar(40),
                diem int
);
        insert into class_tab values(1, "lớpc09", "MOS Powerpoint","KHÓA THI MOS 281 (THÁNG 1/2023)"),
        (2, "lớpc10", "MOS Word","KHÓA THI MOS 281 (THÁNG 1/2023)"),
        (3, "lớpc11", "MOS Word","KHÓA THI MOS 281 (THÁNG 1/2023)"),
        (4, "lớpc12", "MOS Word","KHÓA THI MOS 281 (THÁNG 1/2023)"),
        (5, "lớpc13", "MOS Word","KHÓA THI MOS 281 (THÁNG 1/2023)");
        insert into address values(1,"Thái Nguyên"),
        (2, "Hà Nội"),
        (3, "Hải Phòng"),
        (4, "ĐÀ NẴng"),
        (5, "Tuyên Quang");
        insert into Students values(1, "Nguyễn Phan Hoàng Anh", 4,22,"0934.02.33.00",2),
        (2, "Đỗ Thu An", 1,18,"0937.27.25.21",2),
        (3, "Nguyễn Ngọc Tuyết Trinh", 2,21,"0767.71.99.77",2),
        (4, "Trần Ngọc Thúy Vi", 3,23,"077.616.0550",3),
        (5, "Nguyễn Thanh Hiền", 1,22,"0707.28.5665",4),
        (6, "Nguyễn Ngọc Tuyết Trinh ", 1,24,"0932.111.240",5),
        (7, "Nguyễn Thị Phương Thảo", 2,19,"0703.46.49.40",2),
        (8, "Nguyễn Hồng Kim Ngọc", 3,22,"0933.94.81.94",3),
        (9, "Nguyễn Hải Hà", 1,21,"0937.50.58.53",1),
        (10, "Phạm Đan Thanh", 4,19,"0937.27.26.21",3);
        insert into Point values(1, 2, 5,99),
        (2, 2, 4, 60),
        (3, 2, 3, 77),
        (4, 2, 2, 90),
        (5, 2, 1, 80),
        (6, 2, 6, 69),
        (7, 2, 7, 95),
        (8, 2, 8, 86),
        (9, 2, 9, 75),
        (10, 2, 10, 66),
        (11, 1, 10,90),
        (12, 1, 9, 99),
        (13, 1, 8, 70),
        (14, 1, 7, 60),
        (15, 1, 6, 82),
        (1, 1, 5,99);
        insert into quanlyhocvien.course values (1, "MOS Powerpoint","KHÓA THI MOS 281 (THÁNG 1/2023)"),
        (2, "MOS Word","KHÓA THI MOS 281 (THÁNG 1/2023)");
        -- tìm họ nguyễn
        select * from students
        where hovaten like 'Nguyễn%';
        -- tìm tên an
        select * from students
        where hovaten like '%An';
        -- tìm tuổi từ 18 - 22
        select * from students
        where tuoi between 18 and 22;
        -- tìm kiếm 12 hoặc 13
        select * from point
        where id=12 or id=13;
        -- số lượng học viên tại các lớp
        select count(hovaten) from students;
        -- số lượng hoc viên tại các tỉnh là
        select count(distinct diachi_id) from students
        -- tính điểm trung bình của các khoá học
    }
}