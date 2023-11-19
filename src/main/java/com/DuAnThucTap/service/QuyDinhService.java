package com.DuAnThucTap.service;

import com.DuAnThucTap.model.response.QuyDinhResponse;
import com.DuAnThucTap.model.request.create_request.CreateQuyDinhRequest;
import com.DuAnThucTap.model.request.update_request.UpdateQuyDinhRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public interface QuyDinhService {
    Page<QuyDinhResponse> pageQuyDinhActive(Integer pageNo, Integer size);

    Page<QuyDinhResponse> pageQuyDinhInActive(Integer pageNo, Integer size);

    QuyDinhResponse add(CreateQuyDinhRequest createQuyDinhRequest);

    QuyDinhResponse update(UpdateQuyDinhRequest updateQuyDinhRequest);

    QuyDinhResponse getOne(Integer id);

    Page<QuyDinhResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size);
    Page<QuyDinhResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size);

    void deleteQuyDinh(Integer id, LocalDate now);

    void revertQuyDinh(Integer id,LocalDate now);

}
