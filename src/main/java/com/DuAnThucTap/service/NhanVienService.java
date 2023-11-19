package com.DuAnThucTap.service;

import com.DuAnThucTap.entity.NhanVien;
import com.DuAnThucTap.model.request.create_request.CreateNhanVienRequest;
import com.DuAnThucTap.model.request.update_request.UpdateNhanVienRequest;
import com.DuAnThucTap.model.response.NhanVienResponse;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

public interface NhanVienService {
    Page<NhanVienResponse>pageNhanVienActive(Integer pageNo, Integer size);
    Page<NhanVienResponse>pageTaiKhoanInActive(Integer pageNo, Integer size);
//
    void add(CreateNhanVienRequest createNhanVienRequest, MultipartFile file) throws IOException, SQLException;
    void update(Integer id, MultipartFile file, UpdateNhanVienRequest updateNhanVienRequest)throws IOException, SQLException;
    NhanVienResponse getOne(Integer id);
//
    void delete(Integer id, LocalDate now);
//
    void revertTaiKhoan(Integer id,LocalDate now);
//
    Page<NhanVienResponse> pageSearchACTIVE(String search, Integer pageNo, Integer size);
    Page<NhanVienResponse>pageSearchTuoiMinMax(Integer min, Integer max, Integer pageNo, Integer size);
    public NhanVien viewById(Integer id);
    Boolean existsBySdtNhanVien(String sdt);
    Boolean existsByEmailNhanVien(String email);
    Boolean existsBySdtNhanVienWithDifferentId(String sdt, Integer id);
    Boolean existsByEmailNhanVienWithDifferentId(String sdt, Integer id);

}
