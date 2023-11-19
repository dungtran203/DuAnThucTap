package com.DuAnThucTap.service;

import com.DuAnThucTap.entity.KhachHang;
import com.DuAnThucTap.model.request.create_request.CreateKhachHangRequest;
import com.DuAnThucTap.model.request.update_request.UpdateKhachHangRequest;
import com.DuAnThucTap.model.response.KhachHangResponse;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface KhachHangService {
    Page<KhachHangResponse> pageTaiKhoanActive(Integer pageNo, Integer size);

    Page<KhachHangResponse> pageTaiKhoanInActive(Integer pageNo, Integer size);

    void add(CreateKhachHangRequest createKhachHangRequest, MultipartFile file) throws IOException, SQLException;

    void update(Integer id, MultipartFile file, UpdateKhachHangRequest updateKhachHangRequest) throws IOException, SQLException;


    List<KhachHangResponse> getAllKhachHangActive();

    KhachHangResponse getOne(Integer id);

    void delete(Integer id, LocalDate now);

    void revertTaiKhoan(Integer id, LocalDate now);

    Page<KhachHangResponse> pageSearchACTIVE(String search, Integer pageNo, Integer size);

    Page<KhachHangResponse> pageSearchTuoiMinMax(Integer min, Integer max, Integer pageNo, Integer size);

    //
    public KhachHang viewById(Integer id);

    Boolean existsBySdtKhachHang(String sdt);

    Boolean existsByEmailKhachHang(String email);

    Boolean existsBySdtKhachHangWithDifferentId(String sdt, Integer id);

    Boolean existsByEmailKhachHangWithDifferentId(String sdt, Integer id);


}
