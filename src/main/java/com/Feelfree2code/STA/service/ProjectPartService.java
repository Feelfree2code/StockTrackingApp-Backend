package com.Feelfree2code.STA.service;

import com.Feelfree2code.STA.model.domain.ProjectPartDTO;
import com.Feelfree2code.STA.model.viewModel.ProjectPartAddVM;
import com.Feelfree2code.STA.model.viewModel.ProjectPartUpdateVM;
import com.Feelfree2code.STA.model.viewModel.ProjectPartVM;
import com.Feelfree2code.STA.subStructure.IProjectPartRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectPartService implements IBaseService<ProjectPartVM, ProjectPartAddVM,
        ProjectPartUpdateVM, ProjectPartDTO> {

    private final IProjectPartRepository repository;

    public ProjectPartService(IProjectPartRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<List<ProjectPartVM>> get() {
        return null;
    }

    @Override
    public ResponseEntity<ProjectPartVM> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<ProjectPartDTO> add(ProjectPartAddVM model) {
        return null;
    }

    @Override
    public ResponseEntity<ProjectPartDTO> update(Integer id, ProjectPartUpdateVM model) {
        return null;
    }

    @Override
    public ResponseEntity<ProjectPartVM> delete(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<ProjectPartVM>> getIsDeleted(boolean showIsDeleted) {
        return null;
    }
}
