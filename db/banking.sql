-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Feb 2023 pada 05.26
-- Versi server: 10.4.25-MariaDB
-- Versi PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `banking`
--
CREATE DATABASE IF NOT EXISTS `banking` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `banking`;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_transaksi`
--

CREATE TABLE `tbl_transaksi` (
  `id` int(11) NOT NULL,
  `no_rek` int(10) NOT NULL,
  `tanggal` varchar(12) NOT NULL,
  `waktu` varchar(12) NOT NULL,
  `jenis_transaksi` varchar(16) NOT NULL,
  `debit` int(11) NOT NULL,
  `kredit` int(11) NOT NULL,
  `saldo` int(11) NOT NULL,
  `ket` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_transaksi`
--

INSERT INTO `tbl_transaksi` (`id`, `no_rek`, `tanggal`, `waktu`, `jenis_transaksi`, `debit`, `kredit`, `saldo`, `ket`) VALUES
(1, 12345678, '03-02-2023', '21:26:47', 'Setor Tunai', 80000, 0, 100000, '-'),
(2, 12345678, '03-02-2023', '21:27:01', 'Tarik Tunai', 0, 50000, 50000, '-');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_user`
--

CREATE TABLE `tbl_user` (
  `no_rek` char(8) NOT NULL,
  `nama` varchar(16) NOT NULL,
  `DoB` varchar(12) NOT NULL,
  `alamat` text NOT NULL,
  `gender` enum('L','P') NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `pin` char(6) NOT NULL,
  `saldo` int(11) NOT NULL,
  `tipe_akun` enum('1','0') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_user`
--

INSERT INTO `tbl_user` (`no_rek`, `nama`, `DoB`, `alamat`, `gender`, `username`, `password`, `pin`, `saldo`, `tipe_akun`) VALUES
('00000000', 'admin', '01-01-2000', 'jl. bahagia denganya', 'L', 'admin', 'admin123', '000000', 100000, '1'),
('12345678', 'Wahyu Siregar', '26-06-2003', 'jl. gurami raya', 'L', 'wahyu', 'wahyu123', '123456', 50000, '0');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`no_rek`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
