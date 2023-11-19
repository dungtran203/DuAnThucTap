create table cau_thu
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    so_ao         int                         null,
    ma            varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table chat_lieu
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    ma            varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table co_ao
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    ma            varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table cong_nghe
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    ma            varchar(255)                null,
    mo_ta         varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table dong_san_pham
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    ma            varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table kich_thuoc
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    ma            varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table loai_san_pham
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    ma            varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table ly_do_tra_hang
(
    id             int auto_increment
        primary key,
    hinh_anh       varchar(255) null,
    ly_do_tra_hang varchar(255) null,
    ma             varchar(255) null,
    `mo _ta`       varchar(255) null,
    trang_thai     varchar(255) null,
    video          varchar(255) null
);

create table mau_sac
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    ma            varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table nha_san_xuat
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    ma            varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table nuoc_san_xuat
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    ma            varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table quy_dinh
(
    id                    int auto_increment
        primary key,
    ngay_cap_nhat         date                        null,
    ngay_dat_lai_thu_hang date                        null,
    ngay_tao              date                        null,
    trang_thai            enum ('ACTIVE', 'INACTIVE') null
);

create table thu_hang
(
    id                          int auto_increment
        primary key,
    ngay_cap_nhat               date                        null,
    ngay_tao                    date                        null,
    so_luong_don_hang_toi_thieu int                         null,
    so_tien_khach_chi_toi_thieu decimal(38, 2)              null,
    ma                          varchar(255)                null,
    ten                         varchar(255)                null,
    trang_thai                  enum ('ACTIVE', 'INACTIVE') null
);

create table khach_hang
(
    gioi_tinh                    bit                         null,
    id                           int auto_increment
        primary key,
    ngay_cap_nhat                date                        null,
    ngay_sinh                    date                        null,
    ngay_tao                     date                        null,
    so_luong_don_hang_thanh_cong int                         null,
    so_tien_da_chi_tieu          decimal(38, 2)              null,
    thu_hang_id                  int                         null,
    dia_chi                      varchar(255)                null,
    email                        varchar(255)                null,
    ma                           varchar(255)                null,
    mat_khau                     varchar(255)                null,
    sdt                          varchar(255)                null,
    ten                          varchar(255)                null,
    trang_thai                   enum ('ACTIVE', 'INACTIVE') null,
    anh                          mediumblob                  null,
    constraint FKmcjfijqqyritny9fvjk362qip
        foreign key (thu_hang_id) references thu_hang (id)
);

create table dia_chi
(
    id               int auto_increment
        primary key,
    khach_hang_id    int                                                 null,
    ngay_cap_nhap    date                                                null,
    ngay_tao         date                                                null,
    dia_chi_chi_tiet varchar(255)                                        null,
    ho_ten           varchar(255)                                        null,
    ma_phuong_xa     varchar(255)                                        null,
    ma_quan_huyen    varchar(255)                                        null,
    ma_tinh          varchar(255)                                        null,
    sdt              varchar(255)                                        null,
    ten_phuong_xa    varchar(255)                                        null,
    ten_quan_huyen   varchar(255)                                        null,
    ten_tinh         varchar(255)                                        null,
    trang_thai       enum ('ACTIVE', 'CONFIRMED', 'INACTIVE', 'PENDING') null,
    constraint FKbbd8bxqdl1w9vhasn86u0q9w3
        foreign key (khach_hang_id) references khach_hang (id)
);

create table thuong_hieu
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    ma            varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table san_pham
(
    cau_thu_id       int                         null,
    chat_lieu_id     int                         null,
    co_ao_id         int                         null,
    cong_nghe_id     int                         null,
    dong_san_pham_id int                         null,
    gia              decimal(38, 2)              null,
    id               int auto_increment
        primary key,
    loai_san_pham_id int                         null,
    mau_sac_id       int                         null,
    nam_san_xuat     date                        null,
    ngay_cap_nhat    date                        null,
    ngay_tao         date                        null,
    nha_san_xuat_id  int                         null,
    nuoc_san_xuat_id int                         null,
    thuong_hieu_id   int                         null,
    ma               varchar(255)                null,
    ma_vach          varchar(255)                null,
    mo_ta            varchar(255)                null,
    ten              varchar(255)                null,
    trang_thai       enum ('ACTIVE', 'INACTIVE') null,
    constraint FK3vjlvax375vppoqtn14l713e1
        foreign key (dong_san_pham_id) references dong_san_pham (id),
    constraint FK7r9wauv0dymxw8e8t2jdmhae
        foreign key (cong_nghe_id) references cong_nghe (id),
    constraint FK8ixkt2s9hxy5bvdgk6g60ewax
        foreign key (loai_san_pham_id) references loai_san_pham (id),
    constraint FK9wph5u6jiq06hnksctrpckl40
        foreign key (chat_lieu_id) references chat_lieu (id),
    constraint FKbn1gh5f6qimyc8ht6uxigp12l
        foreign key (cau_thu_id) references cau_thu (id),
    constraint FKd216sgytug4364syq82sih7lu
        foreign key (mau_sac_id) references mau_sac (id),
    constraint FKdqj1kel5y8obcwr50p9psexa2
        foreign key (nha_san_xuat_id) references nha_san_xuat (id),
    constraint FKjpcf1jiq44ay7lrrsynbgxggr
        foreign key (co_ao_id) references co_ao (id),
    constraint FKqsalg8ls4f2co519gdwr6xpoi
        foreign key (nuoc_san_xuat_id) references nuoc_san_xuat (id),
    constraint FKrum92qs4m7i0u7p7ub6bhbrr5
        foreign key (thuong_hieu_id) references thuong_hieu (id)
);

create table anh_san_pham
(
    id            int auto_increment
        primary key,
    ngay_cap_nhat date                        null,
    ngay_tao      date                        null,
    san_pham_id   int                         null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null,
    ten           mediumblob                  null,
    constraint FKovg8ggra9ps3uaktiwcdrvupu
        foreign key (san_pham_id) references san_pham (id)
);

create table chi_tiet_san_pham
(
    id            int auto_increment
        primary key,
    kich_thuoc_id int                                    null,
    ngay_cap_nhat date                                   null,
    ngay_tao      date                                   null,
    san_pham_id   int                                    null,
    so_luong      int                                    null,
    trang_thai    enum ('ACTIVE', 'INACTIVE', 'PENDING') null,
    constraint FK4ocrid4jrlponcr8s2k58996p
        foreign key (kich_thuoc_id) references kich_thuoc (id),
    constraint FK7aklp0ixugyga1wakia69lcb3
        foreign key (san_pham_id) references san_pham (id)
);

create table gio_hang_chi_tiet
(
    chi_tiet_san_pham_id int                                       null,
    id                   int auto_increment
        primary key,
    khach_hang_id        int                                       null,
    ngay_cap_nhat        date                                      null,
    ngay_tao             date                                      null,
    so_luong             int                                       null,
    trang_thai           enum ('APPROVED', 'CANCELLED', 'PENDING') null,
    constraint FKa448f73bymv1ypu4r2op6f4iv
        foreign key (khach_hang_id) references khach_hang (id),
    constraint FKbt7xr9oydd239atdnx11vk0hr
        foreign key (chi_tiet_san_pham_id) references chi_tiet_san_pham (id)
);

create table vai_tro
(
    id            int auto_increment
        primary key,
    ngay_cap_nhap date                        null,
    ngay_tao      date                        null,
    ma            varchar(255)                null,
    ten           varchar(255)                null,
    trang_thai    enum ('ACTIVE', 'INACTIVE') null
);

create table nhan_vien
(
    gioi_tinh            bit                         null,
    id                   int auto_increment
        primary key,
    ngay_cap_nhat        date                        null,
    ngay_sinh            date                        null,
    ngay_tao             date                        null,
    vai_tro_id           int                         null,
    dia_chi              varchar(255)                null,
    email                varchar(255)                null,
    ma                   varchar(255)                null,
    mat_khau             varchar(255)                null,
    sdt                  varchar(255)                null,
    so_can_cuoc_cong_dan varchar(255)                null,
    ten                  varchar(255)                null,
    trang_thai           enum ('ACTIVE', 'INACTIVE') null,
    anhnv                mediumblob                  null,
    constraint FK9r0trxuheev2nyqw4j09f45ue
        foreign key (vai_tro_id) references vai_tro (id)
);

create table hoa_don
(
    id                      int auto_increment
        primary key,
    khach_hang_id           int                                                                           null,
    ngay_muon_nhan          date                                                                          null,
    ngay_tao                date                                                                          null,
    nhan_vien_id            int                                                                           null,
    phan_tram_giam_gia      int                                                                           null,
    phieu_giam_gia          decimal(38, 2)                                                                null,
    thanh_tien              decimal(38, 2)                                                                null,
    tien_khach_chuyen_khoan decimal(38, 2)                                                                null,
    tien_mat_khach_tra      decimal(38, 2)                                                                null,
    tien_ship               decimal(38, 2)                                                                null,
    dia_chi                 varchar(255)                                                                  null,
    hinh_thuc_ban_hang      enum ('ACTIVE', 'INACTIVE', 'PENDING')                                        null,
    ma                      varchar(255)                                                                  null,
    ma_giao_dich            varchar(255)                                                                  null,
    sdt_nguoi_nhan          varchar(255)                                                                  null,
    sdt_nguoi_ship          varchar(255)                                                                  null,
    ten_nguoi_nhan          varchar(255)                                                                  null,
    trang_thai              enum ('APPROVED', 'CANCELLED', 'CONFIRMED', 'PENDING', 'REVERSE', 'SHIPPING') null,
    constraint FKf3pkyuwrjwl5ru53n1r6fieih
        foreign key (nhan_vien_id) references nhan_vien (id),
    constraint FKfvowmias4ycehn19gyv8t5dys
        foreign key (khach_hang_id) references khach_hang (id)
);

create table giao_dich
(
    hoa_don_id             int                                    null,
    id                     int auto_increment
        primary key,
    khach_hang_id          int                                    null,
    ngay_cap_nhat          date                                   null,
    ngay_tao               date                                   null,
    nhan_vien_id           int                                    null,
    so_tien_chuyen_khoan   decimal(38, 2)                         null,
    so_tien_mat            decimal(38, 2)                         null,
    loai_giao_dich         enum ('PAYMENT', 'REVERSE')            null,
    phuong_thuc_thanh_toan enum ('BANKING', 'CASH', 'COD')        null,
    trang_thai_giao_dich   enum ('APPROVED', 'FAILED', 'PENDING') null,
    constraint FK631mkm55inrie321lxa06sdxk
        foreign key (khach_hang_id) references khach_hang (id),
    constraint FK9b0gq5qfsuaggxh584eog2pql
        foreign key (hoa_don_id) references hoa_don (id),
    constraint FKdptdhg6yafk2wbveatsyvwyy
        foreign key (nhan_vien_id) references nhan_vien (id)
);

create table hoa_don_chi_tiet
(
    chi_tiet_san_pham_id int                          null,
    don_gia              decimal(38, 2)               null,
    gia_ban              decimal(38, 2)               null,
    hoa_don_id           int                          null,
    id                   int auto_increment
        primary key,
    ngay_cap_nhat        date                         null,
    ngay_tao             date                         null,
    so_luong             int                          null,
    trang_thai           enum ('APPROVED', 'REVERSE') null,
    constraint FK8it5rkm179qgy53rxgafr1d5x
        foreign key (hoa_don_id) references hoa_don (id),
    constraint FKsnb6lh7vpf5qsfue21jrk9gdg
        foreign key (chi_tiet_san_pham_id) references chi_tiet_san_pham (id)
);

create table hoa_don_tra_hang
(
    hoa_don_id          int            null,
    id                  int auto_increment
        primary key,
    ngay_cap_nhat       date           null,
    ngay_doi_tra        date           null,
    ngay_tao            date           null,
    nhan_vien_id        int            null,
    tien_hoan_tra_khach decimal(38, 2) null,
    trang_thai          int            null,
    ghi_chu             varchar(255)   null,
    constraint FKbhmtr8hxde4a5e87c4qxwvrjn
        foreign key (nhan_vien_id) references nhan_vien (id),
    constraint FKtpfop93u138d574n1hc3onapr
        foreign key (hoa_don_id) references hoa_don (id)
);

create table `hoa_don_tra_hang chi_tiet`
(
    chi_tiet_san_pham_id int            null,
    gia_ban              decimal(38, 2) null,
    hoa_don_tra_hang_id  int            null,
    id                   int auto_increment
        primary key,
    ly_do_id             int            null,
    ngay_cap_nhat        date           null,
    ngay_tao             date           null,
    kich_thuoc           varchar(255)   null,
    ly_do                varchar(255)   null,
    mau_sac              varchar(255)   null,
    so_luong_tra         varchar(255)   null,
    ten_hang             varchar(255)   null,
    ten_san_pham         varchar(255)   null,
    tra_hang             varchar(255)   null,
    trang_thai           varchar(255)   null,
    constraint FK69gxn3le2sspyjbd116i5jv2r
        foreign key (chi_tiet_san_pham_id) references chi_tiet_san_pham (id),
    constraint FKl9ytcbj9a69o7kofgfd7b4twp
        foreign key (hoa_don_tra_hang_id) references hoa_don_tra_hang (id)
);

create table lich_su_hoa_don
(
    hoa_don_id           int                                                                                      null,
    id                   int auto_increment
        primary key,
    nhan_vien_id         int                                                                                      null,
    ngay_tao             datetime(6)                                                                              null,
    loai_lich_su_hoa_don enum ('APPROVED', 'CANCELLED', 'CONFIRMED', 'CREATED', 'EDITED', 'REVERSED', 'SHIPPING') null,
    mo_ta                varchar(255)                                                                             null,
    constraint FKc0waja71tyluwdwdvt6up90f0
        foreign key (hoa_don_id) references hoa_don (id),
    constraint FKqy37lftk3x1pxppmsyn7gcp05
        foreign key (nhan_vien_id) references nhan_vien (id)
);

create table voucher_thu_hang
(
    gia_tri_don_hang_toi_thieu decimal(38, 2)                         null,
    id                         int auto_increment
        primary key,
    so_tien_giam               decimal(38, 2)                         null,
    ngay_bat_dau               datetime(6)                            null,
    ngay_cap_nhat              datetime(6)                            null,
    ngay_ket_thuc              datetime(6)                            null,
    ngay_tao                   datetime(6)                            null,
    ma                         varchar(255)                           null,
    mo_ta                      varchar(255)                           null,
    ten                        varchar(255)                           null,
    trang_thai                 enum ('ACTIVE', 'INACTIVE', 'PENDING') null
);

create table chi_tiet_voucher_thu_hang
(
    id                  int auto_increment
        primary key,
    ngay_cap_nhat       date                                   null,
    ngay_tao            date                                   null,
    so_luong            int                                    null,
    thu_hang_id         int                                    null,
    voucher_thu_hang_id int                                    null,
    trang_thai          enum ('ACTIVE', 'INACTIVE', 'PENDING') null,
    constraint FKoldw49la6jkgkfuw05jglpi2k
        foreign key (thu_hang_id) references thu_hang (id),
    constraint FKqg5df5wr6xih2lkh1setrhkfn
        foreign key (voucher_thu_hang_id) references voucher_thu_hang (id)
);

create table vi_voucher
(
    chi_tiet_voucher_thu_hang_id int                                   null,
    gia_tri_don_hang_toi_thieu   decimal(38, 2)                        null,
    id                           int auto_increment
        primary key,
    khach_hang_id                int                                   null,
    ngay_cap_nhat                date                                  null,
    ngay_tao                     date                                  null,
    so_tien_giam                 decimal(38, 2)                        null,
    ngay_bat_dau                 datetime(6)                           null,
    ngay_ket_thuc                datetime(6)                           null,
    ma                           varchar(255)                          null,
    trang_thai                   enum ('ACTIVE', 'FAILED', 'INACTIVE') null,
    constraint FK1okcv30s8l0xwhad4f908rxjw
        foreign key (khach_hang_id) references khach_hang (id),
    constraint FKieycbryd1xhay67u2ruhima4
        foreign key (chi_tiet_voucher_thu_hang_id) references chi_tiet_voucher_thu_hang (id)
);