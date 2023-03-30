package com.example.guestbook.service;

import com.example.guestbook.dto.GuestbookDTO;
import com.example.guestbook.dto.PageRequestDTO;
import com.example.guestbook.dto.PageResultDTO;
import com.example.guestbook.entity.Guestbook;
import jakarta.transaction.Transactional;

public interface GuestbookService {

    GuestbookDTO read(Long gno);
    Long register(GuestbookDTO dto);
    PageResultDTO<GuestbookDTO, Guestbook> getList(PageRequestDTO requestDTO);

    default Guestbook dtoToEntity(GuestbookDTO dto){
        Guestbook entity = Guestbook.builder().gno(dto.getGno()).title(dto.getTitle())
                .content(dto.getContent()).writer(dto.getWriter()).build();
        return entity;
    }

    default GuestbookDTO entityToDto(Guestbook entity){
        GuestbookDTO dto = GuestbookDTO.builder().gno(entity.getGno()).title(entity.getTitle())
                .content(entity.getContent()).writer(entity.getWriter()).regDate(entity.getRegDate()).modDate(entity.getModDate()).build();
        return dto;
    }

    void remove(Long gno);
    void modify(GuestbookDTO dto);
}
