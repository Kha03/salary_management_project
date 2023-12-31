USE [QLyLuong]
GO
/****** Object:  Table [dbo].[BacLuong]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BacLuong](
	[maBacLuong] [varchar](255) NOT NULL,
	[soBac] [int] NOT NULL,
	[heSoLuong] [real] NOT NULL,
	[luongCoSo] [real] NOT NULL,
	[maCapBac] [varchar](255) NOT NULL,
 CONSTRAINT [PK__BacLuong__E0FE52E047DF98B7] PRIMARY KEY CLUSTERED 
(
	[maBacLuong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CapBac]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CapBac](
	[maCapBac] [varchar](255) NOT NULL,
	[tenCapBac] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maCapBac] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChamCongNhanVien]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChamCongNhanVien](
	[maChamCong] [varchar](255) NOT NULL,
	[ngayLamViec] [date] NOT NULL,
	[trangThai] [bit] NOT NULL,
	[soGioTangCa] [int] NOT NULL,
	[maNhanVienHanhChinh] [varchar](255) NULL,
	[maLuongHanhChinh] [varchar](255) NULL,
 CONSTRAINT [PK__ChamCong__6851BA22C8E79E5F] PRIMARY KEY CLUSTERED 
(
	[maChamCong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChamCongSanPham]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChamCongSanPham](
	[maChamCong] [varchar](255) NOT NULL,
	[maNhanVienSanXuat] [varchar](255) NULL,
	[maLuongCongNhan] [varchar](255) NULL,
	[ngayLamViec] [date] NOT NULL,
	[maSanPham] [varchar](255) NOT NULL,
	[maCongDoan] [varchar](255) NOT NULL,
	[donGia] [real] NOT NULL,
	[soLuong] [int] NOT NULL,
	[tongLuongNgay] [real] NOT NULL,
 CONSTRAINT [PK__ChamCong__6851BA226525DD38] PRIMARY KEY CLUSTERED 
(
	[maChamCong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CongDoan]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CongDoan](
	[maCongDoan] [varchar](255) NOT NULL,
	[tenCongDoan] [nvarchar](255) NOT NULL,
	[giaTien] [real] NOT NULL,
	[tienDo] [int] NOT NULL,
	[maSanPham] [varchar](255) NOT NULL,
	[congDoanTruoc] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maCongDoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HopDongSanXuat]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HopDongSanXuat](
	[maHopDong] [varchar](255) NOT NULL,
	[tenHopDong] [nvarchar](255) NOT NULL,
	[ngayBatDau] [date] NOT NULL,
	[ngayKetThuc] [date] NOT NULL,
	[giaTien] [real] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maHopDong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LuongCongNhan]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LuongCongNhan](
	[maLuongCongNhan] [varchar](255) NOT NULL,
	[maNhanVienSanXuat] [varchar](255) NULL,
	[tenNhanVien] [nvarchar](255) NOT NULL,
	[thang] [varchar](255) NOT NULL,
	[luongSanPham] [real] NOT NULL,
	[tienPhuCap] [real] NOT NULL,
	[luongThucLanh] [real] NOT NULL,
 CONSTRAINT [PK__LuongCon__3081A6007046B2C4] PRIMARY KEY CLUSTERED 
(
	[maLuongCongNhan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LuongHanhChinh]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LuongHanhChinh](
	[maLuongHanhChinh] [varchar](255) NOT NULL,
	[maNhanVienHanhChinh] [varchar](255) NULL,
	[tenNhanVien] [nvarchar](255) NOT NULL,
	[thang] [varchar](255) NOT NULL,
	[chucVu] [nvarchar](255) NOT NULL,
	[heSoLuong] [real] NOT NULL,
	[luongCoBan] [real] NOT NULL,
	[ngayCongChuan] [int] NOT NULL,
	[ngayCongThucTe] [int] NOT NULL,
	[tienPhuCap] [real] NOT NULL,
	[tienTangCa] [real] NOT NULL,
	[luongThucLanh] [real] NOT NULL,
 CONSTRAINT [PK__LuongHan__0C87F5A13488F530] PRIMARY KEY CLUSTERED 
(
	[maLuongHanhChinh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNhanVien] [varchar](255) NOT NULL,
	[hoVaTen] [nvarchar](255) NOT NULL,
	[ngaySinh] [date] NOT NULL,
	[gioiTinh] [bit] NOT NULL,
	[diaChi] [nvarchar](255) NOT NULL,
	[dienThoai] [varchar](255) NOT NULL,
	[mail] [varchar](255) NULL,
	[ngayVaoLam] [date] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien_PhuCap]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien_PhuCap](
	[maNhanVien] [varchar](255) NOT NULL,
	[maPhuCap] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maNhanVien] ASC,
	[maPhuCap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVienHanhChinh]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVienHanhChinh](
	[maNhanVienHanhChinh] [varchar](255) NOT NULL,
	[NgoaiNgu] [nvarchar](255) NOT NULL,
	[ChucVu] [nvarchar](255) NOT NULL,
	[luongCoBan] [real] NOT NULL,
	[heSoLuong] [real] NOT NULL,
	[maCapBac] [varchar](255) NOT NULL,
	[maPhongBan] [varchar](255) NOT NULL,
	[maNhanVien] [varchar](255) NOT NULL,
 CONSTRAINT [PK__NhanVien__6E9B9627A4F7D95A] PRIMARY KEY CLUSTERED 
(
	[maNhanVienHanhChinh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVienSanXuat]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVienSanXuat](
	[maNhanVienSanXuat] [varchar](255) NOT NULL,
	[kinhNghiem] [nvarchar](255) NOT NULL,
	[maTrinhDo] [varchar](255) NOT NULL,
	[maPhanXuong] [varchar](255) NOT NULL,
	[maNhanVien] [varchar](255) NOT NULL,
	[maCapBac] [varchar](255) NOT NULL,
 CONSTRAINT [PK__NhanVien__8F80D2A51366B620] PRIMARY KEY CLUSTERED 
(
	[maNhanVienSanXuat] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVienSanXuat_PhanCongSanXuat]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVienSanXuat_PhanCongSanXuat](
	[maNhanVienSanXuat] [varchar](255) NOT NULL,
	[maPhanCong] [varchar](255) NOT NULL,
 CONSTRAINT [PK_NhanVienSanXuat_PhanCongSanXuat] PRIMARY KEY CLUSTERED 
(
	[maNhanVienSanXuat] ASC,
	[maPhanCong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhanCongSanXuat]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhanCongSanXuat](
	[maPhanCong] [varchar](255) NOT NULL,
	[ngayPhanCong] [date] NOT NULL,
	[maCongDoan] [varchar](255) NOT NULL,
	[maSanPham] [varchar](255) NOT NULL,
	[maPhanXuong] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhanCong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhanXuong]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhanXuong](
	[maPhanXuong] [varchar](255) NOT NULL,
	[tenPhanXuong] [nvarchar](255) NOT NULL,
	[toTruong] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhanXuong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhongBan]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhongBan](
	[maPhongBan] [varchar](255) NOT NULL,
	[tenPhongBan] [nvarchar](255) NOT NULL,
	[truongPhong] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhongBan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhuCap]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhuCap](
	[maPhuCap] [varchar](255) NOT NULL,
	[tenPhuCap] [nvarchar](255) NOT NULL,
	[soTien] [real] NOT NULL,
	[coDinh] [bit] NOT NULL,
	[thangHuong] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhuCap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[maSanPham] [varchar](255) NOT NULL,
	[tenSanPham] [nvarchar](255) NOT NULL,
	[donGia] [real] NOT NULL,
	[soLuong] [int] NOT NULL,
	[donViTinh] [nvarchar](255) NOT NULL,
	[maHopDong] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maSanPham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[maTaiKhoan] [varchar](255) NOT NULL,
	[matKhau] [varchar](255) NOT NULL,
	[maNhanVienHanhChinh] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maTaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TrinhDo]    Script Date: 12/12/2023 8:56:40 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TrinhDo](
	[maTrinhDo] [varchar](255) NOT NULL,
	[tenTrinhDo] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maTrinhDo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[BacLuong]  WITH CHECK ADD  CONSTRAINT [FKBacLuong979482] FOREIGN KEY([maCapBac])
REFERENCES [dbo].[CapBac] ([maCapBac])
GO
ALTER TABLE [dbo].[BacLuong] CHECK CONSTRAINT [FKBacLuong979482]
GO
ALTER TABLE [dbo].[ChamCongNhanVien]  WITH CHECK ADD  CONSTRAINT [FKChamCongNh378530] FOREIGN KEY([maLuongHanhChinh])
REFERENCES [dbo].[LuongHanhChinh] ([maLuongHanhChinh])
GO
ALTER TABLE [dbo].[ChamCongNhanVien] CHECK CONSTRAINT [FKChamCongNh378530]
GO
ALTER TABLE [dbo].[ChamCongNhanVien]  WITH CHECK ADD  CONSTRAINT [FKChamCongNh594644] FOREIGN KEY([maNhanVienHanhChinh])
REFERENCES [dbo].[NhanVienHanhChinh] ([maNhanVienHanhChinh])
GO
ALTER TABLE [dbo].[ChamCongNhanVien] CHECK CONSTRAINT [FKChamCongNh594644]
GO
ALTER TABLE [dbo].[ChamCongSanPham]  WITH CHECK ADD  CONSTRAINT [FKChamCongSa155551] FOREIGN KEY([maCongDoan])
REFERENCES [dbo].[CongDoan] ([maCongDoan])
GO
ALTER TABLE [dbo].[ChamCongSanPham] CHECK CONSTRAINT [FKChamCongSa155551]
GO
ALTER TABLE [dbo].[ChamCongSanPham]  WITH CHECK ADD  CONSTRAINT [FKChamCongSa330911] FOREIGN KEY([maSanPham])
REFERENCES [dbo].[SanPham] ([maSanPham])
GO
ALTER TABLE [dbo].[ChamCongSanPham] CHECK CONSTRAINT [FKChamCongSa330911]
GO
ALTER TABLE [dbo].[ChamCongSanPham]  WITH CHECK ADD  CONSTRAINT [FKChamCongSa414962] FOREIGN KEY([maLuongCongNhan])
REFERENCES [dbo].[LuongCongNhan] ([maLuongCongNhan])
GO
ALTER TABLE [dbo].[ChamCongSanPham] CHECK CONSTRAINT [FKChamCongSa414962]
GO
ALTER TABLE [dbo].[ChamCongSanPham]  WITH CHECK ADD  CONSTRAINT [FKChamCongSa618423] FOREIGN KEY([maNhanVienSanXuat])
REFERENCES [dbo].[NhanVienSanXuat] ([maNhanVienSanXuat])
GO
ALTER TABLE [dbo].[ChamCongSanPham] CHECK CONSTRAINT [FKChamCongSa618423]
GO
ALTER TABLE [dbo].[CongDoan]  WITH CHECK ADD  CONSTRAINT [fk_congDoanTruoc] FOREIGN KEY([congDoanTruoc])
REFERENCES [dbo].[CongDoan] ([maCongDoan])
GO
ALTER TABLE [dbo].[CongDoan] CHECK CONSTRAINT [fk_congDoanTruoc]
GO
ALTER TABLE [dbo].[CongDoan]  WITH CHECK ADD  CONSTRAINT [FKCongDoan495862] FOREIGN KEY([maSanPham])
REFERENCES [dbo].[SanPham] ([maSanPham])
GO
ALTER TABLE [dbo].[CongDoan] CHECK CONSTRAINT [FKCongDoan495862]
GO
ALTER TABLE [dbo].[LuongCongNhan]  WITH CHECK ADD  CONSTRAINT [FKLuongCongN57918] FOREIGN KEY([maNhanVienSanXuat])
REFERENCES [dbo].[NhanVienSanXuat] ([maNhanVienSanXuat])
GO
ALTER TABLE [dbo].[LuongCongNhan] CHECK CONSTRAINT [FKLuongCongN57918]
GO
ALTER TABLE [dbo].[LuongHanhChinh]  WITH CHECK ADD  CONSTRAINT [FKLuongHanhC642709] FOREIGN KEY([maNhanVienHanhChinh])
REFERENCES [dbo].[NhanVienHanhChinh] ([maNhanVienHanhChinh])
GO
ALTER TABLE [dbo].[LuongHanhChinh] CHECK CONSTRAINT [FKLuongHanhC642709]
GO
ALTER TABLE [dbo].[NhanVien_PhuCap]  WITH CHECK ADD  CONSTRAINT [FKNhanVien_P551756] FOREIGN KEY([maPhuCap])
REFERENCES [dbo].[PhuCap] ([maPhuCap])
GO
ALTER TABLE [dbo].[NhanVien_PhuCap] CHECK CONSTRAINT [FKNhanVien_P551756]
GO
ALTER TABLE [dbo].[NhanVien_PhuCap]  WITH CHECK ADD  CONSTRAINT [FKNhanVien_P795132] FOREIGN KEY([maNhanVien])
REFERENCES [dbo].[NhanVien] ([maNhanVien])
GO
ALTER TABLE [dbo].[NhanVien_PhuCap] CHECK CONSTRAINT [FKNhanVien_P795132]
GO
ALTER TABLE [dbo].[NhanVienHanhChinh]  WITH CHECK ADD  CONSTRAINT [FKNhanVienHa1761] FOREIGN KEY([maPhongBan])
REFERENCES [dbo].[PhongBan] ([maPhongBan])
GO
ALTER TABLE [dbo].[NhanVienHanhChinh] CHECK CONSTRAINT [FKNhanVienHa1761]
GO
ALTER TABLE [dbo].[NhanVienHanhChinh]  WITH CHECK ADD  CONSTRAINT [FKNhanVienHa516653] FOREIGN KEY([maCapBac])
REFERENCES [dbo].[CapBac] ([maCapBac])
GO
ALTER TABLE [dbo].[NhanVienHanhChinh] CHECK CONSTRAINT [FKNhanVienHa516653]
GO
ALTER TABLE [dbo].[NhanVienHanhChinh]  WITH CHECK ADD  CONSTRAINT [FKNhanVienHa759601] FOREIGN KEY([maNhanVien])
REFERENCES [dbo].[NhanVien] ([maNhanVien])
GO
ALTER TABLE [dbo].[NhanVienHanhChinh] CHECK CONSTRAINT [FKNhanVienHa759601]
GO
ALTER TABLE [dbo].[NhanVienSanXuat]  WITH CHECK ADD  CONSTRAINT [FKNhanVienSa551981] FOREIGN KEY([maPhanXuong])
REFERENCES [dbo].[PhanXuong] ([maPhanXuong])
GO
ALTER TABLE [dbo].[NhanVienSanXuat] CHECK CONSTRAINT [FKNhanVienSa551981]
GO
ALTER TABLE [dbo].[NhanVienSanXuat]  WITH CHECK ADD  CONSTRAINT [FKNhanVienSa652259] FOREIGN KEY([maCapBac])
REFERENCES [dbo].[CapBac] ([maCapBac])
GO
ALTER TABLE [dbo].[NhanVienSanXuat] CHECK CONSTRAINT [FKNhanVienSa652259]
GO
ALTER TABLE [dbo].[NhanVienSanXuat]  WITH CHECK ADD  CONSTRAINT [FKNhanVienSa895207] FOREIGN KEY([maNhanVien])
REFERENCES [dbo].[NhanVien] ([maNhanVien])
GO
ALTER TABLE [dbo].[NhanVienSanXuat] CHECK CONSTRAINT [FKNhanVienSa895207]
GO
ALTER TABLE [dbo].[NhanVienSanXuat]  WITH CHECK ADD  CONSTRAINT [FKNhanVienSa934483] FOREIGN KEY([maTrinhDo])
REFERENCES [dbo].[TrinhDo] ([maTrinhDo])
GO
ALTER TABLE [dbo].[NhanVienSanXuat] CHECK CONSTRAINT [FKNhanVienSa934483]
GO
ALTER TABLE [dbo].[NhanVienSanXuat_PhanCongSanXuat]  WITH CHECK ADD  CONSTRAINT [FK_NhanVienSanXuat_PhanCongSanXuat_NhanVienSanXuat] FOREIGN KEY([maNhanVienSanXuat])
REFERENCES [dbo].[NhanVienSanXuat] ([maNhanVienSanXuat])
GO
ALTER TABLE [dbo].[NhanVienSanXuat_PhanCongSanXuat] CHECK CONSTRAINT [FK_NhanVienSanXuat_PhanCongSanXuat_NhanVienSanXuat]
GO
ALTER TABLE [dbo].[NhanVienSanXuat_PhanCongSanXuat]  WITH CHECK ADD  CONSTRAINT [FK_NhanVienSanXuat_PhanCongSanXuat_PhanCongSanXuat] FOREIGN KEY([maPhanCong])
REFERENCES [dbo].[PhanCongSanXuat] ([maPhanCong])
GO
ALTER TABLE [dbo].[NhanVienSanXuat_PhanCongSanXuat] CHECK CONSTRAINT [FK_NhanVienSanXuat_PhanCongSanXuat_PhanCongSanXuat]
GO
ALTER TABLE [dbo].[PhanCongSanXuat]  WITH CHECK ADD  CONSTRAINT [FKPhanCongSa151755] FOREIGN KEY([maPhanXuong])
REFERENCES [dbo].[PhanXuong] ([maPhanXuong])
GO
ALTER TABLE [dbo].[PhanCongSanXuat] CHECK CONSTRAINT [FKPhanCongSa151755]
GO
ALTER TABLE [dbo].[PhanCongSanXuat]  WITH CHECK ADD  CONSTRAINT [FKPhanCongSa486714] FOREIGN KEY([maCongDoan])
REFERENCES [dbo].[CongDoan] ([maCongDoan])
GO
ALTER TABLE [dbo].[PhanCongSanXuat] CHECK CONSTRAINT [FKPhanCongSa486714]
GO
ALTER TABLE [dbo].[PhanCongSanXuat]  WITH CHECK ADD  CONSTRAINT [FKPhanCongSa878761] FOREIGN KEY([maSanPham])
REFERENCES [dbo].[SanPham] ([maSanPham])
GO
ALTER TABLE [dbo].[PhanCongSanXuat] CHECK CONSTRAINT [FKPhanCongSa878761]
GO
ALTER TABLE [dbo].[PhongBan]  WITH CHECK ADD  CONSTRAINT [FKPhongBan389763] FOREIGN KEY([truongPhong])
REFERENCES [dbo].[NhanVienHanhChinh] ([maNhanVienHanhChinh])
GO
ALTER TABLE [dbo].[PhongBan] CHECK CONSTRAINT [FKPhongBan389763]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FKSanPham729552] FOREIGN KEY([maHopDong])
REFERENCES [dbo].[HopDongSanXuat] ([maHopDong])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FKSanPham729552]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FKTaiKhoan800604] FOREIGN KEY([maNhanVienHanhChinh])
REFERENCES [dbo].[NhanVienHanhChinh] ([maNhanVienHanhChinh])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FKTaiKhoan800604]
GO
