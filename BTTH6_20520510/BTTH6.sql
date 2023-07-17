CREATE DATABASE SV;

USE SV;

CREATE TABLE SinhVien (
  MSSV VARCHAR(10) PRIMARY KEY,
  HoTen VARCHAR(255),
  NgaySinh char(10),
  DiemToan FLOAT(4, 1),
  DiemLy FLOAT(4, 1),
  DiemHoa FLOAT(4, 1),
  DiemTrungBinh FLOAT(4, 1)
);

INSERT INTO SinhVien (MSSV, HoTen, NgaySinh, DiemToan, DiemLy, DiemHoa)
VALUES
  ('09520001', 'Thạch Sanh', '01/01/1995' ,6, 4.5, 7),
  ('09520002', 'Lý Thông', '02/02/1995',10, 10, 10),
  ('09520003', 'Bạch Tuyết', '03/03/1995', 5, 7, 8),
  ('09520004', 'Chí Phèo', '07/07/1996', 9.5, 10, 9),
  ('09520005', 'A Phủ', '09/09/1996',7, 7, 7);

-- Cập nhật điểm trung bình tự động
UPDATE SinhVien
SET DiemTrungBinh = (DiemToan + DiemLy + DiemHoa) / 3;

