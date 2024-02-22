package com.ianM.firstTime.features.domain;

import java.io.File;

public class GetCountUseCase {
    private final FileRepository fileRepository;

    public GetCountUseCase(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public int execute(File filename){
        return fileRepository.getContador(filename);
    }
}
