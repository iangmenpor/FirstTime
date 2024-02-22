package com.ianM.firstTime.features.domain;

import java.io.File;

public class CreateFileUseCase {
    private final FileRepository fileRepository;

    public CreateFileUseCase(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public File execute(String filename){
        return fileRepository.save(filename);
    }
}
