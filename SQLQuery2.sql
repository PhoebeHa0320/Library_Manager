USE [QuanLyThuVien]
GO
/****** Object:  Table [dbo].[DOCGIA]    Script Date: 6/18/2021 5:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[DOCGIA](
	[HoTenDG] [nvarchar](50) NOT NULL,
	[LoaiDG] [varchar](1) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[NgayLapThe] [date] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[HoTenDG] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MUONTRASACH]    Script Date: 6/18/2021 5:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[MUONTRASACH](
	[NgayMuon] [date] NOT NULL,
	[NgayTra] [date] NOT NULL,
	[HoTenDG] [nvarchar](50) NOT NULL,
	[MaSach] [varchar](50) NOT NULL,
	[TenSach] [nvarchar](100) NOT NULL,
	[SoNgayMuon] [int] NOT NULL,
	[SoLuotMuon] [int] NOT NULL,
	[SoNgayTraTre] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[NgayMuon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[NGUOIDUNG]    Script Date: 6/18/2021 5:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NGUOIDUNG](
	[TenDangNhap] [varchar](50) NOT NULL,
	[MatKhau] [varchar](20) NOT NULL,
	[VaiTro] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[TenDangNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[THONGTINSACH]    Script Date: 6/18/2021 5:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[THONGTINSACH](
	[MaSach] [varchar](50) NOT NULL,
	[TenSach] [nvarchar](100) NOT NULL,
	[TheLoai] [nvarchar](50) NOT NULL,
	[TacGia] [nvarchar](100) NOT NULL,
	[NamXuatBan] [int] NOT NULL,
	[NhaXuatBan] [nvarchar](50) NOT NULL,
	[NgayNhap] [date] NOT NULL,
	[GiaTri] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[TinhTrang] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[VIPHAM]    Script Date: 6/18/2021 5:40:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VIPHAM](
	[SoTienThu] [int] NOT NULL,
	[HoTenDG] [nvarchar](50) NOT NULL,
	[TienPhatKyNay] [int] NOT NULL,
	[TienNoKyNay] [int] NOT NULL,
	[TongNo] [int] NOT NULL,
	[TienConLai] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[SoTienThu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Bùi Anh Đức', N'Y', CAST(N'1998-05-12' AS Date), N'54 Hàng Trống', N'anhdao@gmail.com', CAST(N'2020-09-20' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Bùi Công Đạt', N'Y', CAST(N'2000-05-16' AS Date), N'68 Thái Thịnh', N'anhdao@gmail.com', CAST(N'2021-02-15' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Bùi Văn Hiệu', N'Y', CAST(N'1999-05-12' AS Date), N'224 Nguyễn Trãi', N'anhdao@gmail.com', CAST(N'2021-03-16' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Đặng Quang Anh', N'Y', CAST(N'2000-05-29' AS Date), N'28 Yên Lãng', N'quanganh@gmail.com', CAST(N'2021-01-20' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Đô Văn Linh', N'Y', CAST(N'1999-05-29' AS Date), N'278 Cầu Giấy', N'anhdao@gmail.com', CAST(N'2020-07-21' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Hồ Ánh Như ', N'X', CAST(N'1999-02-09' AS Date), N'24 Nguyễn Xiển', N'anhdao@gmail.com', CAST(N'2021-05-17' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Hoàng Thị Giang', N'X', CAST(N'2000-06-21' AS Date), N'18 Trường Chinh', N'hoanggiang@gmail.com', CAST(N'2020-08-02' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Lê Huy Bách', N'Y', CAST(N'2001-05-22' AS Date), N'53 Triều Khúc', N'anhdao@gmail.com', CAST(N'2020-11-26' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Lê Thúy Huyền', N'X', CAST(N'2000-04-09' AS Date), N'36 Yên Phụ', N'anhdao@gmail.com', CAST(N'2021-04-06' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Lê Văn Cương ', N'Y', CAST(N'2001-06-09' AS Date), N'27 Quán Thánh', N'anhdao@gmail.com', CAST(N'2021-01-20' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Lương Như Ý', N'X', CAST(N'2000-08-19' AS Date), N'456 Vũ Tông Phan', N'anhdao@gmail.com', CAST(N'2021-03-26' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Nghiêm Xuân Doanh', N'Y', CAST(N'1998-04-15' AS Date), N'122 Thượng Đình', N'anhdao@gmail.com', CAST(N'2021-01-20' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Ngô Anh Đào', N'X', CAST(N'1997-05-09' AS Date), N'144 Quan Nhân', N'anhdao@11gmail.com', CAST(N'2021-05-12' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Ngô Bắc Hòa', N'Y', CAST(N'2002-08-14' AS Date), N'27 Khương Đình', N'anhdao@gmail.com', CAST(N'2021-05-06' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Ngô Thị Minh', N'X', CAST(N'2000-05-23' AS Date), N'265 Khâm Thiêm', N'anhdao@gmail.com', CAST(N'2021-04-23' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Nguyễn Đức Lượng', N'Y', CAST(N'1999-09-09' AS Date), N'36 Khương Đình', N'anhdao@gmail.com', CAST(N'2021-02-26' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Nguyên Thanh Nam', N'X', CAST(N'2000-07-09' AS Date), N'26 Đông Tác', N'anhdao@gmail.com', CAST(N'2021-06-02' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Nguyễn Thị Ánh', N'X', CAST(N'1998-03-09' AS Date), N'25 Thái Hà', N'anhnguyen@gmail.com', CAST(N'2021-02-21' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Phạm Thị Hương', N'X', CAST(N'1997-07-14' AS Date), N'127 Khuất Duy Tiến', N'phamhuong@gmail.com', CAST(N'2021-01-22' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Phan Văn Huyền', N'Y', CAST(N'1987-05-12' AS Date), N'278 Hoàng Quốc Việt', N'phanhuyen@gmail.com', CAST(N'2020-07-26' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Tống Thị Thu', N'X', CAST(N'1999-06-17' AS Date), N'45 Hoàng Ngân', N'anhdao@gmail.com', CAST(N'2021-06-12' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Trần Thanh Liêm', N'Y', CAST(N'1997-05-09' AS Date), N'236 Nguyễn Khang', N'anhdao@gmail.com', CAST(N'2021-03-26' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Trần Thị Dương', N'X', CAST(N'1999-10-12' AS Date), N'4 Chính Kinh', N'tranduong@gmail.com', CAST(N'2020-10-18' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Trần Thị Hoa', N'X', CAST(N'1999-12-09' AS Date), N'39 Hoàng Cầu', N'tranhoa@gmail.com', CAST(N'2020-12-22' AS Date))
INSERT [dbo].[DOCGIA] ([HoTenDG], [LoaiDG], [NgaySinh], [DiaChi], [Email], [NgayLapThe]) VALUES (N'Trần Văn Quốc', N'Y', CAST(N'1999-02-11' AS Date), N'12 Dương Đình Nghệ', N'tranquoc@gmail.com', CAST(N'2021-03-16' AS Date))
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-01-21' AS Date), CAST(N'2021-01-28' AS Date), N'Ngô Anh Đào', N'MS003', N'Tự Học Photoshop CC', 7, 20, 3)
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-01-22' AS Date), CAST(N'2021-01-28' AS Date), N'Ngô Anh Đào', N'MS071', N'3 Phút Sơ Cứu', 6, 10, 2)
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-02-11' AS Date), CAST(N'2021-02-20' AS Date), N'Đặng Quang Anh', N'MS047', N'Cấu Tạo Kiến Trúc Và Chọn Hình Kết Cấu', 9, 10, 5)
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-02-14' AS Date), CAST(N'2021-02-19' AS Date), N'Nghiêm Xuân Doanh', N'MS042', N'Sáng Tác Kiến Trúc', 5, 10, 1)
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-03-12' AS Date), CAST(N'2021-03-15' AS Date), N'Lê Văn Cương ', N'MS089', N'Dám Mơ Lớn - Đừng Hoài Phí Tuổi Trẻ', 3, 10, 0)
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-03-16' AS Date), CAST(N'2021-03-18' AS Date), N'Phạm Thị Hương', N'MS011', N'Lập Trình Và Cuộc Sống', 2, 20, 0)
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-04-14' AS Date), CAST(N'2021-04-25' AS Date), N'Nguyễn Thị Ánh', N'MS038', N'10 Kỳ Quan Kiến Trúc Thế Giới', 11, 10, 7)
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-04-19' AS Date), CAST(N'2021-04-22' AS Date), N'Trần Văn Quốc', N'MS018', N'Hệ thống thông tin quản lý', 3, 10, 0)
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-05-02' AS Date), CAST(N'2021-05-12' AS Date), N'Lê Thúy Huyền', N'MS099', N'Tôi tài giỏi bạn cũng thế', 10, 10, 6)
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-05-08' AS Date), CAST(N'2021-05-12' AS Date), N'Ngô Thị Minh', N'MS067', N'Tony Buổi Sáng Trên Đường Băng', 4, 10, 0)
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-05-18' AS Date), CAST(N'2021-05-27' AS Date), N'Hồ Ánh Như', N'MS029', N'Giáo Trình Hệ Thống Thông Tin Hỗ Trợ Ra Quyết Định', 9, 10, 5)
INSERT [dbo].[MUONTRASACH] ([NgayMuon], [NgayTra], [HoTenDG], [MaSach], [TenSach], [SoNgayMuon], [SoLuotMuon], [SoNgayTraTre]) VALUES (CAST(N'2021-06-04' AS Date), CAST(N'2021-06-08' AS Date), N'Trần Thanh Liêm', N'MS030', N'Giáo Trình Cơ Sở An Toàn Thông Tin', 4, 10, 0)
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'anhdao', N'abc123', N'docgia')
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'doanh', N'doanh123', N'docgia')
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'hoangha', N'ha123', N'admin')
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'huong', N'huong123', N'docgia')
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'huyen', N'huyen123', N'docgia')
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'lecuong', N'cuong123', N'docgia')
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'liem', N'liem123', N'docgia')
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'minh', N'minh123', N'docgia')
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'ngohien', N'hien123', N'admin')
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'nhu', N'nhu123', N'docgia')
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'quoc', N'quoc123', N'docgia')
INSERT [dbo].[NGUOIDUNG] ([TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'quochung', N'hung123', N'admin')
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS001', N' Code Dạo Kí Sự Lập Trình Viên Đâu Phải Chỉ Biết Code', N'CNTT', N'Phạm Huy Hoàng', 2017, N'NXB Dân Trí', CAST(N'2018-10-03' AS Date), 100000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS002', N'Hành Trang Lập Trình  Những Kỹ Năng Lập Trình Viên Chuyên Nghiệp Cần Có', N'CNTT', N'Vũ Công Tấn Tài', 2020, N'NXB Thanh Niên', CAST(N'2016-05-09' AS Date), 112000, 100, 80)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS003', N'Tự Học Photoshop CC', N'CNTT', N'Phạm Quang Huy', 2020, N'NXB Thanh Niên', CAST(N'2018-09-07' AS Date), 127000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS004', N'Giáo Trình Xử Lý Ảnh Photoshop CC', N'CNTT', N'Phạm Quang Huấn', 2021, N'NXB Thanh Niên', CAST(N'2016-02-11' AS Date), 123000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS005', N'Giáo trình quản lý dự án công nghệ thông tin', N'CNTT', N'Nhiều tác giả', 2019, N'NXB Đại Học Kinh Tế Quốc Dân', CAST(N'2019-05-16' AS Date), 65000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS006', N'Hacker Lược sử', N'CNTT', N'Steven Levy', 2019, N'NXB Công Thương', CAST(N'2019-07-22' AS Date), 233000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS007', N'Tự Học Nhanh Microsoft Office Visio', N'CNTT', N'Phạm Quang Hiển - Vãn Thị Tư', 2021, N'NXB Thanh Niên', CAST(N'2021-05-17' AS Date), 139000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS008', N'Gián Điệp Mạng', N'CNTT', N'Clifford Stoll', 2018, N'NXB Công Thương', CAST(N'2018-04-22' AS Date), 178000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS009', N'Nghệ Thuật Ẩn Mình', N'CNTT', N'Kevin Mitnick', 2018, N'NXB Công Thương', CAST(N'2018-08-24' AS Date), 178000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS010', N'Bóng Ma Trên Mạng', N'CNTT', N'William L Simon', 2018, N'NXB Công Thương', CAST(N'2018-08-14' AS Date), 170000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS011', N'Lập Trình Và Cuộc Sống', N'CNTT', N'Jeff Atwood', 2018, N'NXB Thanh Niên', CAST(N'2018-05-12' AS Date), 100000, 100, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS012', N'Giáo Trình Vi Xử Lý Và Cấu Trúc Máy Tính', N'CNTT', N'Ngô Diễn Tập- Kiều Xuân Thực', 2017, N'NXB Giáo Dục', CAST(N'2017-08-16' AS Date), 54000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS013', N'Sách Cơ sở dữ liệu quan hệ và công nghệ phân tích thiết kế', N'CNTT', N'TS-Lê Văn Phùng', 2018, N'NXB Thông Tin Và Truyền Thông', CAST(N'2018-07-12' AS Date), 71000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS014', N'Cấu trúc dữ liệu và thuật toán Tập 1 Phân tích và cài đặt trên C/C++', N'CNTT', N'Trần Thông Quế', 2018, N'NXB Thông Tin Và Truyền Thông', CAST(N'2018-05-24' AS Date), 76000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS015', N'Phục hồi và phân tích Dữ liệu điện tử', N'CNTT', N'PGSTS Trần Văn Hòa -TS Nguyễn Ngọc Cương', 2019, N'NXB Thông Tin Và Truyền Thông', CAST(N'2019-07-26' AS Date), 140000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS016', N'Cấu trúc dữ liệu và thuật toán Tập 2 Phân tích và cài đặt trên C/C++', N'CNTT', N'Trần Thông Quế', 2018, N'NXB Thông Tin Và Truyền Thông', CAST(N'2018-07-12' AS Date), 55000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS017', N'Lý thuyết cơ sở dữ liệu Quan hệ và Ứng dụng', N'CNTT', N'TS Nguyễn Ngọc Cương - TS Phạm Thị Anh Lê', 2019, N'NXB Thông Tin Và Truyền Thông', CAST(N'2019-05-21' AS Date), 68000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS018', N'Hệ thống thông tin quản lý', N'CNTT', N'TS Lê Văn Phùng', 2016, N'NXB Thông Tin Và Truyền Thông', CAST(N'2016-07-15' AS Date), 54000, 100, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS019', N'An ninh trong các hệ thống thông tin di động Wlan- 4G và 5G', N'CNTT', N'TS Nguyễn Phạm Anh Dũng', 2020, N'NXB Thông Tin Và Truyền Thông', CAST(N'2020-08-14' AS Date), 141000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS020', N'Đa thức chuỗi và chuyên đề nâng cao', N'CNTT', N'Đàm Văn Nhỉ- Văn Đức Chín- Trần Thị Hồng Dung', 2017, N'NXB Thông Tin Và Truyền Thông', CAST(N'2017-08-22' AS Date), 76000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS021', N'Sáng tạo trong thuật toán và lập trình tập 2', N'CNTT', N'Nguyễn Xuân Huy', 2015, N'NXB Thông Tin Và Truyền Thông', CAST(N'2015-02-24' AS Date), 55000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS022', N'Giáo trình C++ và lập trình hướng đối tượng', N'CNTT', N'Phạm Văn Ất', 2020, N'NXB Bách Khoa Hà Nội', CAST(N'2020-08-15' AS Date), 145000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS023', N'Giáo trình kỹ thuật lập trình C căn bản và nâng cao', N'CNTT', N'GS Phạm Văn Ất- ThS- Nguyễn Hiếu Cường- Lê Trường Thông- ThS. Đỗ Văn Tuấn', 2020, N'NXB Bách Khoa Hà Nội', CAST(N'2020-08-15' AS Date), 135000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS024', N'Cơ sở dữ liệu quan hệ và ứng dụng', N'CNTT', N'PGSTS Nguyễn Bá Tường', 2018, N'NXB Thông Tin Và Truyền Thông', CAST(N'2018-09-16' AS Date), 54000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS025', N'Điện Toán Đám Mây', N'CNTT', N'Huỳnh Quyết Thắng - Nguyễn Hữu Đức- Doãn Trung Tùng-Nguyễn Bình Minh- Trần Việt Trung', 2020, N'NXB Bách Khoa Hà Nội', CAST(N'2020-09-28' AS Date), 61000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS026', N'Tin Học Ứng Dụng', N'CNTT', N'TS Lê Văn Mạnh- ThS.Nguyễn Quốc Tới-ThS.Lê Minh Hải', 2020, N'NXB Khoa Học Tự Nhiên Và Công Nghệ', CAST(N'2020-07-22' AS Date), 88000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS027', N'giáo trình tin học ứng dụng trong thống kê', N'CNTT', N'PGSTS Trần Thị Kim Thu- TS Đỗ Văn Huân', 2019, N'NXB Đại Học Kinh Tế Quốc Dân', CAST(N'2019-02-16' AS Date), 90000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS028', N'Giáo trình Phương pháp tính và tin học chuyên nghành', N'CNTT', N'Nguyễn Chính Cương- Nguyễn Trọng Dũng', 2015, N'NXB Đại Học Sư Phạm', CAST(N'2015-09-28' AS Date), 65000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS029', N'Giáo Trình Hệ Thống Thông Tin Hỗ Trợ Ra Quyết Định', N'CNTT', N'TS Trần Thị Thu Hà', 2020, N'NXB Đại Học Kinh Tế Quốc Dân', CAST(N'2020-08-14' AS Date), 108000, 100, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS030', N'Giáo Trình Cơ Sở An Toàn Thông Tin', N'CNTT', N'PGS Nguyễn Khanh Văn', 2019, N'NXB Bách Khoa Hà Nội', CAST(N'2019-03-25' AS Date), 83000, 100, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS031', N'Cấu Trúc Dữ Liệu Và Thuật Toán', N'CNTT', N'Hoàng Nghĩa Tý', 2020, N'NXB Xây Dựng', CAST(N'2020-08-03' AS Date), 70000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS032', N'12 xu hướng công nghệ trong thời đại 4.0', N'CNTT', N'Kevin Kelly', 2019, N'Đại Học Kinh Tế Quốc Dân', CAST(N'2019-04-06' AS Date), 109000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS033', N'Giáo Trình Ứng Dụng Công Nghệ Thông Tin Trong Dạy Học', N'CNTT', N'Đỗ Mạnh Cường', 2018, N'Nxb Đại học Quốc gia TPHCM', CAST(N'2018-05-22' AS Date), 80000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS034', N'Lập Trình Java Căn Bản', N'CNTT', N'Phạm Văn Trung- Phạm Văn Tho- Bùi Công Thành- Phạm Thị Minh Thương', 2018, N'NXB Xây Dựng', CAST(N'2018-08-15' AS Date), 95000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS035', N'Giáo trình Lập trình hệ thống với Java', N'CNTT', N'Bùi Thanh Hiếu', 2014, N'Nxb Đại học Quốc gia TPHCM', CAST(N'2014-07-24' AS Date), 55000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS036', N'Thiết Kế Kiến Trúc - Render Với Sketchup Và Revit', N'Kiến trúc', N'Phạm Quang Hiển- Trần Tường Thụy', 2020, N'NXB Thanh Niên', CAST(N'2020-04-22' AS Date), 127000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS037', N'Luật Kiến Trúc', N'Kiến trúc', N'Nhiều tác giả', 2019, N'NXB Lao Động', CAST(N'2019-04-25' AS Date), 15000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS038', N'10 Kỳ Quan Kiến Trúc Thế Giới', N'Kiến trúc', N'Nhiều tác giả', 2018, N'NXB Thông Tấn', CAST(N'2018-07-15' AS Date), 81000, 100, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS039', N'Sinh Hoạt Của Người Việt: Cư Trú - Kiến Trúc - Hát', N'Kiến trúc', N'Nguyễn Văn Huyên', 2020, N'NXB Hội Nhà Văn', CAST(N'2020-04-28' AS Date), 175000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS040', N'Kiến Trúc Hướng Dòng Thông Gió Tự Nhiên', N'Kiến trúc', N'Nhiều tác giả', 2020, N'NXB Xây Dựng', CAST(N'2020-09-16' AS Date), 78000, 100, 100)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS041', N'Quang Học Kiến Trúc - Chiếu Sáng Tự Nhiên Và Chiếu Sáng Nhân Tạo', N'Kiến trúc', N'Việt Hà - Nguyễn Ngọc Giả', 2020, N'NXB Xây Dựng', CAST(N'2020-04-26' AS Date), 107000, 200, 200)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS042', N'Sáng Tác Kiến Trúc', N'Kiến trúc', N'Đặng Thái Hoàng', 2020, N'NXB Xây Dựng', CAST(N'2020-07-22' AS Date), 74000, 200, 190)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS043', N'Tư Duy Và Tổ Hợp Kiến Trúc', N'Kiến trúc', N'Đặng Thái Hoàng', 2020, N'NXB Xây Dựng', CAST(N'2020-07-22' AS Date), 84000, 200, 200)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS044', N'Giáo Trình Lịch Sử Kiến Trúc Thế Giới - Tập 2', N'Kiến trúc', N'Đặng Thái Hoàng -Nguyễn Văn Đỉnh - Nguyễn Đình Thi', 2018, N'NXB Xây Dựng', CAST(N'2018-04-25' AS Date), 128000, 200, 200)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS045', N'Mối Quan Hệ Kiến Trúc Và Các Ngành Nghệ Thuật', N'Kiến trúc', N'PGSTS Tôn Thất Đại', 2020, N'NXB Xây Dựng', CAST(N'2020-07-11' AS Date), 80000, 200, 200)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS046', N'Thiết Kế Nội Thất', N'Kiến trúc', N'Francis DK Ching', 2020, N'NXB Xây Dựng', CAST(N'2020-04-22' AS Date), 134000, 200, 200)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS047', N'Cấu Tạo Kiến Trúc Và Chọn Hình Kết Cấu', N'Kiến trúc', N'Nguyễn Đức Thiềm', 2020, N'NXB Xây Dựng', CAST(N'2020-07-02' AS Date), 146000, 200, 190)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS048', N'Luật Xây Dựng', N'Kiến trúc', N'Quốc Hội', 2020, N'NXB Chính Trị Quốc Gia Sự Thật', CAST(N'2020-08-20' AS Date), 50000, 200, 200)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS049', N'Tương lai của kiến trúc', N'Kiến trúc', N'Marc Kushner', 2017, N'NXB Lao Động', CAST(N'2017-08-14' AS Date), 55000, 200, 200)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS050', N'Khám phá các công trình kiến trúc nổi tiếng trên Thế giới - See Inside Bridges  Towers & Tunnels', N'Kiến trúc', N'Struan Reid', 2019, N'Usborne', CAST(N'2019-01-21' AS Date), 278000, 200, 200)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS051', N'Phong Thủy Ứng Dụng Trong Kiến Trúc Hiện Đại', N'Kiến trúc', N'Cao Từ Linh', 2021, N'NXB Hồng Đức', CAST(N'2021-04-02' AS Date), 114000, 200, 200)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS061', N'Đắc Nhân Tâm', N'Kỹ năng sống', N'Dale Carnegie', 2020, N'NXB Tổng Hợp TP HCM', CAST(N'2020-03-17' AS Date), 53000, 300, 300)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS062', N'Nhà Giả Kim', N'Kỹ năng sống', N'Paulo Coelho', 2013, N'NXB Văn Học', CAST(N'2017-08-14' AS Date), 55000, 300, 300)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS063', N'Đời Ngắn Đừng Ngủ Dài', N'Kỹ năng sống', N'Robin Sharma', 201, N'NXB Trẻ', CAST(N'2020-07-15' AS Date), 54000, 300, 300)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS064', N'Khéo Ăn Nói Sẽ Có Được Thiên Hạ', N'Kỹ năng sống', N'Trác Nhã', 2018, N'NXB Văn Học', CAST(N'2019-06-17' AS Date), 69000, 300, 300)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS065', N'Sức Mạnh Tiềm Thức', N'Kỹ năng sống', N'Joseph Murphy', 2016, N'NXB Tổng Hợp TP HCM', CAST(N'2018-08-15' AS Date), 72000, 300, 300)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS066', N'Người Nam Châm - Bí Mật Của Luật Hấp Dẫn', N'Kỹ năng sống', N'Jack Canfield - DD Watkins', 2018, N'NXB Lao Động', CAST(N'2019-08-04' AS Date), 42000, 300, 300)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS067', N'Tony Buổi Sáng Trên Đường Băng', N'Kỹ năng sống', N'Tony Buổi Sáng', 2019, N'NXB Trẻ', CAST(N'2019-06-22' AS Date), 49000, 300, 290)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS068', N'Cà Phê Cùng Tony', N'Kỹ năng sống', N'Tony Buổi Sáng', 2019, N'NXB Trẻ', CAST(N'2019-06-22' AS Date), 53000, 300, 300)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS069', N'Đọc Vị Bất Kỳ Ai', N'Kỹ năng sống', N' David J Lieberman', 2018, N'NXB Lao Động', CAST(N'2018-07-16' AS Date), 51000, 300, 300)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS070', N'Tuổi Trẻ Đáng Giá Bao Nhiêu', N'Kỹ năng sống', N'Rosie Nguyễn', 2020, N'NXB Hội Nhà Văn', CAST(N'2020-09-17' AS Date), 55000, 300, 300)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS071', N'3 Phút Sơ Cứu', N'Kỹ năng sống', N'BS Ngô Đức Hùng', 2019, N'NXB Thế Giới', CAST(N'2020-07-25' AS Date), 93000, 300, 290)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS072', N'Ngày Xưa Có Một Con Bò', N'Kỹ năng sống', N'Camilo Cruz', 2020, N'NXB Trẻ', CAST(N'2020-05-14' AS Date), 45000, 300, 300)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS073', N'Think & Grow Rich - Nghĩ Giàu Và Làm Giàu', N'Kỹ năng sống', N'Napoleon Hill', 2020, N'NXB Tổng Hợp TPHCM', CAST(N'2020-08-12' AS Date), 75000, 90, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS074', N'Không Bao Giờ Là Thất Bại- Tất Cả Là Thử Thách', N'Kỹ năng sống', N'Chung Ju Yung', 2019, N'NXB Tổng Hợp TPHCM', CAST(N'2019-07-25' AS Date), 67000, 90, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS075', N'Quẳng Gánh Lo Đi Và Vui Sống', N'Kỹ năng sống', N'Dale Carnegie', 2016, N'NXB Tổng Hợp TPHCM', CAST(N'2017-08-22' AS Date), 48000, 90, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS076', N'Hành Trình Về Phương Đông', N'Kỹ năng sống', N'Nguyên Phong', 2019, N'NXB Tổng Hợp TPHCM', CAST(N'2019-08-15' AS Date), 85000, 90, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS077', N'Đánh Thức Con Người Phi Thường Trong Bạn', N'Kỹ năng sống', N'Anthony Robbins', 2016, N'NXB Tổng Hợp TPHCM', CAST(N'2017-08-23' AS Date), 115000, 90, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS078', N'Suối Nguồn', N'Kỹ năng sống', N'Ayn Rand', 2018, N'NXB Trẻ', CAST(N'2018-07-25' AS Date), 249000, 90, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS079', N'22 Quy Luật Bất Biến Trong Marketing', N'Kỹ năng sống', N'Al Ries -Jack Trout', 2020, N'NXB Tổng Hợp TPHCM', CAST(N'2020-04-17' AS Date), 62000, 90, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS080', N'Hài Hước Một Chút Thế Giới Sẽ Khác Đi', N'Kỹ năng sống', N'The Book Worm', 2016, N'Nhà Xuất Bản Thanh Niên', CAST(N'2018-05-18' AS Date), 50000, 90, 90)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS081', N'7 Thói Quen Của Bạn Trẻ Thành Đạt', N'Kỹ năng sống', N'Sean Covey', 2017, N'NXB Tổng Hợp TP HCM', CAST(N'2017-07-02' AS Date), 88000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS082', N'Sức Mạnh Của Hiện Tại', N'Kỹ năng sống', N'Eckhart Tolle', 2016, N'NXB Tổng Hợp TP HCM', CAST(N'2018-08-05' AS Date), 93000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS083', N'Hiểu Về Trái Tim', N'Kỹ năng sống', N'Minh Niệm', 2019, N'Nhà Xuất Bản Tổng Hợp TPHCM', CAST(N'2019-04-21' AS Date), 117000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS084', N'Giao Tiếp Bất Kỳ Ai', N'Kỹ năng sống', N'Bennie Boughn - Jon Condrill', 2018, N'Lao Động Xã Hội', CAST(N'2018-07-25' AS Date), 50000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS085', N'Nếu Tôi Biết Được Khi Còn 20', N'Kỹ năng sống', N'Tina Seelig', 2020, N'Nhà Xuất Bản Trẻ', CAST(N'2020-08-23' AS Date), 60000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS086', N'Tảng Băng Tan Đổi Mới Và Thành Công Trong Mọi Hoàn Cảnh', N'Kỹ năng sống', N'John Kotter', 2020, N'Nhà Xuất Bản Hồng Đức', CAST(N'2020-06-25' AS Date), 80000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS087', N'Thay Đổi Cuộc Sống Với Nhân Số Học, Sách Thần Số Học mới nhất 2020', N'Kỹ năng sống', N'Lê Đỗ Quỳnh Hương', 2020, N'NXB Tổng Hợp TP HCM', CAST(N'2020-06-11' AS Date), 179000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS088', N'Nghĩ tích cực cho đời bớt áp lực', N'Kỹ năng sống', N'Tony Burgess - Julie French', 2020, N'NXB Tổng Hợp TP HCM', CAST(N'2020-05-05' AS Date), 79000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS089', N'Dám Mơ Lớn - Đừng Hoài Phí Tuổi Trẻ', N'Kỹ năng sống', N'Lư Tư Hạo', 2019, N'NXB Phụ Nữ', CAST(N'2019-08-25' AS Date), 50000, 50, 40)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS090', N'Messi và Ronaldo đại chiến giữa những vị thần', N'C', N'Luca Caioli', 2019, N'NXB Hà Nội', CAST(N'2019-06-24' AS Date), 87000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS091', N'Cảm Nhận Thế Nào- Đời Trao Thế Đó', N'Kỹ năng sống', N'Andrew Matthews', 2015, N'NXB Trẻ', CAST(N'2016-09-12' AS Date), 56000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS092', N'Quản Lý Công Việc Hiệu Quả Theo Phong Cách Người Nhật', N'Kỹ năng sống', N'Daisuke Sasaki', 2019, N'Nhà Xuất Bản Phụ Nữ ', CAST(N'2019-07-14' AS Date), 64000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS093', N'Bạn Không Thông Minh Lắm Đâu', N'Kỹ năng sống', N'David McRaney', 2020, N'NXB Thế Giới', CAST(N'2020-08-25' AS Date), 98000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS094', N'Sống Bản Lĩnh Theo Cách Một Quý Cô', N'Kỹ năng sống', N'Ellen Fein- Sherrie Schneider', 2019, N'Nhà Xuất Bản Hà Nội', CAST(N'2019-07-06' AS Date), 76000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS095', N'Chúng Ta Đều Sợ Trưởng Thành', N'Kỹ năng sống', N'Hyenam Kim', 2020, N'NXB Thanh Niên', CAST(N'2020-05-12' AS Date), 70000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS096', N'Đời Còn Dài Hà Tất Phải Hoang Mang', N'Kỹ năng sống', N'Lâm Hy', 2019, N'NXB Thế Giới', CAST(N'2019-06-24' AS Date), 98000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS097', N'Hoa Sen Trên Tuyết', N'Kỹ năng sống', N'Nguyên Phong', 2018, N'NXB Tổng Hợp', CAST(N'2018-07-22' AS Date), 73000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS098', N'Nếu chỉ còn một ngày để sống', N'Kỹ năng sống', N'Nicola Yoon', 2018, N'NXB Văn Học', CAST(N'2018-05-15' AS Date), 66000, 50, 50)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS099', N'Tôi tài giỏi bạn cũng thế', N'Kỹ năng sống', N'Adam Khoo', 2019, N'NXB Phụ Nữ ', CAST(N'2019-08-12' AS Date), 118000, 50, 40)
INSERT [dbo].[THONGTINSACH] ([MaSach], [TenSach], [TheLoai], [TacGia], [NamXuatBan], [NhaXuatBan], [NgayNhap], [GiaTri], [SoLuong], [TinhTrang]) VALUES (N'MS100', N'Bạn đang ngịch gì với đời mình', N'Kỹ năng sống', N'J Krishnamurt', 2020, N'NXB Hồng Đức', CAST(N'2020-06-18' AS Date), 108000, 50, 50)
INSERT [dbo].[VIPHAM] ([SoTienThu], [HoTenDG], [TienPhatKyNay], [TienNoKyNay], [TongNo], [TienConLai]) VALUES (4000, N'Nghiêm Xuân Doanh', 1000, 3000, 4000, 0)
INSERT [dbo].[VIPHAM] ([SoTienThu], [HoTenDG], [TienPhatKyNay], [TienNoKyNay], [TongNo], [TienConLai]) VALUES (6000, N'Ngô Anh Đào', 5000, 1000, 6000, 0)
INSERT [dbo].[VIPHAM] ([SoTienThu], [HoTenDG], [TienPhatKyNay], [TienNoKyNay], [TongNo], [TienConLai]) VALUES (7000, N'Đặng Quang Anh', 5000, 2000, 7000, 0)
INSERT [dbo].[VIPHAM] ([SoTienThu], [HoTenDG], [TienPhatKyNay], [TienNoKyNay], [TongNo], [TienConLai]) VALUES (8000, N'Hồ Ánh Như', 5000, 3000, 8000, 0)
INSERT [dbo].[VIPHAM] ([SoTienThu], [HoTenDG], [TienPhatKyNay], [TienNoKyNay], [TongNo], [TienConLai]) VALUES (9000, N'Nguyễn Thị Ánh', 7000, 2000, 9000, 0)
INSERT [dbo].[VIPHAM] ([SoTienThu], [HoTenDG], [TienPhatKyNay], [TienNoKyNay], [TongNo], [TienConLai]) VALUES (10000, N'Lê Thúy Huyền', 6000, 4000, 10000, 0)
ALTER TABLE [dbo].[MUONTRASACH]  WITH CHECK ADD  CONSTRAINT [FK_MUONTRASACH_DOCGIA] FOREIGN KEY([HoTenDG])
REFERENCES [dbo].[DOCGIA] ([HoTenDG])
GO
ALTER TABLE [dbo].[MUONTRASACH] CHECK CONSTRAINT [FK_MUONTRASACH_DOCGIA]
GO
ALTER TABLE [dbo].[MUONTRASACH]  WITH CHECK ADD  CONSTRAINT [FK_MUONTRASACH_THONGTINSACH] FOREIGN KEY([MaSach])
REFERENCES [dbo].[THONGTINSACH] ([MaSach])
GO
ALTER TABLE [dbo].[MUONTRASACH] CHECK CONSTRAINT [FK_MUONTRASACH_THONGTINSACH]
GO
ALTER TABLE [dbo].[VIPHAM]  WITH CHECK ADD  CONSTRAINT [FK_VIPHAM_DOCGIA] FOREIGN KEY([HoTenDG])
REFERENCES [dbo].[DOCGIA] ([HoTenDG])
GO
ALTER TABLE [dbo].[VIPHAM] CHECK CONSTRAINT [FK_VIPHAM_DOCGIA]
GO
