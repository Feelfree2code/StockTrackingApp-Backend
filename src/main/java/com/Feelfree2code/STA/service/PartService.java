package com.Feelfree2code.STA.service;

import com.Feelfree2code.STA.model.domain.PartDTO;
import com.Feelfree2code.STA.model.viewModel.PartAddVM;
import com.Feelfree2code.STA.model.viewModel.PartUpdateVM;
import com.Feelfree2code.STA.model.viewModel.PartVM;
import com.Feelfree2code.STA.subStructure.IPartRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartService implements IBaseService<PartVM, PartAddVM, PartUpdateVM, PartDTO> {

    private IPartRepository repository;

    public PartService(IPartRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<List<PartVM>> get() {
        return null;
    }

    @Override
    public ResponseEntity<PartVM> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<PartDTO> add(PartAddVM model) {
        return null;
    }

    @Override
    public ResponseEntity<PartDTO> update(Integer id, PartUpdateVM model) {
        return null;
    }

    @Override
    public ResponseEntity<PartVM> delete(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<PartVM>> getIsDeleted(boolean showIsDeleted) {
        return null;
    }
}
